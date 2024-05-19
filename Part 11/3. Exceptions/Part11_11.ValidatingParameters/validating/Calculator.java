/*
============== Java Programming II ==============
Part 11
Section 3 - Exzceptions
Ex 11 - validating parameters


Implement a program that handles invalid input given by the user by throwing Exceptions.
=================================================
*/

package validating;

public class Calculator {

    public int factorial(int num) {
        
        if (num < 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        
        if (setSize < 0 || subsetSize < 0) {
            throw new IllegalArgumentException("Parameters should be positive.");
        }
        
        if (subsetSize > setSize) {
            throw new IllegalArgumentException("Subset size should not exceed the set size.");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
