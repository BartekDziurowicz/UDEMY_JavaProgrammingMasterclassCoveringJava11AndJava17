package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(array);
        System.out.println(Arrays.toString(array));

    }
}
