package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		double xvalue = 0.0;
		double yvalue = 0.0;
		double width = 1;
		double length = 0.3333;
		
		StdDraw.setPenColor(a,b,c);
		
		StdDraw.filledRectangle(xvalue, yvalue, width, length);
		
		
		
		StdDraw.setPenColor(0,0,0);
		
		StdDraw.filledRectangle(0, 1, 1, 0.33333);
		
		StdDraw.setPenColor(160,32,240);
		StdDraw.filledCircle(0.5, 0.5, 0.33);
		
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledCircle(0.5, 0.5, 0.23);
		
		StdDraw.setPenColor(160,32,240);
		StdDraw.filledCircle(0.5,0.5,0.13);
		
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledCircle(0.5, 0.5, 0.03);
		
		
		
		
		
	}
}