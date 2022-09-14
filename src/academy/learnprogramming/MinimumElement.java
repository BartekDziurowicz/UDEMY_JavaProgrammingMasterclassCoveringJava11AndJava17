package academy.learnprogramming;

import java.util.Scanner;

public class MinimumElement {

    private Scanner sc = new Scanner(System.in);

    public int readInteger(){
        System.out.println("Enter number of elements:");
        return sc.nextInt();
    }

    public int[] readElements(int count){
        int[] intArray = new int[count];
        System.out.println("Enter "+count+" elements:");
        while(count>0){
            intArray[count-1] = sc.nextInt();
            count--;
        }
        return intArray;
    }

    public int findMin(int[] intArray){
        int min = intArray[0];
        for(int i=0;i<intArray.length;i++){
            if(min>intArray[i])
                min=intArray[i];
        }
        return min;
    }

}
