import groovy.servlet.GroovyServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.ee10.servlet.ServletContextHandler

var server = new Server(8085)
var handler = new ServletContextHandler('/', ServletContextHandler.SESSIONS)
server.setHandler(handler)
var runDir = new File(System.getProperty('user.dir')).name
// adjust resource base to support two most common places to run script:
// using the Gradle task run or running the script directly in IDE
handler.baseResourceAsString = runDir == 'groovy' ? '.' : 'src/main/groovy'
handler.addServlet(GroovyServlet, '*.groovy')
server.start()
server.join()
