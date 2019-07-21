# task_03_sortingOfTriangles

* To build project execute in cmd: 
> mvn clean install

* To run application execute in cmd:
// success scenarios
> java -jar .\task_03_sortingOfTriangles\target\triangles-jar-with-dependencies.jar

> the second step through the input field (e.g): Triangle first, 3.0, 4.0, 5.0
> the second step through the input field (e.g): Triangle 2, 1.0, 1.0, 1.0

// fail scenarios
>   the first step via cmd:
> java -jar .\task_03_sortingOfTriangles\target\triangles-jar-with-dependencies.jar

>   the second step through the input field (e.g.): Triangle
>   the second step through the input field (e.g.): Triangle first, 3.0, 4.0, 5.0, 6.0
>   the second step through the input field (e.g.): Triangle first, 3.0, aaa, 5.0
>   the second step through the input field (e.g.): Triangle first, a, bb, ccc