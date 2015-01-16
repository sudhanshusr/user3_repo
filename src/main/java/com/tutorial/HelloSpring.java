package com.tutorial;

public class HelloSpring { 
	
	private String message;
	public HelloSpring() {
		// TODO Auto-generated constructor stub
		System.out.println("Bean instantiated");
	}

		public void setMessage(String message){
		this.message  = message;
}

//		public String toString() {
//			return "HelloSpring [message=" + message + "]";
//		}
		
	public String getMessage(){
  System.out.println("Your Message : " + message);
  return message;
}

}
