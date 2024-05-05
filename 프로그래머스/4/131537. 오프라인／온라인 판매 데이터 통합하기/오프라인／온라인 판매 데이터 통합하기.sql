SELECT *
  FROM
        (
            SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') SALES_DATE,
                   PRODUCT_ID,
                   USER_ID,
                   SALES_AMOUNT
              FROM ONLINE_SALE
             WHERE 1=1
               AND YEAR(SALES_DATE) = 2022
               AND MONTH(SALES_DATE) = 03

            UNION ALL

            SELECT DATE_FORMAT(SALES_DATE, '%Y-%m-%d') SALES_DATE,
                   PRODUCT_ID,
                   NULL USER_ID,
                   SALES_AMOUNT
              FROM OFFLINE_SALE
             WHERE 1=1
               AND YEAR(SALES_DATE) = 2022
               AND MONTH(SALES_DATE) = 03
        ) A
 ORDER BY A.SALES_DATE, A.PRODUCT_ID, A.USER_ID;
