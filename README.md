```text 
 ,--. ,--.,--.                    ,--.                         ,------.
 |  .'   /`--' ,---. ,--,--,      |  | ,--,--.,--.  ,--.,--,--.|  .-.  \  ,---.,--.  ,--.
 |  .   ' ,--.| .-. :|      \,--. |  |' ,-.  | \  `'  /' ,-.  ||  |  \  :| .-. :\  `'  /
 |  |\   \|  |\   --.|  ||  ||  '-'  /\ '-'  |  \    / \ '-'  ||  '--'  /\   --. \    /
 `--' '--'`--' `----'`--''--' `-----'  `--`--'   `--'   `--`--'`-------'  `----'  `--'
```
---
## Prerequisite
- Install JDK 17+ 
- Install Maven 3.5+
- Install IntelliJ 

---
## Technical Stacks
- Java 17
- Maven 3.5+
- Spring Boot 3.2.*
- Spring Data Validation
- Spring Data JPA
- Postgres
- Lombok
- DevTools
- Docker, Docker compose...

---
## Thiết lập Gmail
Để cho phép gửi email qua Gmail ta cần thực hiện 2 bước sau

- Step 1: Cho phép xác thực 2 nhân tố: https://myaccount.google.com/signinoptions/two-step-verification/enroll-welcome
- Step 2: Tạo app chỉ định password: https://myaccount.google.com/apppasswords
- Step 3: Gán thông tin vào mail sender

```
spring.mail.username=kienjd
spring.mail.password=xxx
```