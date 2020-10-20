package io.github.valentyn.nahai.basics.operators;

/*
 * Task:
 * Change the following program to use compound assignments.
 * The compound assignments look like: =+, =-, =% and so on.
 */
public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int totalResult = 20;
        
        totalResult = totalResult + 30;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult - 43;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult * 4; 
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult / 8; 
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult % 7;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult % 7;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult += 30;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult -= 15;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult /=2;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult *=4;
        System.out.println("Total result: " + totalResult);
        
        totalResult = totalResult %=5;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult &=15;
        System.out.println("Total result: " + totalResult);
        
        totalResult = totalResult |=25;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult <<=5;
        System.out.println("Total result: " + totalResult);

        totalResult = totalResult >>=5;
        System.out.println("Total result: " + totalResult);
        
    }
}
