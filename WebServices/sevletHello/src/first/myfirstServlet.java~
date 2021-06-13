
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {
	private String message;
    public void init() throws ServletException{
    		message= "Hey Beu!";
    }
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
    	response.setContentType("text/html");
    	
    	PrintWriter out= response.getWriter();
    	out.print("<h1>"+message+"</h1>");	
    }
    public void destroy(){	
    }
}



<web-app>
	<servlet>
		<servlet-name>ServletLifeCycle</servlet-name>
		<servlet-class>ServletLifeCycle</servlet-class>	
	</servlet>

	<servlet-mapping>
		<servlet-name>ServletLifeCycle</servlet-name>
		<url-pattern>/ServletLifeCycle</url-pattern>	
	</servlet-mapping>
</web-app>
