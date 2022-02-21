FROM openjdk:8u92-jdk-alpine
RUN mkdir -p /app
WORKDIR /app
COPY MemoryEater.java .
RUN javac MemoryEater.java
ENV JAVA_OPTS="-XX:HeapDumpPath=/app/dump -XX:+HeapDumpOnOutOfMemoryError"
ENV SLEEP_PERIOD="1000"
CMD java $JAVA_OPTS MemoryEater