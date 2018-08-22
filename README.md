# Sample Spring Cloud Config Client

This is an example APP that load its configurations from a server using Spring Cloud Features.

You can found server implementation in: https://github.com/alcastic/sample-spring-cloud-config-server

## Run app

1. Run app without using server config:
    
    1. Into the file ./src/main/resources/bootstrap.yml set property **spring.cloud.enabled** to **false**
    
    2. from command line execute:

           $ ./gradlew bootRun
           
    3. To see result:
           
           $ curl -v "http://localhost:8080/greeting"

2. Run app using **development** profile loaded from server config:

    1. Make sure [sample-spring-cloud-config-server](https://github.com/alcastic/sample-spring-cloud-config-server) is running locally in the port 8888

    2. Into the file ./src/main/resources/bootstrap.yml set property **spring.cloud.enabled** to **true**
    
    3. From command line execute:

           $ ./gradlew bootRun -Dspring.profiles.active=development

    4. To see result:

           $ curl -v "http://localhost:8090/greeting"

3. Run app using using **production** profile loaded from server config:

    1. Make sure [sample-spring-cloud-config-server](https://github.com/alcastic/sample-spring-cloud-config-server) is running locally in the port 8888

    2. Into the file ./src/main/resources/bootstrap.yml set property **spring.cloud.enabled** to **true**

    3. from command line execute:

           $ ./gradlew bootRun -Dspring.profiles.active=production
        
    4. To see result:

           $ curl -v "http://localhost:9000/greeting"
