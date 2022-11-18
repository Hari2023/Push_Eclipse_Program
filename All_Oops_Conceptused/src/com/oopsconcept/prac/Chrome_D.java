package com.oopsconcept.prac;

public class Chrome_D implements Web_D {

	private void Testing() {
		System.out.println("Software Test");

	}
	
	@Override
	public void Java() {
     System.out.println("OOPS");		
	}

	@Override
	public void Selenium() {
System.out.println("Automation");		
	}

	public static void main(String[] args) {
		Chrome_D s = new Chrome_D();
		Web_D s1 = new Chrome_D();//----> Upcasting
        s.Testing();
		s1.Java();
		s1.Selenium();

	}

	

}
