package src4.ex1_multi_for;

public class Ex6_multiFor {
    public static void main(String[] args) {

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 1; i <= 5; i++) {
            //for (int j = 1; j <= i; j++) { //이것도 가능
            //for (int j = 0; j < i; i++ ){ // 무한대로
            for (int j = 0; j < i; j++ ){    
                System.out.print("* ");

            } // inner
            System.out.println();
            //System.out.println();//한번 더 쓰면 엔터 두번
        } // outer
    }// main

}// class
