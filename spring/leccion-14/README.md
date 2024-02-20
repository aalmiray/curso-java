# Spring Boot (2)

## Conceptos

 - crear una aplicación en https://start.spring.io
 - spring-data para acceso de datos

## Comandos

```
$ docker run --name mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=admin mysql:8
$ docker exec -it mysql mysql -p
  mysql> create database db_example;
  mysql> create user 'springuser'@'%' identified by 'ThePassword';
  mysql> grant all on db_example.* to 'springuser'@'%';

$ ./mvnw verify
$ java -jar target/leccion-14-1.0.0-SNAPSHOT.jar
$ curl http://localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
$ curl http://localhost:8080/demo/all
```