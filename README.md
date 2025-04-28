## To see that the value of max-header-size is not applied to this application's response header:
1. Download the application 
2. Open the application within IntelliJ and run the application
3. From a command line, execute the following command: `curl 'http://localhost:8080/test-response-header-size' -i `
4. Read the contents of response header 'custom-response-header'

## To see that the value of max-header-size is not applied to request/response headers involved in http requests made FROM this application:
1. Download the application
2. Open the application within IntelliJ and run the application
3. From a command line, execute the following command: `curl 'http://localhost:8080/make-backend-request' -i `
4. Read the contents of response body

## Micronaut 4.7.6 Documentation

- [User Guide](https://docs.micronaut.io/4.7.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/4.7.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/4.7.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
- [Micronaut Gradle Plugin documentation](https://micronaut-projects.github.io/micronaut-gradle-plugin/latest/)
- [GraalVM Gradle Plugin documentation](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html)
## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)


## Feature micronaut-aot documentation

- [Micronaut AOT documentation](https://micronaut-projects.github.io/micronaut-aot/latest/guide/)


## Feature ksp documentation

- [Micronaut Kotlin Symbol Processing (KSP) documentation](https://docs.micronaut.io/latest/guide/#kotlin)

- [https://kotlinlang.org/docs/ksp-overview.html](https://kotlinlang.org/docs/ksp-overview.html)


