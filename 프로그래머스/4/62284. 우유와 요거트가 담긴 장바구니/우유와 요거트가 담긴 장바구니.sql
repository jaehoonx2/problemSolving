SELECT DISTINCT MILK.CART_ID
FROM CART_PRODUCTS MILK,
     CART_PRODUCTS YOGURT
WHERE MILK.NAME = 'Milk'
  AND YOGURT.NAME = 'Yogurt'
  AND MILK.CART_ID = YOGURT.CART_ID
ORDER BY MILK.CART_ID ASC;