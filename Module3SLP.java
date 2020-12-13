import java.util.*;
import java.util.ArrayList;

public class Module3SLP {

    // Write a Java program that inserts 25 random integers ranging from 0 to 100
    // into an ArrayList in ascending order. The program should then output
    // the numbers and display the sum and average of the numbers.
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            int randomInt = (int) (100.0 * Math.random());
            list.add(randomInt);

        }
        Collections.sort(list);
        int averageScore = 0;
        int totalScore = 0;
        for (int i = 0; i < list.size(); i++) {
            totalScore += list.get(i);
        }
        averageScore = totalScore / list.size();
        System.out.println("Array of random integers between 1 and 100 : " + list);
        System.out.println("Sum of random array values : " + totalScore);
        System.out.println("Average of random array values : " + averageScore);

    }
}