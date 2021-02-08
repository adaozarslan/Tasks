package dev.ada.execution;

import java.util.Scanner;

public class Task1 {

	/*
	 * 
	 * Author: Ada Ozarslan 
	 * Date: 2th of February 2021
	 * Github:https://github.com/adaozarslan
	 * 
	 * 
	 */


	public static void main(String[] args) {

		// gives info and insight about the program
		System.out.println("* To see your grading please enter the specified points");
		System.out.println("* Grades are assesed over 100, so please be careful to write points above 0 and below 100");
		System.out.println();

		// creates a scanner for the grade inputs
		Scanner input = new Scanner(System.in);
		int examGrade1;
		System.out.println("Enter first midterm grade:");
		examGrade1 = input.nextInt();

		int examGrade2;
		System.out.println("Enter second midterm grade:");
		examGrade2 = input.nextInt();

		int examGrade3;
		System.out.println("Enter final grade:");
		examGrade3 = input.nextInt();

		System.out.println();

		// making sure that result are accurate as the input is an integer but average
		// can be a double
		double average = ((double) examGrade1 + (double) examGrade2 + (double) examGrade3) / 3;

		// creates the constraints for the letter grades
		String letterGrade = "";

		if (average >= 90) {
			letterGrade = "A";
		} else if (90 > average && average >= 80) {
			letterGrade = "B";
		} else if (80 > average && average >= 70) {
			letterGrade = "C";
		} else if (70 > average && average >= 60) {
			letterGrade = "D";
		} else if (60 > average) {
			letterGrade = "F";
		}

		// Prints the whole report of grade results
		System.out.println("   -OVERALL REPORT-");
		System.out.println("First Midterm Grade :" + examGrade1);
		System.out.println("Second Midterm Grade:" + examGrade2);
		System.out.println("Final Grade         :" + examGrade3);
		System.out.println("---------------------");
		System.out.println("Average             :" + average);
		System.out.println("Letter Grade        :" + letterGrade);
		
		// Lets you know if you failed
		if (60 > average) {
			System.out.println();
			System.out.println("You failed from this course!");
		}

	}
}
