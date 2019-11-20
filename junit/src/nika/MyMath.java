package nika;

public class MyMath {
    public int sum(int[] numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;
        }
        return sum;
    }

    public boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
