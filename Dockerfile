FROM bellsoft/liberica-openjdk-alpine:11.0.16
COPY ./fruitbox ./src/fruitbox
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/fruitbox/Main.java
CMD java -classpath out fruitbox.Main

