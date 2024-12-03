-- 코드를 입력하세요
SELECT a.product_code, sum(a.price * b.sales_amount) sales from product a join offline_sale b on a.product_id = b.product_id group by a.product_code ORDER BY sales DESC,a.PRODUCT_CODE;
;