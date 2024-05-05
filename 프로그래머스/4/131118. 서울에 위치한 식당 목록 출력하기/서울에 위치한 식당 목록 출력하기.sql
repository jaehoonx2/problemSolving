SELECT A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS,
       (SELECT NVL(ROUND(AVG(REVIEW_SCORE), 2), 0) FROM REST_REVIEW WHERE REST_ID = A.REST_ID) AS SCORE
FROM REST_INFO A,
(
    SELECT A.REST_ID
    FROM REST_INFO A,
         REST_REVIEW B
    WHERE  A.ADDRESS LIKE '서울%'
    AND A.REST_ID = B.REST_ID (+)
    GROUP BY A.REST_ID
    HAVING COUNT(B.REST_ID) >= 1
) K
WHERE A.REST_ID = K.REST_ID
ORDER BY SCORE DESC, A.FAVORITES DESC;