import java.util.Scanner;
/** @Bibek Gupta
*
*
*
*/
public class HelloWorld {
	// This is a single comment line
	public static void main(String[] args){
		/* multi line
		  comments */
		  int myAge = 22;
		  char mySex = 'M';
		  double myHeight = 5.7;
		  String name;
		  Scanner inputDevice = new Scanner(System.in);
		  
		System.out.println("I am " + myAge + " years old."); 
		System.out.println("Hello CIS2323"); 
		System.out.println("I am a " + mySex);
		System.out.println("My height is " + myHeight);
		
		System.out.println("What is your name? ");
		name = inputDevice.nextLine();
		System.out.println("Hello " + name + " welcome to class.");
	}
}
