package org.example.additional;
//Make a function that returns the value multiplied by 50 and increased by 6.
// If the value entered is a string it should return "Error".

public class Task3 {
    public static void main(String[] args) {

        int result = getNumber(15);

        System.out.println(result);
    }

    public static int getNumber(int num) {

        return num * 50 + 6;

    }
}
