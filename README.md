# JMath [![Build Status](https://travis-ci.org/Cypaubr/JMath.svg?branch=master)](https://travis-ci.org/Cypaubr/JMath)
JMath is an extended mathematics utils library providing a bunch of functionnalities (e.g. functions derivatives, analytical geometry, matrix calculation etc. (take a look to the Wiki if you want the full list of features)).

## Installing
For the moment, the only way to install JMath is to build your own JAR library from the master branch (see the Wiki for the 'how to'). Don't worry, I will set up a Bintray repository for the first version and each version will be available in the 'Release' section of GitHub as JAR.

## Example
Here is a simple utilisation of JMath:  
```java
//creating 3 points
Point A = new Point(2,4);  
Point B = new Point(0,0);  
Point C = new Point(7.5,9);  

Triangle t = new Triangle(A,B,C); //creating a triangle from the 3 points

System.out.println("Permimeter of the triangle is:" + t.getPerimeter()); //side length are auto-calculated with perimeter
```

## Contributing
Everyone can contribute to Jmath by adding features, correcting bugs and improve tests. The only rules are:
+ You must push your modifications on a separated Git branch
+ You must write unit tests (with JUnit) and these tests must me compliant with the other tests (take a look to the tests on the master branch to get an idea) and with the Gradle Build Tool.
+ **Your tests musl all pass before you push onto your branch**, else it will not be merged into the master branch and your modifications will be ignored... forever...

