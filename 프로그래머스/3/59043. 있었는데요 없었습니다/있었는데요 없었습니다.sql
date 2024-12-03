-- 코드를 입력하세요
-- 보호 시작일 보다 입양일이 더 빠른 동물의 아이디 animal_ins => 보호 시작일 보호 시작일이 더 커야 한다.
SELECT a.animal_id, a.name from animal_ins a join animal_outs b on a.animal_id = b.animal_id where a.datetime > b.datetime order by a.datetime;