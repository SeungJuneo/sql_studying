SELECT 
    ORDER_ID,
    PRODUCT_ID,
    TO_CHAR(OUT_DATE, 'YYYY-MM-DD') OUT_DATE,
    --TO_DATE는 CHAR타입을 DATE 타입으로 바꾸는 것
    CASE WHEN TO_DATE(TO_CHAR(OUT_DATE, 'MM/DD'), 'MM/DD') <= TO_DATE('05/01','MM/DD') THEN '출고완료' 
         WHEN OUT_DATE IS NULL THEN '출고미정'
         ELSE '출고대기'
        --컬럼명 적을 떈 "쌍따음표로
        END 출고여부
FROM FOOD_ORDER
ORDER BY ORDER_ID;