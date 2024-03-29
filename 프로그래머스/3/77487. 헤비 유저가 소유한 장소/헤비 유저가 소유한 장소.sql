SELECT A.*
FROM PLACES A,
(
    SELECT HOST_ID
    FROM PLACES
    GROUP BY HOST_ID
    HAVING COUNT(*) > 1
) K
WHERE A.HOST_ID = K.HOST_ID
ORDER BY A.ID ASC;