package com.nttdata.calculatearea.util;

import java.util.Scanner;

public class AreaClass {

	public void SquareFeet() {
			Scanner scan_length = new Scanner(System.in);
			System.out.println("Enter the length of the room in feet to calculate the area in square feet:");
			double length = scan_length.nextDouble();			
			Scanner scan_width = new Scanner(System.in);
			System.out.println("Enter the width of the room in feet to calculate the area in square feet:");
					double width = scan_width.nextDouble();
			double s_feet = length * width;
			System.out.println("Area in square feet is: " + s_feet + " SQAURE FEET");	
			double s_meter = s_feet * 0.09290304;
			System.out.println("Area in square meter is: " + s_meter + " SQUARE METER");
		}

//	public void SquareMeter() {
//			Scanner scan_length = new Scanner(System.in);
//			System.out.println("Enter the length of the room in feet to calculate the area in square meter:");
//			double length = scan_length.nextDouble();	
//			Scanner scan_width = new Scanner(System.in);
//			System.out.println("Enter the width of the room in feet to calculate the area in square meter:");
//			double width = scan_width.nextDouble();
//			double s_feet = length * width;
//			double s_meter = s_feet * 0.09290304;
//			System.out.println("Area in square feet is:" + s_meter + "SQUARE METER");
//
//}
}