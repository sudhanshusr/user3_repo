package helloTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.tutorial.HelloSpring;

import junit.framework.TestCase;



public class HHelloSpringTest extends TestCase {

	 

	HelloSpring he=new HelloSpring();
	
	
	@Test
	public void testGetMessage()
	{
		
		he.setMessage("Hello World!");
		assertEquals(he.getMessage(),"Hello World!");		
	   }
	
  
	
	
	}

