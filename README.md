# Sample Spring Cloud Config Client

This is an example APP that load its configurations from a server using Spring Cloud Features.

You can found server implementation in: https://github.com/alcastic/sample-spring-cloud-config-server

## Build and Run app
To build and run using **development** profile:

    $ ./gradlew clean build & java -jar build/libs/sample-spring-cloud-config-client-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=development

To build and run using **production** profile:

    $ ./gradlew clean build & java -jar build/libs/sample-spring-cloud-config-client-0.0.1-SNAPSHOT.jar -Dspring.profiles.active=production
