# Descriptive Statistics from a CSV File 

## Introduction:

This is an example of how to obtain descriptive statistics from a CSV file.

## Maven configuration:

If you’re using Maven, simply add this dependency:
```xml
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-math3</artifactId>
    <version>3.6.1</version>
</dependency>
        
<dependency>
    <groupId>com.opencsv</groupId>
    <artifactId>opencsv</artifactId>
    <version>4.6</version>
</dependency>
```

## Employee.csv
```
EmployeeID,FirstName,LastName,Salary
1,FirstName1,LastName1,10000
2,FirstName2,LastName2,20000
3,FirstName3,LastName3,30000
4,FirstName4,LastName4,40000
5,FirstName5,LastName5,50000
```

## Example of output:

```
Mean: 30000.0
Median: 30000.0
StdDev: 15811.388300841896
Min: 10000.0
Max: 50000.0
Sum: 150000.0
```

## References:
1. https://commons.apache.org/proper/commons-math/userguide/stat.html
1. https://www.baeldung.com/apache-commons-math
1. https://www.programcreek.com/java-api-examples/?api=org.apache.commons.math3.stat.descriptive.DescriptiveStatistics
1. https://www.javainterviewpoint.com/how-to-read-and-parse-csv-file-in-java/
1. https://www.baeldung.com/java-csv-file-array
