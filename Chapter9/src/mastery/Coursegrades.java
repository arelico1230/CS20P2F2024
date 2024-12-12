/*

Program: Coursegrades.java          Date: December 12th, 2024

Purpose: asks for 12 students 5 tests grades and finds average of students and tests using the methods from Gradebook

Author: Richard Chang
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

import java.util.Scanner;

public class Coursegrades {
		public static void main(String[] args) {
			
			//Lets the user input values
			Scanner in = new Scanner(System.in);
			
			//create Gradebook object to connect Gradebook to Coursegrades
			Gradebook g = new Gradebook();
			
			//uses getGrades method to prompt user for the 5 test grades for each of the 12 students
			g.getGrades();
			
			//uses showgGrades method to output the grades of all the students
			g.showGrades();
			
			//prompt user for the student's average they want to see
			System.out.print("Please enter the students number to see their average: ");
			
			//stores user input as varaible
			int studentnum = in.nextInt();;
			
			//makes studentnum the parameter for studentAvg method then outputs return statement of that testAvg as the students's average
			System.out.print("Their average is: " + g.studentAvg(studentnum)+ "%");
			
			//line to make space
			System.out.println("");
			
			//prompts user for what test average they want to see
			System.out.print("Please enter the test number to see the average: ");
			
			//stores user input as variable
			int testnum = in.nextInt();
			
			//makes testnum as parameter for testAvg method then outputs the return statement of testAvg as the test's average
			System.out.println("The tests average is: " + g.testAvg(testnum) + "%");
			
		}

	}


/*
Screen dump

Test case 1:

Student 1
Please enter grade for test 1: 56
Please enter grade for test 2: 78
Please enter grade for test 3: 89
Please enter grade for test 4: 90
Please enter grade for test 5: 65
Student 2
Please enter grade for test 1: 43
Please enter grade for test 2: 23
Please enter grade for test 3: 76
Please enter grade for test 4: 89
Please enter grade for test 5: 09
Student 3
Please enter grade for test 1: 76
Please enter grade for test 2: 65
Please enter grade for test 3: 45
Please enter grade for test 4: 34
Please enter grade for test 5: 23
Student 4
Please enter grade for test 1: 89
Please enter grade for test 2: 87
Please enter grade for test 3: 76
Please enter grade for test 4: 89
Please enter grade for test 5: 45
Student 5
Please enter grade for test 1: 90
Please enter grade for test 2: 99
Please enter grade for test 3: 98
Please enter grade for test 4: 76
Please enter grade for test 5: 31
Student 6
Please enter grade for test 1: 12
Please enter grade for test 2: 87
Please enter grade for test 3: 76
Please enter grade for test 4: 56
Please enter grade for test 5: 45
Student 7
Please enter grade for test 1: 67
Please enter grade for test 2: 78
Please enter grade for test 3: 89
Please enter grade for test 4: 90
Please enter grade for test 5: 43
Student 8
Please enter grade for test 1: 45
Please enter grade for test 2: 87
Please enter grade for test 3: 97
Please enter grade for test 4: 94
Please enter grade for test 5: 12
Student 9
Please enter grade for test 1: 52
Please enter grade for test 2: 78
Please enter grade for test 3: 54
Please enter grade for test 4: 23
Please enter grade for test 5: 90
Student 10
Please enter grade for test 1: 76
Please enter grade for test 2: 45
Please enter grade for test 3: 89
Please enter grade for test 4: 32
Please enter grade for test 5: 43
Student 11
Please enter grade for test 1: 5
Please enter grade for test 2: 56
Please enter grade for test 3: 78
Please enter grade for test 4: 99
Please enter grade for test 5: 95
Student 12
Please enter grade for test 1: 85
Please enter grade for test 2: 
5
Please enter grade for test 3: 65
Please enter grade for test 4: 89
Please enter grade for test 5: 90
Student 1
Grade for test 1: 56%
Grade for test 2: 78%
Grade for test 3: 89%
Grade for test 4: 90%
Grade for test 5: 65%
Student 2
Grade for test 1: 43%
Grade for test 2: 23%
Grade for test 3: 76%
Grade for test 4: 89%
Grade for test 5: 9%
Student 3
Grade for test 1: 76%
Grade for test 2: 65%
Grade for test 3: 45%
Grade for test 4: 34%
Grade for test 5: 23%
Student 4
Grade for test 1: 89%
Grade for test 2: 87%
Grade for test 3: 76%
Grade for test 4: 89%
Grade for test 5: 45%
Student 5
Grade for test 1: 90%
Grade for test 2: 99%
Grade for test 3: 98%
Grade for test 4: 76%
Grade for test 5: 31%
Student 6
Grade for test 1: 12%
Grade for test 2: 87%
Grade for test 3: 76%
Grade for test 4: 56%
Grade for test 5: 45%
Student 7
Grade for test 1: 67%
Grade for test 2: 78%
Grade for test 3: 89%
Grade for test 4: 90%
Grade for test 5: 43%
Student 8
Grade for test 1: 45%
Grade for test 2: 87%
Grade for test 3: 97%
Grade for test 4: 94%
Grade for test 5: 12%
Student 9
Grade for test 1: 52%
Grade for test 2: 78%
Grade for test 3: 54%
Grade for test 4: 23%
Grade for test 5: 90%
Student 10
Grade for test 1: 76%
Grade for test 2: 45%
Grade for test 3: 89%
Grade for test 4: 32%
Grade for test 5: 43%
Student 11
Grade for test 1: 5%
Grade for test 2: 56%
Grade for test 3: 78%
Grade for test 4: 99%
Grade for test 5: 95%
Student 12
Grade for test 1: 85%
Grade for test 2: 5%
Grade for test 3: 65%
Grade for test 4: 89%
Grade for test 5: 90%
Please enter student whose average you want: 12
Their average is: 66.8%
Please which test's average you want to see: 5
The average is: 49.0%


Test case 2:

Student 1
Please enter grade for test 1: 12
Please enter grade for test 2: 12
Please enter grade for test 3: 12
Please enter grade for test 4: 12
Please enter grade for test 5: 12
Student 2
Please enter grade for test 1: 76
Please enter grade for test 2: 76
Please enter grade for test 3: 76
Please enter grade for test 4: 76
Please enter grade for test 5: 76
Student 3
Please enter grade for test 1: 99
Please enter grade for test 2: 99
Please enter grade for test 3: 99
Please enter grade for test 4: 99
Please enter grade for test 5: 99
Student 4
Please enter grade for test 1: 78
Please enter grade for test 2: 87
Please enter grade for test 3: 87
Please enter grade for test 4: 87
Please enter grade for test 5: 87
Student 5
Please enter grade for test 1: 60
Please enter grade for test 2: 60
Please enter grade for test 3: 60
Please enter grade for test 4: 60
Please enter grade for test 5: 60
Student 6
Please enter grade for test 1: 34
Please enter grade for test 2: 34
Please enter grade for test 3: 34
Please enter grade for test 4: 34
Please enter grade for test 5: 34
Student 7
Please enter grade for test 1: 34
Please enter grade for test 2: 45
Please enter grade for test 3: 56
Please enter grade for test 4: 6
Please enter grade for test 5: 76
Student 8
Please enter grade for test 1: 78
Please enter grade for test 2: 89
Please enter grade for test 3: 6
Please enter grade for test 4: 5
Please enter grade for test 5: 45
Student 9
Please enter grade for test 1: 99
Please enter grade for test 2: 65
Please enter grade for test 3: 54
Please enter grade for test 4: 78
Please enter grade for test 5: 89
Student 10
Please enter grade for test 1: 87
Please enter grade for test 2: 65
Please enter grade for test 3: 54
Please enter grade for test 4: 34
Please enter grade for test 5: 76
Student 11
Please enter grade for test 1: 23
Please enter grade for test 2: 54
Please enter grade for test 3: 76
Please enter grade for test 4: 87
Please enter grade for test 5: 89
Student 12
Please enter grade for test 1: 09
Please enter grade for test 2: 89
Please enter grade for test 3: 76
Please enter grade for test 4: 56
Please enter grade for test 5: 45
Student 1
Grade for test 1: 12%
Grade for test 2: 12%
Grade for test 3: 12%
Grade for test 4: 12%
Grade for test 5: 12%
Student 2
Grade for test 1: 76%
Grade for test 2: 76%
Grade for test 3: 76%
Grade for test 4: 76%
Grade for test 5: 76%
Student 3
Grade for test 1: 99%
Grade for test 2: 99%
Grade for test 3: 99%
Grade for test 4: 99%
Grade for test 5: 99%
Student 4
Grade for test 1: 78%
Grade for test 2: 87%
Grade for test 3: 87%
Grade for test 4: 87%
Grade for test 5: 87%
Student 5
Grade for test 1: 60%
Grade for test 2: 60%
Grade for test 3: 60%
Grade for test 4: 60%
Grade for test 5: 60%
Student 6
Grade for test 1: 34%
Grade for test 2: 34%
Grade for test 3: 34%
Grade for test 4: 34%
Grade for test 5: 34%
Student 7
Grade for test 1: 34%
Grade for test 2: 45%
Grade for test 3: 56%
Grade for test 4: 6%
Grade for test 5: 76%
Student 8
Grade for test 1: 78%
Grade for test 2: 89%
Grade for test 3: 6%
Grade for test 4: 5%
Grade for test 5: 45%
Student 9
Grade for test 1: 99%
Grade for test 2: 65%
Grade for test 3: 54%
Grade for test 4: 78%
Grade for test 5: 89%
Student 10
Grade for test 1: 87%
Grade for test 2: 65%
Grade for test 3: 54%
Grade for test 4: 34%
Grade for test 5: 76%
Student 11
Grade for test 1: 23%
Grade for test 2: 54%
Grade for test 3: 76%
Grade for test 4: 87%
Grade for test 5: 89%
Student 12
Grade for test 1: 9%
Grade for test 2: 89%
Grade for test 3: 76%
Grade for test 4: 56%
Grade for test 5: 45%
Please enter the students number to see their average: 1
Their average is: 12.0%
Please enter the test number to see the average: 3
The tests average is: 57.0%
*/