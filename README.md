Hello world examples running Groovlets with Jetty.

| subproject | groovy jar version | groovy-servlet jar version | jetty version | port |
|------------| ---- | ---- | ---- | ---- |
| groovy4    | 4.0.24 | 4.0.24 | 10.0.21 | 8084 |
| hybrid     | 5.0.0-SNAPSHOT | 4.0.24 | 10.0.21 | 8083 |
| groovy5    | 5.0.0-SNAPSHOT | 5.0.0-SNAPSHOT | 12.0.16 | 8085 |
| groovy5e11 | 5.0.0-SNAPSHOT | 5.0.0-SNAPSHOT | 12.1.0.alpha0 | 8086 |

In each subproject, the server is started with the `run.groovy` script (`run` task) and the Groovlet is in `info.groovy`.

Output (http:\//localhost:\<port>/info.groovy):

    ======
    Groovy 4

    Groovy Server Version: 4.0.24

    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/4.0.24/6d57aea3d60893307ad28021d733c40cb161b523/groovy-servlet-4.0.24.jar

    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.eclipse.jetty.toolchain/jetty-servlet-api/4.0.6/959c5d83d08f5cddf56caff749e48b735193191b/jetty-servlet-api-4.0.6.jar

    Effective Servlet Spec version: 4.0

    You have invoked this Groovlet 1 times.
    ======
    Hybrid

    Groovy Server Version: 5.0.0-SNAPSHOT

    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/4.0.24/6d57aea3d60893307ad28021d733c40cb161b523/groovy-servlet-4.0.24.jar

    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.eclipse.jetty.toolchain/jetty-servlet-api/4.0.6/959c5d83d08f5cddf56caff749e48b735193191b/jetty-servlet-api-4.0.6.jar

    Effective Servlet Spec version: 4.0

    You have invoked this Groovlet 1 times.
    ======
    Groovy 5 (e10)

    Groovy Server Version: 5.0.0-SNAPSHOT

    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/5.0.0-SNAPSHOT/55f8597a7235502068dd5702c08139fcd8386c17/groovy-servlet-5.0.0-SNAPSHOT.jar

    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/jakarta.servlet/jakarta.servlet-api/6.0.0/abecc699286e65035ebba9844c03931357a6a963/jakarta.servlet-api-6.0.0.jar

    Effective Servlet Spec version: 6.0

    You have invoked this Groovlet 1 times.
    ======
    Groovy 5 (e11)

    Groovy Server Version: 5.0.0-SNAPSHOT

    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/5.0.0-SNAPSHOT/55f8597a7235502068dd5702c08139fcd8386c17/groovy-servlet-5.0.0-SNAPSHOT.jar

    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/jakarta.servlet/jakarta.servlet-api/6.1.0/1169a246913fe3823782af7943e7a103634867c5/jakarta.servlet-api-6.1.0.jar

    Effective Servlet Spec version: 6.1

    You have invoked this Groovlet 1 times.
    ======
