IDENTITY 전략
* 기본 키를 디비에서 생성(AUTO_INCREMENT)
* persist() 이후 시점에 조회가 가능함(내부적으로 세팅해줌)

SEQUENCE
* persist() 할때 시퀀스를 디비에 조회하고 commit 시점에 insert allocationSize는 미리 디비에서 가지고옴