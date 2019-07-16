# task_01_chessboard

* To build project execute in cmd: 
> mvn clean install

* To run application execute in cmd:

// success scenarios
> java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 8 9

> java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 3 4

> java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 5 5

// fail scenarios
>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar \

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 5

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar a

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar a z

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar a 5

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 5 a

>  java -jar .\task_01_chessboard\target\chessboard-jar-with-dependencies.jar 5.0 5.0