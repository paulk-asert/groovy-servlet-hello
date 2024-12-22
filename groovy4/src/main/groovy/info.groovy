if (!session) {
    session = request.getSession(true)
}
count = session.getAttribute('count') ?: 1
session.setAttribute('count', count + 1)

html.html {
    head {
        title request.servletName
    }
    body {
        h1 'Groovy 4'
        h2 "Groovy Server Version: $GroovySystem.version"
        h2 'groovy-servlet jar' + groovy.servlet.GroovyServlet.protectionDomain.codeSource.location
        h2 'jetty API jar' + javax.servlet.http.HttpServlet.protectionDomain.codeSource.location
        h3 "Effective Servlet Spec version: ${context.effectiveMajorVersion}.${context.effectiveMinorVersion}"
        h3 "You have invoked this Groovlet $count times."
    }
}
