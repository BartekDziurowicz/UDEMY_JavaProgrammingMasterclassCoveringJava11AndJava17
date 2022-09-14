package academy.learnprogramming;

public class ReverseArray {

    public void reverse(int[] intArray){
        for(int i=0;i<intArray.length/2;i++){
            int temp = intArray[i];
            intArray[i]=intArray[intArray.length-i-1];
            intArray[intArray.length-i-1]=temp;
        }
    }

}
