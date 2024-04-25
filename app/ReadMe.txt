## Maintainability
1. 경기도 의정부시 문충로74 지역의 단기예보를 확인
2. 단기 예보 데이터는 공공데이터 포털의 기상청_단기예보 ((구)_동네예보) 조회서비스를 사용

## Confirmation
1. 서버간 API 연동에 대한 이해도 확인
2. 코드의 가독성을 통한 개발자의 코드 작성 기술과 방식 파악

## Stack
1. SpringBoot
2. MySQL
3. JPA

## API
1. POST요청 시 공공데이터포털의 API를 호출하여 바로 DB에 적재
2. GET요청 시 DB에 저장된 데이터를 조회,
	단, 데이터가 없을 경우 Http status 204오류를 응답해야 함.
	
## Caution
1. 연동 시 RestTemplate를 사용, UrlConnection을 직접 여는 코드는 사용하지 않음
2. 코드의 가독성은 가능한 좋아야 함 
3. 멀티 모듈로 구성하는 것을 잊지 말고, 각 모듈은 최대한 작게, 높은 응집도