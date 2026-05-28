# Web의 동작원리
## Client(클라이언트)와 Server(서버)
- Client: 브라우저를 통해서 요청(request)을 보내는 주체
(ex- 매일 구글링하는 나)
- Server: 클라이언트의 요청을 수신해 처리한 다음 요청에 대한 응답(response)을 전달하는 주체
## HTTP와 URL
### HTTP : HyperText Transfer Protocol
- HyperText: 다른 페이지, 리소스로 이동할 수 있는 링크

### URL : Uniform Resource Locator
    https://www.google.com/search?q=techit

- https://
  - Protocol(프로토콜): 통신규칙
- www.google.com
  - Host(호스트): 서버의 주소, google.com을 호스트 네임이라고 지칭
- /search
  - Path(경로): 호스트 내 서비스의 위치, 서비스 별로 분할(검색, 회원 등)
- ?q=techit
  - Query String(쿼리 문자열): ?기호로 시작, &로 연결, 키/값 쌍으로 구성