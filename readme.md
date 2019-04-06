# my-app project

Maven generates this project. I updated JUnit to 4.12 from 4.11
I also added maven-compiler-plugin to support Java 1.8.

## Run

To run tests:

```bash

mvn clean test
mvn clean package
jar -tf target/my-app-1.0-SNAPSHOT.jar
java -cp target/my-app-1.0-SNAPSHOT.jar edu.harrisburgu.cisc525.app.Main Johnny
```

The output should be, `Hello, Johnny from 169.254.67.210/32744@SaintGoretti`
