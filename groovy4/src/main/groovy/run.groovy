import groovy.servlet.GroovyServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler

var server = new Server(8084)
var handler = new ServletContextHandler(server, '/', ServletContextHandler.SESSIONS)
var runDir = new File(System.getProperty('user.dir')).name
// adjust resource base to support two most common places to run script:
// using the Gradle task run or running the script directly in IDE
handler.resourceBase = runDir == 'groovy' ? '.' : 'src/main/groovy'
handler.addServlet(GroovyServlet, '*.groovy')
server.start()
server.join()
