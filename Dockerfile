FROM openjdk:11

ENV JAR 'bu-devops-spring-sandbox.jar'

COPY target/"$JAR" "$JAR"

CMD java -jar "$JAR"