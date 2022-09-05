package academy.learnprogramming;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount>=0 || smallCount>=0 || goal>=0){
            while(bigCount>0 && goal>4){
                bigCount--;
                goal-=5;
            }
            while(smallCount>0 && goal>0){
                smallCount--;
                goal--;
            }
            if(goal==0){
                return true;
            }
        }
        return false;
    }

}
