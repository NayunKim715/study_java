package src4.ex1_multi_for;

public class Ex8_multiFor {
    public static void main(String[] args) {
        /*
         * 1 2 3 4 5 6 7 8 9 10
         * 2 3 4 5 6 7 8 9 10 1
         * 3 4 5 6 7 8 9 10 1 2
         * ......
         * 10 1 2 3 4 5 6 7 8 9
         * (총 100개의 숫자 찍힘)
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num = (i + j) % 10 + 1;

                System.out.print(num + " ");
            } // inner
            System.out.println();
        } // outer

    }// main
}