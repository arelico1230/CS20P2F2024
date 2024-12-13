/*

Program: Coursegrades.java          Date: December 12th, 2024

Purpose: contains methods to prompt user for student's test grades and print out student averages and test averages

Author: Richard Chang
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

import java.util.Scanner;

public class Gradebook {
	
	//array to store each of the students 5 test grades
			int[][] grades;
			
			//Lets the user input values
			Scanner in = new Scanner(System.in);
			
			//constructor method
			public Gradebook() {
				
				//initialize the array with 12 students and 5 test grades for each student
				int [] [] grades = new int[12][5];
			}
			
			
			public void getGrades() {
				//loop through each student and asks user to enter each students grades then stores in the array
				for(int student = 0; student < grades.length; student++) {
					System.out.println("Student " + (student + 1));
					for (int test = 0; test< grades[test].length; test++) {
						System.out.print("Please enter grade for test " + (test + 1) + ": " );
						grades[student][test] = in.nextInt();}
					}
			}
			
			public void showGrades() {
				//loops through each student's grades and outputs them below an output statement of the student whos grades are being displayed
				for(int student = 0; student < grades.length; student++) {
					System.out.println("Student " + (student + 1));
					for (int test = 0; test< grades[test].length; test++) {
						System.out.println("Grade for test " + (test + 1) + ": " + grades[student][test] + "%");}
				}
			}

			
			public double studentAvg(int student) {
				//takes int student to show which student it is then adds all their tests grades and returns that sum divided by 5 which is the average
				double avg = 0;
				for (int test = 0; test < grades[student].length; test++) {
					avg += grades[(student)][test];
				}
				//returns the average of the student
				return (avg/5);			
			}
			
			
			public double testAvg(int testNum) {
				//takes int testNum then adds all students grades on the test and divides by 12 to get the average
				int avrg = 0;
				for(int student = 0; student < grades.length; student++) {
					avrg += grades[student][testNum-1];
				}
				//returns the average of a test
				return (avrg/12);
			}
		}