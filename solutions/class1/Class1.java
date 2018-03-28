public class Class1 {
    public static void main(String[] args) {
        //Assignment 1
        System.out.println("Hello World it's Christine!");

        //Assignment 2
        boolean firstGdiClass = false;
        int programmingLanguagesIKnow = 4;

        System.out.println("This is my first GDI class: " + firstGdiClass);
        System.out.println("Programing Languages I know now: " + programmingLanguagesIKnow);
        programmingLanguagesIKnow++;
        System.out.println("By the end of this class I'll know: " + programmingLanguagesIKnow);

        /**
         * Enter the number 7
         Multiply by the month of your birth
         Subtract 1
         Multiply by 13
         Add the day of your birth
         Add 3
         Multiply by 11
         Subtract the month of your birth
         Subtract the day of your birth
         Divide by 10
         Add 11
         Divide by 100
         */

        double birthdayTrick = 7;
        birthdayTrick = birthdayTrick * 8;
        birthdayTrick--;
        birthdayTrick *= 13;
        birthdayTrick += 22; // insert your birth day here
        birthdayTrick += 3;
        birthdayTrick *=11;
        birthdayTrick -= 8; // insert your birth month here
        birthdayTrick -=22; // insert your birth day here
        birthdayTrick /= 10;
        birthdayTrick += 11;
        birthdayTrick /= 100;
        System.out.println("My Birthday is: " + birthdayTrick);

        //Assignment 3

        if (birthdayTrick > 3.20 && birthdayTrick < 6.21) {
            System.out.println("Spring Birthday");
        } else if (birthdayTrick >= 6.21 && birthdayTrick <= 9.21) {
            System.out.println("Summer Birthday");
        } else if (birthdayTrick >= 9.22 && birthdayTrick <= 12.20) {
            System.out.println("Fall Birthday");
        } else {
            System.out.println("Winter Birthday");
        }
    }
}
