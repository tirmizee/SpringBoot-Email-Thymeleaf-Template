# SpringBoot-Email-Thymeleaf-Template

Send a mail with attachment using Spring boot email and Thymeleaf template engine.

### How to implement

- #### Add dependencies

auto-configuration Java Mail and Spring Framework's email sending support

      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-mail</artifactId>
      </dependency>

auto-configuration Thymeleaf template engine

      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
      </dependency>
          
- #### Configuration properties

      ## EMAIL CONFIGURATION
      spring.mail.default-encoding=UTF-8
      spring.mail.host=smtp.gmail.com
      spring.mail.username=tirmizee123456789@gmail.com
      spring.mail.password=rafmkkwndkgyziak
      spring.mail.port=587
      spring.mail.protocol=smtp
      spring.mail.test-connection=false
      spring.mail.properties.mail.debug=true
      spring.mail.properties.mail.smtp.auth=true
      spring.mail.properties.mail.smtp.starttls.enable=true

      ## THYMELEAF CONFIGURATION
      spring.thymeleaf.cache=false
      spring.thymeleaf.prefix=classpath:/templates/
      spring.thymeleaf.suffix=.html
      spring.thymeleaf.encoding=UTF-8

### Example

- #### Send simple mail

<p align="center">
  <img src="https://user-images.githubusercontent.com/15135199/95040174-1a242100-06fd-11eb-85e4-82b02bdd3f13.JPG" width="900">
</p>

- #### Send mail with attachments

<p align="center">
  <img src="https://user-images.githubusercontent.com/15135199/95040097-dfba8400-06fc-11eb-8f95-932c9c833e79.JPG" width="900">
</p>

- #### Send mail template

<p align="center">
  <img src="https://user-images.githubusercontent.com/15135199/95040353-9a4a8680-06fd-11eb-9e94-4eee5d1e63c7.JPG" width="900">
</p>

- #### Send mail template with list

<p align="center">
  <img src="https://user-images.githubusercontent.com/15135199/95041935-5a39d280-0702-11eb-866a-a06ebccaa34e.JPG" width="900">
</p>

### GMAIL ACCOUNT

- https://myaccount.google.com/
