package nika;

public class Main {

    public static void main(String[] args) {
        MyMath m = new MyMath();

        int[] arr = new int[]{1, 2, 5, 6, 4};

        System.out.println(m.sum(arr));
        System.out.println(m.isEven(4));
    }
}
