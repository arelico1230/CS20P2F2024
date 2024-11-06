/*
Program: Metricconversion.java          Date: November 6, 2024

Purpose: User picks the type of conversion they want between metric and imperial then the program converts the desired measurement

Name: Richard Chang
School: CHHS
Course: Computer Science 20
*/
package mastery;

import java.util.Scanner;

public class Metricconversion {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            
            //switch case for each metric conversion choice
            switch (choice) {
            
            //runs case 1 when user picks 1
                case 1:
                	//prompt user for input
                    System.out.print("Enter inches: ");
                    //holds user input
                    double inches = in.nextDouble();
                    //takes user input and applies inchestocm method to it
                    System.out.println(inches + " inches is equal to " + inchestocm(inches) + " centimeters");
                    break;
                    
                  //runs case 2 when user picks 2
                case 2:
                	//prompt user for input
                    System.out.print("Enter centimeters: ");
                  //holds user input
                    double cm = in.nextDouble();
                    System.out.println(cm + " centimeters is equal to " + cmtoinches(cm) + " inches");
                    break;
                    
                  //runs case 3 when user picks 3
                case 3:
                	//prompt user for input
                    System.out.print("Enter feet: ");
                  //holds user input
                    double feet = in.nextDouble();
                  //takes user input and applies inchestocm method to it
                    System.out.println(feet + " feet is equal to " + feettocm(feet) + " centimeters");
                    break;
                    
                  //runs case 4 when user picks 4
                case 4:
                	//prompt user for input
                    System.out.print("Enter centimeters: ");
                  //holds user input
                    cm = in.nextDouble();
                  //takes user input and applies inchestocm method to it
                    System.out.println(cm + " centimeters is equal to " + cmtofeet(cm) + " feet");
                    break;
                    
                  //runs case 5 when user picks 5
                case 5:
                	//prompt user for input
                    System.out.print("Enter yards: ");
                  //holds user input
                    double yards = in.nextDouble();
                  //takes user input and applies inchestocm method to it
                    System.out.println(yards + " yards is equal to " + yardstom(yards) + " meters");
                    break;
                    
                  //runs case 6 when user picks 6
                case 6:
                	//prompt user for input
                    System.out.print("Enter meters: ");
                  //holds user input
                    double m = in.nextDouble();
                  //takes user input and applies  method to it
                    System.out.println(m + " meters is equal to " + mtoyards(m) + " yards");
                    break;
                    
                  //runs case 7 when user picks 7
                case 7:
                	//prompt user for input
                    System.out.print("Enter miles: ");
                  //holds user input
                    double miles = in.nextDouble();
                  //takes user input and applies miletokm method to it
                    System.out.println(miles + " miles is equal to " + miletokm(miles) + " kilometers");
                    break;
                    
                  //runs case 8 when user picks 8
                case 8:
                	//prompt user for input
                    System.out.print("Enter kilometers: ");
                  //holds user input
                    double km = in.nextDouble();
                  //takes user input and applies kmtomile method to it
                    System.out.println(km + " kilometers is equal to " + kmtomile(km) + " miles");
                    break;

            }
        }
    
	
	//methods that returns a double value so that it can be more precise than an int value
	
    public static double inchestocm(double inch) {
    	//changes the number of inches the user input into centimeters
        return inch * 2.54;}
    
    public static double cmtoinches(double cm) {
    	//changes the number of centimeters the user input into inches
        return cm / 2.54;}
    
    public static double feettocm(double feet) {
    	//changes the number of feet the user input into centimeters
        return feet * 30;}
    
    public static double cmtofeet(double cm) {
    	//changes the number of centimeters the user input into feet
        return cm / 30;}
    
    public static double yardstom(double yards) {
    	//changes the number of yards the user input into meters
    	return yards * 0.91;}
    
    public static double mtoyards(double m) {
    	//changes the number of meters the user input into yards
        return m / 0.91;}
    
    public static double miletokm(double miles) {
    	//changes the number of miles the user input into kilometers
        return miles * 1.6;}
    
    public static double kmtomile(double km) {
    	//changes the number of kilometers the user input into miles
        return km / 1.6;
    }
/*
Screen dump test 1:
Metric Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
Enter your choice: 5
Enter yards: 100
100.0 yards is equal to 91.0 meters

Test 2:
Metric Conversion Menu
1. Inches to Centimeters
2. Centimeters to Inches
3. Feet to Centimeters
4. Centimeters to Feet
5. Yards to Meters
6. Meters to Yards
7. Miles to Kilometers
8. Kilometers to Miles
Enter your choice: 1
Enter inches: 2021
2021.0 inches is equal to 5133.34 centimeters
*/
}
