package servlet.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
/**
 * 
 * Date-24/01/2020
 * 
 * Time Taken-1hour (all Set up)
 * 
 * Simple Demonstrate of Servlet
 * ---------------------------------------
 * 
 *       Tool Required
 *       -----------------
 *       -Eclipse IDE EE
 *       -Apache Tomcat jar File (Add at the Time of Creating Dynamic Project/Project)
 *       -Servlet api.jar File   (Add at ->Right click on Project-Build Path->Configure Build Path ->Classpath ->Add External Jar ->Select From Your Existing Folder or File
 *       
 *       
 *       How to Do
 *       ----------------
 *       -Right click on Src Folder ->New ->Servlet 
 *       -Go to Web content Folder-> Right click->Html file ->Create Simple Login Form
 * 
 * @author giveu
 *
 */
@WebServlet("/connect")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletExample() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 *doGet() this method is used for showing URL path
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		 
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
//		Taking name from Html Page (get.Parameter() method help to Load 
		
		String name=request.getParameter("Name");
		String password=request.getParameter("Password");
		
//		All Are In String Declaration Bcz It Only Take String type 
		
		
//		This Is Simple Use To Print on Console  
		System.out.println(name);
		System.out.println(password);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/**
	 *doPost() this method is used for to Hide URL Path On Browser
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
