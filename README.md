Hello world examples running Groovlets with Jetty.

| subproject        | platform            | groovy jar version | groovy-servlet jar version | jetty version    | port |
|-------------------|---------------------|--------------------|----------------------------|------------------|------|
| groovy4_javax7    | javax/EE7/JDK8+     | 4.0.24             | 4.0.24                     | 9.4.56.v20240826 | 8007 |
| groovy4_javax8    | javax/EE8/JDK11+    | 4.0.24             | 4.0.24                     | 10.0.21          | 8008 |
| hybrid_javax8     | javax/EE8/JDK11+    | 5.0.0-SNAPSHOT     | 4.0.24                     | 10.0.21          | 8080 |
| groovy5_jakarta9  | jakarta/EE9/JDK11+  | 5.0.0-SNAPSHOT     | 5.0.0-SNAPSHOT             | 12.0.16          | 9009 |
| groovy5_jakarta10 | jakarta/EE10/JDK11+ | 5.0.0-SNAPSHOT     | 5.0.0-SNAPSHOT             | 12.0.16          | 9010 |
| groovy5_jakarta11 | jakarta/EE11/JDK17+ | 5.0.0-SNAPSHOT     | 5.0.0-SNAPSHOT             | 12.1.0.alpha0    | 9011 |

In each subproject, the server is started with the `run.groovy` script (`run` task) and the Groovlet is in `info.groovy`.

Output (http:\//localhost:\<port>/info.groovy):

    ======
    Groovy 4 (javax/ee7)
    Groovy Server Version: 4.0.24
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/4.0.24/6d57aea3d60893307ad28021d733c40cb161b523/groovy-servlet-4.0.24.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/javax.servlet/javax.servlet-api/3.1.0/3cd63d075497751784b2fa84be59432f4905bf7c/javax.servlet-api-3.1.0.jar
    Effective Servlet Spec version: 3.1
    ======
    Groovy 4 (javax/ee8)
    Groovy Server Version: 4.0.24
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/4.0.24/6d57aea3d60893307ad28021d733c40cb161b523/groovy-servlet-4.0.24.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.eclipse.jetty.toolchain/jetty-servlet-api/4.0.6/959c5d83d08f5cddf56caff749e48b735193191b/jetty-servlet-api-4.0.6.jar
    Effective Servlet Spec version: 4.0
    ======
    Hybrid (javax/ee8)
    Groovy Server Version: 5.0.0-SNAPSHOT
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/4.0.24/6d57aea3d60893307ad28021d733c40cb161b523/groovy-servlet-4.0.24.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.eclipse.jetty.toolchain/jetty-servlet-api/4.0.6/959c5d83d08f5cddf56caff749e48b735193191b/jetty-servlet-api-4.0.6.jar
    Effective Servlet Spec version: 4.0
    ======
    Groovy 5 (jakarta9)
    Groovy Server Version: 5.0.0-SNAPSHOT
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/5.0.0-SNAPSHOT/55f8597a7235502068dd5702c08139fcd8386c17/groovy-servlet-5.0.0-SNAPSHOT.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.eclipse.jetty.toolchain/jetty-jakarta-servlet-api/5.0.2/27fce6d666a203526236d33d00e202a4136230f/jetty-jakarta-servlet-api-5.0.2.jar
    Effective Servlet Spec version: 5.0
    ======
    Groovy 5 (jakarta10)
    Groovy Server Version: 5.0.0-SNAPSHOT
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/5.0.0-SNAPSHOT/55f8597a7235502068dd5702c08139fcd8386c17/groovy-servlet-5.0.0-SNAPSHOT.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/jakarta.servlet/jakarta.servlet-api/6.0.0/abecc699286e65035ebba9844c03931357a6a963/jakarta.servlet-api-6.0.0.jar
    Effective Servlet Spec version: 6.0
    ======
    Groovy 5 (jakarta11)
    Groovy Server Version: 5.0.0-SNAPSHOT
    groovy-servlet jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/org.apache.groovy/groovy-servlet/5.0.0-SNAPSHOT/55f8597a7235502068dd5702c08139fcd8386c17/groovy-servlet-5.0.0-SNAPSHOT.jar
    jetty API jarfile:/Users/paulk/.gradle/caches/modules-2/files-2.1/jakarta.servlet/jakarta.servlet-api/6.1.0/1169a246913fe3823782af7943e7a103634867c5/jakarta.servlet-api-6.1.0.jar
    Effective Servlet Spec version: 6.1
    ======
