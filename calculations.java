/*
 * calculations.java
 * 
 * Copyright 2020 thuer <thuer@DESKTOP-0P4CK0R>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class calculations {
	
	public static void main (String[] args) {
		/* calculating with numbers (int) & numbers as result */
		
		byte a = 5;
		byte b = 3;
		boolean c;
	
		c = a != b;
		System.out.println(c);
		
		
		int g = 5;
		int h = 2;
		System.out.println("same datatype int: " + g / h);
		System.out.println("same datatype int: " + h / g);
	
		System.out.println("same datatype int mit modulo-Restwert: " + g % h);
		
		double k = 5.2;
		double l = 2;
		System.out.println("same datatype double: " + k / l);
		
		int i = 5;
		double j = 2;
		System.out.println("different datatype: " + i / j);
		
		
	/* calculating with bytes & boolean (true/false) as result */
		byte d = 1;
		byte e = 0;
		boolean f;
	
		f = d == e;
		System.out.println("boolean: " + f);
		
		
		
	
		
		
		
		
	}
}

