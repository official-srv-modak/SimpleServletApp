import jakarta.servlet.http.HttpServlet;

public class HelloWorld extends HttpServlet{
	
	public void init(){ 
		System.out.println("Hello");
	}

}
