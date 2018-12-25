# spring-commons-words-server  
### to run each one in separated command:

mvn spring-boot:run -Dspring.profiles.active=subject  
mvn spring-boot:run -Dspring.profiles.active=verb  
mvn spring-boot:run -Dspring.profiles.active=article  
mvn spring-boot:run -Dspring.profiles.active=adjective  
mvn spring-boot:run -Dspring.profiles.active=noun  

### to run all word servers in a single command:

##### mvn spring-boot:run -Dspring.profiles.active=subject & mvn spring-boot:run -Dspring.profiles.active=verb & mvn spring-boot:run -Dspring.profiles.active=article & mvn spring-boot:run -Dspring.profiles.active=adjective & mvn spring-boot:run -Dspring.profiles.active=noun  


The urls are:
* to retrieve the main service  
{host_ip}:{port_number}/  

* to retrieve the server info (actuator)  
{host_ip}:{port_number}/actuator/info

* to retrive the "isAlive" service:  
{host_ip}:{port_number}/serviceName

### to run limiting the max memory usage (only using the jar file):  

##### java -jar -Xmx64m -Dspring.profiles.active=PROFILE_TO_RUN spring-commons-words-server-1.0.0.0.jar
