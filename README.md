# spring-commons-words-server
### to run each on of the server:

mvn spring-boot:run -Dspring.profiles.active=subject  
mvn spring-boot:run -Dspring.profiles.active=verb  
mvn spring-boot:run -Dspring.profiles.active=article  
mvn spring-boot:run -Dspring.profiles.active=adjective  
mvn spring-boot:run -Dspring.profiles.active=noun  

The urls are:
* to retrieve the main service
{host_ip}:{port_number}/  

To retrieve the server info (actuator)
{host_ip}:{port_number}/actuator/info

To retrive the "isAlive" service:
{host_ip}:{port_number}/serviceName
