FROM adoptopenjdk/openjdk16

ENV HEALTH_PORT 8080

COPY target/firts-0.0.1-SNAPSHOT.jar ./

EXPOSE $HEALTH_PORT

CMD java -jar firts-0.0.1-SNAPSHOT.jar
