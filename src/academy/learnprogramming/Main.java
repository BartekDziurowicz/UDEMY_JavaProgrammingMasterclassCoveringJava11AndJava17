package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        MinimumElement minimumElement = new MinimumElement();
        System.out.println("Smallest element is: "+minimumElement.findMin(minimumElement.readElements(minimumElement.readInteger())));

    }
}
