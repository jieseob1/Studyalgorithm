-- 코드를 입력하세요
# SELECT product_id,max(price) from food_product;
select * from food_product where price = (select max(price) from food_product);