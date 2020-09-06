/*

Description:
We want to generate a function that computes the series starting from 0 and ending until the given number following the sequence:
0 1 3 6 10 15 21 28 36 45 55 ....
which is created by
0, 0+1, 0+1+2, 0+1+2+3, 0+1+2+3+4, 0+1+2+3+4+5, 0+1+2+3+4+5+6, 0+1+2+3+4+5+6+7 etc..

Input: LastNumber
Output: series and result

Example:

Input: 6
Output: 0+1+2+3+4+5+6 = 21

Input: -15
Output: -15 < 0

Input: > 0
Output: 0 = 0

*/

import java.util.Arrays;
import java.util.Scanner;

public class SequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        int sequence = scanner.nextInt();
        System.out.println("Output:");
        System.out.println(showSequence(sequence));
    }

    public static String showSequence(int value) {
        String res1 = "";
        String result="";
        if (value < 0){
            System.out.println(value < 0);
        }
        if (value == 0){
            System.out.println(value == 0);
        }
        if (value > 0){
            int sum = 0;
            for (int i = 0; i <= value ; i++) {
                sum = sum + i;
                res1 = res1 + i + "+";
            }
            result = res1.substring(0, res1.length()-1)+ " = " + sum;
        }

        return result;
    }
}
