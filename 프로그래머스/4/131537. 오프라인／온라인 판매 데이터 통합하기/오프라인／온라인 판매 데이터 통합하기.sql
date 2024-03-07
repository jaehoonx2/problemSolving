SELECT *
FROM
(
    SELECT
    TO_CHAR(A.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
    ,A.PRODUCT_ID
    ,A.USER_ID
    ,A.SALES_AMOUNT
    FROM ONLINE_SALE A
    WHERE TO_CHAR(A.SALES_DATE, 'YYYYMM') = '202203'

    UNION ALL

    SELECT
    TO_CHAR(B.SALES_DATE, 'YYYY-MM-DD') AS SALES_DATE
    ,B.PRODUCT_ID
    ,NULL AS USER_ID
    ,B.SALES_AMOUNT
    FROM OFFLINE_SALE B
    WHERE TO_CHAR(B.SALES_DATE, 'YYYYMM') = '202203'
) K
ORDER BY K.SALES_DATE ASC, PRODUCT_ID ASC, USER_ID ASC;