/*
public = access modifier = Allow us to define of our code, or even someone else's code,
can access a particular element.

class = The class name will be the text following the keyword, so FirstClass in this case.

left and right curly braces = Define the class code block, or class body.
*/

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello, Matheus");

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

/* ternary operator -> structure:
operand1 ? operand2 : operand3 */
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

// operator precedence and operator challenge
// step 1: create a double variable with a value of 20.00
        double myFirstValue = 20.00d;

// step 2: create a second variable of type double with a value 80.00
        double mySecondValue = 80.00d;

// step 3: add both numbers together, then multiply by 100.00
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

/* step 4: use the remainder operator, to figure out what the remainder from the
result of the operation in step three, and 40.00, will be */
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);

/* step 5: create a boolean variable that assigns the value true, if the remainder in
step four is 0.00 false if it's not zero */
        boolean isNoRemainder = (theRemainder == 0) ? true : false;

// step 6: output the boolean variable just to see what the result is
        System.out.println("isNoRemainder = " + isNoRemainder);

/* step 7: write an if-then statement that displays a message, 'got some remainder',
if the boolean in step five is not true */
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
