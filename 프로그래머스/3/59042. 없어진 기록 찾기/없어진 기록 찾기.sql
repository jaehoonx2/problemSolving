SELECT B.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A, ANIMAL_OUTS B
WHERE A.ANIMAL_ID (+) = B.ANIMAL_ID
AND A.ANIMAL_ID IS NULL
ORDER BY B.ANIMAL_ID ASC;