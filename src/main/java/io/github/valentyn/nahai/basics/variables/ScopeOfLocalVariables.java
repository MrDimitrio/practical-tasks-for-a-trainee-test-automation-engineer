package io.github.valentyn.nahai.basics.variables;

/**
 * Task:
 * Define three or more code blocks in the "main" method that include each other.
 * Then include any numbers of the different variables using any primitive data types
 * in those code of blocks.
 * Finally, to see and understand mechanism of limited access to local variables,
 * it suggests you to output all the above declared variables via System.out.println()
 * in each code of block.
 * See an example below.
 */
public class ScopeOfLocalVariables {
    public static void main(String[] args) {
        {
            int intValue = 97;
            // declare more variables of any types here
            {
                // declare another variable of any type here
                Long longValue = 123456789L;
                System.out.println("Hello"+ longValue);
                // try to output all the earlier declared variables
                System.out.println("Let's try to use 'intValue' variable.");
                System.out.println("We can do it: " + intValue);
                System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");


                {
                    // and declare two or more variable here as well
                    char charValue = 'B';

                    byte byteValue1 = 4;
                    byte byteValue = 8;
                    int x = byteValue + byteValue1;

                    System.out.println( "Before: " + x );

                    // try to output all the earlier declared variables
                    System.out.println( "Before: " + x );
                    System.out.println("intValue: " + intValue);
                    System.out.println("charValue: " + charValue);
                }
                // try to output all the earlier declared variables
                System.out.println("intValue: " + intValue);
                // We cannot use it here. Why?
                // difference types variable
                System.out.println("charValue: " + intValue);
            }
        }
        {
            // We cannot use it here. Why?
            // Not variable declaration
            int intValue = 5000;
            System.out.println("intValue: " + intValue);
        }
    }
}