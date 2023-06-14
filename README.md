# Carmen Cloud API
The Carmen Cloud API provides a set of classes and methods to leverage the features of the Adaptive Recognition's Carmen Cloud platform. With the Carmen Cloud platform, you can extract the needed information from the uploaded images, such as license plate numbers, vehicle make and model, and vehicle identification numbers (VINs). Use the [Cloud Client library](https://github.com/adaptiverecognition/carmen-cloud-client/) to invoke the Vehicle API and the Transportation&amp;Cargo API of the platform.

# Building
Before proceeding, install a [JDK](https://jdk.java.net/archive/) (must be Java 11 or later) and [Apache Maven](https://maven.apache.org/install.html).

Ensure `JAVA_HOME` is set correctly and the `mvn` executable is available on your PATH.

Run the following command in a terminal/console.
```bash
mvn clean install
```

This compiles the Cloud API into your local maven repository.
