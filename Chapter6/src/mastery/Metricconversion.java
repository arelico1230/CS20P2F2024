/*
Program: Metricconversion.java          Date: November 6, 2024

Purpose: User picks the type of conversion they want between metric and imperial then the program converts the desired measurement

Name: Richard Chang
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Metricconversion {
	public static void main(String[] args) {
		
		// Lets the user input values and makes it so that decimals only go to the hundredths
        Scanner in = new Scanner(System.in);
        DecimalFormat deca = new DecimalFormat("#.##");
        
        //prompt user for input
        System.out.print("Enter a number: ");
        
        //holds user input
        double num = in.nextDouble();
        
        //prompt user to enter a number to pick which type of metric conversion they want
            System.out.println("Metric Conversion Menu");
            System.out.println("1. Inches to Centimeters");
            System.out.println("2. Centimeters to Inches");
            System.out.println("3. Feet to Centimeters");
            System.out.println("4. Centimeters to Feet");
            System.out.println("5. Yards to Meters");
            System.out.println("6. Meters to Yards");
            System.out.println("7. Miles to Kilometers");
            System.out.println("8. Kilometers to Miles");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();
            
            //switch case for each metric conversion choice
            switch (choice) {
            
            //runs case 1 when user picks 1
                case 1:
                	
                    //takes user input and applies inchestocm method to it
                    System.out.println(num + " inches is equal to " + deca.format(inchestocm(num)) + " centimeters");
                    break;
                    
                  //runs case 2 when user picks 2
                case 2:
                  //takes user input and applies cmtoinches method to it
                    System.out.println(num + " centimeters is equal to " + deca.format(cmtoinches(num)) + " inches");
                    break;
                    
                  //runs case 3 when user picks 3
                case 3:
                  //takes user input and applies feettocm method to it
                    System.out.println(num + " feet is equal to " + deca.format(feettocm(num)) + " centimeters");
                    break;
                    
                  //runs case 4 when user picks 4
                case 4:
                	
                  //takes user input and applies cmtofeet method to it
                    System.out.println(num + " centimeters is equal to " + deca.format(cmtofeet(num)) + " feet");
                    break;
                    
                  //runs case 5 when user picks 5
                case 5:
                  //takes user input and applies yardstom method to it
                    System.out.println(num + " yards is equal to " + deca.format(yardstom(num)) + " meters");
                    break;
                    
                  //runs case 6 when user picks 6
                case 6:
                  //takes user input and applies mtoyards  method to it
                    System.out.println(num + " meters is equal to " + deca.format(mtoyards(num)) + " yards");
                    break;
                    
                  //runs case 7 when user picks 7
                case 7:
                  //takes user input and applies miletokm method to it
                    System.out.println(num + " miles is equal to " + deca.format(miletokm(num)) + " kilometers");
                    break;
                    
                  //runs case 8 when user picks 8
                case 8:
                  //takes user input and applies kmtomile method to it
                    System.out.println(num + " kilometers is equal to " + deca.format(kmtomile(num)) + " miles");
                    break;

            }
        }
    
	
	//methods that convert measurements to different types of measurements
	
    public static double inchestocm(double inch) {
    	//changes the number the user input into centimeters
        return inch * 2.54;}
    
    public static double cmtoinches(double cm) {
    	//changes the number the user input into inches
        return cm / 2.54;}
    
    public static double feettocm(double feet) {
    	//changes the number the user input into centimeters
        return feet * 30;}
    
    public static double cmtofeet(double cm) {
    	//changes the number the user input into feet
        return cm / 30;}
    
    public static double yardstom(double yards) {
    	//changes the number the user input into meters
    	return yards * 0.91;}
    
    public static double mtoyards(double m) {
    	//changes the number the user input into yards
        return m / 0.91;}
    
    public static double miletokm(double miles) {
    	//changes the number the user input into kilometers
        return miles * 1.6;}
    
    public static double kmtomile(double km) {
    	//changes the number the user input into miles
        return km / 1.6;
    }
/*
Screen dump test 1:
Enter a number: 10
Metric Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
Enter your choice: 
1
10.0 inches is equal to 25.4 centimeters

Test 2:
Enter a number: 25.4
Metric Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
Enter your choice: 
2
25.4 centimeters is equal to 10 inches

*/
}
