FROM java:8
MAINTAINER Bin Zhu "bin_zhu@comcast.com"
ADD build/libs/book-service.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
EXPOSE 8080