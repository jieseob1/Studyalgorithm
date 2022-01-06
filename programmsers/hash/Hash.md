## 해시

### 해시 구현방법

Dcitionary 라는 자료구조를 통해 해시를 제공한다.
또한 Dictionary는 dict클래스에 구현되어 있다.

### 해시 사용하기 좋을 때는?

1. 리스트를 쓸 수 없을 때:
   인덱스 값을 숫자가 아닌 다른 값인 '문자열 혹은 튜플'을 사용하고 싶을 때 딕셔너리 사용
2. 빠른 접근 /탐색이 필요할 때:
   딕셔너리의 시간복잡도: O(1)
3. 집계가 필요할 때:
   원소의 개수를 세는 문제:코테에서 많이 출제되는 문제
   collections 모듈의 Counter 클래스를 사용하면 빠르게 문제를 풀 수 있다.

### 딕셔너리와 리스트의 시간 복잡도 차이

- 딕셔너리:get,insert,update,delete,search 모두 O(1)
- 리스트:
  - insert:O(1) ~ O(N)
  - Delete:O(1) ~ O(N)
  - search:O(n)

### 따로 공부해야할 부분

- collections -> counter

## 딕셔너리 사용법

### init

1. {}사용
2. dict()함수 호출

### get

1. []사용
2. get 메소드 이용:get메소드는 get(key,x)로 사용한다 ->딕셔너리에 key가 없는 경우, x를 리턴해줘라 라는 용도
   딕셔너리를 카운터하는 경우에는 get 함수가 유용

ex)
dict = {'dog':'300'}
dict.get('dog') or dict['dog']

### set

딕셔너리에 **값을 집어넣거나**, 값을 **업데이트** 할 때 []를 사용

값 집어넣기:
dict = {'김철수': 300, 'Anna': 180}
dict['홍길동'] = 100
값 수정
dict['김철수'] = 400

직접 접근하여 값을 집어넣거나 수정한다.

### Delete

딕셔너리에서 특정 key값을 지울 때에 사용한다.

1. del dict_obj[key]:del은 키워드, 딕셔너리에 key가 없다면 keyError 발생

ex)del dict['빅터']

2. pop(key[,default]):pop은 메소드,
   pop메소드는 **key값**에 해당하는 **value**를 리턴
   key가 없다면 두번째 파라미터인 default 리턴

ex) dict.pop('빅터',180)

### iterate

딕셔너리를 for문을 이용, 조회할 때 두가지방법이 존재한다.

1. key로만 순회
   ex) for key in dict:
   print(key)

2. key,value 동시 순회(items()사용):
   for key,values for dict.items():
   print(key,value)

### 그 밖에 딕셔너리 유용 팁

1. 특정 key가 딕셔너리에 있는지 없는지 조회할 때 - in 사용하기

dict = {'김철수': 300, 'Anna': 180}
print("김철수" in dict) #True
print("김철수" not in dict) # False

2. key 또는 value만 뽑아내는 방법

1. key 만 : keys()-> ex) dict.keys()
1. value만: values() -> ex) dict.values()
1. key-value 모두: items()
   dict.items()
