-- 코드를 입력하세요
# 입양을 간 기록은 있지만, 보호소에 들어온 기록이 없ㄴ느 동물의 id,
SELECT b.animal_id, b.name from animal_ins a right join animal_outs b on a.animal_id = b.animal_id where a.animal_id is null;