FROM openjdk:8
RUN mkdir -p /app
WORKDIR /app
COPY MemoryEater.java .
RUN javac MemoryEater.java
ENV JAVA_OPTS="-XX:+UseCGroupMemoryLimitForHeap -XX:+UnlockExperimentalVMOptions"
ENV SLEEP_PERIOD="1000"
CMD ["java", "MemoryEater"]
