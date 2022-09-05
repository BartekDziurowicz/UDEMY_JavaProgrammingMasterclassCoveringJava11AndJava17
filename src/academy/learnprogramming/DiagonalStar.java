package academy.learnprogramming;

public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number>=5){
            for(int row=1;row<=number;row++){
                for(int col=1;col<=number;col++){
                    if(row==1 || row==number || row==col || col==1 || col==number || col-1==number-row){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

}
