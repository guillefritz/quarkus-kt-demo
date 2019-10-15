
## run app w/plugin

    ./mvnw compile quarkus:dev


## run app w/jar

    ./mvnw package

### exec jar

    java -jar target/*-runner.jar

you will see this once it's up:

    2019-10-14 20:56:25,759 INFO  [io.quarkus] (main) mongodb-panache 1.0-SNAPSHOT (running on Quarkus 0.24.0) started in 0.973s. Listening on: http://0.0.0.0:8080


## play!

### add a fruit

    curl -X POST \
        http://127.0.0.1:8080/fruits \
        -H 'Content-Type: application/json' \
        -d '{
            "name": "banana",
            "description": "yellow!"
            }'

### find all fruits
    
    curl -X GET http://127.0.0.1:8080/fruits

### find by ID
    
    curl -X GET http://127.0.0.1:8080/fruits/1234