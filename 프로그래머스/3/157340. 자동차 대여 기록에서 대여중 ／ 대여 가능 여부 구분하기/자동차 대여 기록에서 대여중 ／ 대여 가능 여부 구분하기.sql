


SELECT K.CAR_ID,
       CASE WHEN (
            SELECT 1
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY A
            WHERE A.CAR_ID = K.CAR_ID
            AND TO_CHAR(A.START_DATE, 'YYYYMMDD') <= '20221016'
            AND TO_CHAR(A.END_DATE, 'YYYYMMDD') >= '20221016'           
       ) = 1 THEN '대여중' ELSE '대여 가능' END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY K
GROUP BY K.CAR_ID
ORDER BY K.CAR_ID DESC;