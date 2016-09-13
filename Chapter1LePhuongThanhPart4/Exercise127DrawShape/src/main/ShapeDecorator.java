package main;


/**
 * @author  Le Phuong Thanh
 * @version 1.0
 * @created 11-Sep-2016 4:52:08 PM
 */
public abstract class ShapeDecorator implements Shape {

	private Shape shape;



	public void finalize() throws Throwable {

	}

	public ShapeDecorator(){

	}

	public String draw(){
		return "";
	}

}