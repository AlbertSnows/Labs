/*
 * Lab7
 * AJ Snow
 * Course: CIS 200
 * Lab Section: Lab Section C / 3:30 class 

PURPOSE- This file uses the Circle class to find values for a circle given by the user 
		 and print them out. 

*/
import java.util.*; 
 
public class CircleApp 
{
 public static void main(String[ ] args) 
 {
	 Scanner keyboard = new Scanner(System.in); 
	 String color; 
	 String input; 
	 
	 double radius   = 0; 
	 
	 
	Circle circle1 = new Circle(); 
	System.out.println("Circle 1:"); 
	System.out.println("Color: " + circle1.getColor() ); 
	System.out.print("Radius: " + circle1.getRadius());
	System.out.println(); 
	System.out.printf("Area: %.3f" , circle1.findArea()); 
	System.out.println();
	System.out.printf("Circumference: %.3f" , circle1.findCircumference()); 
	System.out.println();
	System.out.printf("Surface Area: %.3f" , circle1.findSurfaceArea()); 
	System.out.println();
	System.out.printf("Volume: %.3f" , circle1.findVolume()); 
	System.out.println();
	System.out.println(); 
	
	System.out.print("Hi there! Enter the radius of your circle here: "); 
	input = keyboard.nextLine(); 
	radius = Double.parseDouble(input); 
	//System.out.println(); 
	System.out.print("Great! Now enter in the color of your circle here: "); 
	color = keyboard.nextLine(); 
	System.out.println(); 
	
	Circle circle2 = new Circle(radius, color); 
	System.out.println("Circle 2:"); 
	System.out.println("Color: " + circle2.getColor()); 
	System.out.println("Radius: " + circle2.getRadius()); 
	System.out.printf("Area: %.3f" , circle2.findArea()); 
	System.out.println();
	System.out.printf("Circumference: %.3f" , circle2.findCircumference()); 
	System.out.println();
	System.out.printf("Surface Area: %.3f" , circle2.findSurfaceArea()); 
	System.out.println();
	System.out.printf("Volume: %.3f" , circle2.findVolume());  
	System.out.println();
	System.out.println();
	
  keyboard.close(); 
 } // end main method
} // end class
