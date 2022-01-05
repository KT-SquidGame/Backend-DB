## FindU Read Me

<p align="center">
    <img src="pics/logo-com.svg"/>
</p>
<h4 align="center">드라마 '오징어 게임' 속 컨텐츠를 직접 체험할 수 있는 AI 플랫폼</h4>
<p align="center">
  <a href="#tutorial">Tutorial</a></a> • 
  <a href="#features">Features</a> •  
  <a href="#system-structure">System Structures</a> • 
  <a href="#contributor">Contributors</a> • 
  <a href="#license">License</a>
</p>
<p align="center">
    이 프로젝트는 2022 KT 하반기 인턴교육 과정 중 진해되었습니다. <br/>
    이 프로젝트는 상업적인 목적이 포함되어 있지 않습니다. 
    이 프로젝트는 팀 '우린깐부잖어'에 의해 개발되었습니다.<br/>
    해당 레포는 'AI 오징어 게임'의 웹 페이지 코드를 저장하고 있습니다.      
</p>







## Tutorial
해당 코드는 AI 오징어게임의 DB서버 코드입니다.
핵심 기능은 Client 에서 필요한 데이터 호출, 데이터 저장 요청이 올경우 Rest API 통신으로 실행이 됩니다.

<b> 실행 방법 </b>
1. 코드 다운
2. IDE에서 MainDbApplication 실행 (Inteliz IDEA 권고)

## Features

<p align="center">
    <h5>1. '무궁화 꽃이 피었습니다' 게임</h5>
	<h5>2. '달고나 깨기' 게임 </h5>
	<h5>3. '참참참' 게임</h5>
	<h5>4. 랭킹 보기</h5>
</p>

## System Structure
![AI 오징어게임 DB 설계](https://user-images.githubusercontent.com/53933920/148174102-99a813fa-4031-4d56-ae80-886e4a2f3554.png)

### 소스코드 정리

### API

- DalgonamApiController : 달고나 게임과 관련된 데이터 정보의 흐름을 위한 ControlIer
- MemberApiController: Member의 정보 흐름을 위한 Controller
- MugungwhaApiController: 무궁화 게임과 관련된 데이터 정보의 흐름을 위한 Controller

### Configuration

- WebConfig: CORS(Cross-origin resource sharing) 문제를 해결하기 위한 환경설정

### DTO

- DalgonaPointDto: 달고나 점수를 반환하기 위한 DTO
- DalgonaRankDto: 프론트에 달고나 랭킹 순위 반환을 위한 DTO
- MemberIdDto: Member Id 조회를 위한 DTO
- MemberLoginDto: 회원 가입 정보와 반환을 위한 DTO
- MugungwhaPointDto: 무궁화 점수 반환을 위한 DTO
- MugungwhaRankDtO: 무궁화 랭킹 순위 반환을 위한 DTO

### Entity

- DalgonaGame: 달고나 게임 객체
- Member: 회원 객체
- MugungwhaGame: 무궁화 게임 객체를

### Repository

- InitDB
    - InitMugungwha: 테스트 케이스 반환을 위한 DB 초기화 설정
- DalgonaQuery: 회원이 종료한 달고나 게임의 score를 저장하기 위한 DB Query
- MemberQuery: 회원의 로그인 유무를 구분하기 위한 Query
- MugungwhaQuery: 무궁화 게임 랭킹 순위를 조회하기 위한 Query
- DalgonaRepository: DB에 달고나 게임의 정보를 다루기 위한 메소드 정보 파일
- MemberRepository: DB에 회원의 정보를 다루기 위한 메소드 정보 파일
- MugungwhaRepository: DB에 무궁화 게임의 정보를 다루기 위한 메소드 정보 파일

### Service

- DalgonaService: 달고나 게임의 기능의 정보를 구현한 집합
- MemberService: 회원 기능의 정보를 구현한 집합
- MugungwhaQuery: 무궁화 게임의 기능의 정보를 구현한 집합

## Contributor

Maintainer : 김남협

Contributor : 김수연, 김서정, 김주환, 박수정, 유동헌, 윤혜정, 조민호, 전민준, 허나연


## License

MIT License
