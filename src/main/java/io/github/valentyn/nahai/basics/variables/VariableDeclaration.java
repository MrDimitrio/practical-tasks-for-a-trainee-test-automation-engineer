package io.github.valentyn.nahai.basics.variables;

/*
 * Task:
 * Declare all the possible primitive data-type variables, assign some values and output them.
 */
public class VariableDeclaration {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 30549;
        int intValue = 33;
        long longValue = 1234567890;
        float floatValue = 1434567890;
        double doubleValue = 492359419;
        char chValue = 'w';
        boolean bolValue = false;
    
        System.out.println("A \"byte\" type variable: " + byteValue);
        System.out.println("A \"short\" type variable: " + shortValue);
        System.out.println("A \"int\" type variable: " + intValue);
        System.out.println("A \"long\" type variable: " + longValue);
        System.out.println("A \"float\" type variable: " + floatValue);
        System.out.println("A \"double\" type variable: " + doubleValue);
        System.out.println("A \"char\" type variable: " + chValue);
        System.out.println("A \"boolean \" type variable: " + bolValue);
        
    }
}