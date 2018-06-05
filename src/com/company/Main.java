package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	    Relational Operators
	    < - less than
	    <= - Less than OR equal to
	    > - greater than
	    >= - greater than OR equal to
	    == - equals
	    != - not equal to

	    Logical operators
	    && - AND
	    || - OR
	    ! - NOT
	 */

	int a = 2;
	int b = 4;
	int x = 6;
	int y = 1;

	System.out.println("a = 2");
	System.out.println("b = 4");
	System.out.println("x = 6");
	System.out.println("y = 1");

//AND Operator
        if (a == x && y + y == a){
            System.out.println ("a == x && y + y == a")
          // OR Operator
         if (a == x || y + y == a)
             System.out.println ("a == x || y + y ==a")
          \*! operator
            if (a != x && y + y == a)
                System.out.println ("a != x && y + y == a ")
        }
    }
}
