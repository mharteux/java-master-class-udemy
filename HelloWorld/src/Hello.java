/*
public = access modifier = Allow us to define of our code, or even someone else's code,
can access a particular element.

class = The class name will be the text following the keyword, so FirstClass in this case.

left and right curly braces = Define the class code block, or class body.
*/

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello, Matheus");

        //if - then - Statement
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // logical AND operator
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater then second top score and less than 100");
        }

        // logical OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // assignment operator VS equals operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }
    }
}

