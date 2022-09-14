package academy.learnprogramming;

import java.util.Scanner;

public class SortedArray {

    public int[] getIntegers(int number){

        Scanner sc = new Scanner(System.in);
        int [] intArray = new int[number];
        System.out.println("Enter "+number+" integers:");

        for(int i=0;i<intArray.length;i++){
            intArray[i]=sc.nextInt();
        }

        return intArray;
    }

    public int[] sortArray(int[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return intArray;
    }

    public void printArray(int[] intArray){
        for(int i=0;i<intArray.length;i++){
            System.out.println("Element "+i+" contents "+intArray[i]);
        }
    }

}
