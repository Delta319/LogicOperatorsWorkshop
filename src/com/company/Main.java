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
        if (a == x && y + y == a) {
            System.out.println("a == x && y + y == a");
        }
        // OR Operator
        if (a == x || y + y == a) {
            System.out.println("a == x || y + y ==a");
        }
        //NOT Operator
        if (a != x && y + y == a) {
            System.out.println("a != x && y + y == a ");
        }
        //Less than <
        if (a < 4) {
            System.out.println("a is less than 6");
        }
        //Less than OR equal to
        if (a <= 2) {
            System.out.println("2 is less than OR equal to a");
        }
        if (a > 7) {
            System.out.println("a is greater than 7");
        }
        if (a >= 8) {
            System.out.println("a is greater than or equal to 8");
        }
        if (a == 2) {
            System.out.println("a equals 2");
        }
        if (a != 5) {
            System.out.println("a does not equal 5");
        }
    }
}








