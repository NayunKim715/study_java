package src4.ex1_multi_for;

public class Ex3_multiFor {
    public static void main(String[] args) {

        // A B C D
        // E F G H
        // I J K L

        char ch = 'A';
        for ( int i = 1; i <= 3; i++ ) {

            for ( int j = 1; j <= 4; j++ ) {
                System.out.printf(ch++ + " "); //후행증가 시켜야
                //System.out.printf(++ch + " "); //선행증가면 B부터 시작 
            }//inner
            System.out.println();//안쪽 for문 빠져나와 줄바꿈

        }//outer
    }// main
}