/*
 * Lab7
 * AJ Snow
 * Course: CIS 200
 * Lab Section: Lab Section C / 3:30 class 

PURPOSE- This file is used by CircleApp to create,define, calculate, and return 
		 values of a circle.

*/


public class Circle 
{
	private String color;
	private double radius; 
	private final double PI = 3.14159;
////\	
	
///\/	
	public Circle()
	{
		color = "White"; 
		radius = 1.0; 
		
	}
////\
	
///\/	
	public Circle(double radiusInput, String givenColor)
	{
		radius = radiusInput; 
		color = givenColor; 
	}
////\
	
///\/	
	public String getColor()
	{
	  return color; 
	}
////\
	
///\/	
	public double getRadius()
	{
	  return radius; 
	}
////\	
	
///\/	
	public void setColor(String newColor)
	{
	  color = newColor; 
	}
////\
	
///\/	
	public void setRadius(double newRadius)
	{
	  radius = newRadius; 
	}
////\	
	
///\/	
	public double findArea()
	{
	  double circleArea = (PI * (radius * radius)); return circleArea;
	}
////\	
	
///\/	
	public double findCircumference()
	{
		double circumference = 2 * PI * radius; return circumference; 
	}
////\	
	
///\/		
	public double findSurfaceArea()
	{
		double surfaceArea = 4 * PI * (radius * radius); return surfaceArea; 
	}
////\	
	
///\/	
	public double findVolume()
	{
		double volume = (4.0/3.0) * PI * (radius * radius * radius); return volume; 
	}
////\	
	
///\/	
} // end class
