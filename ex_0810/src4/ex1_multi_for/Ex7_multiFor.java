package src4.ex1_multi_for;

public class Ex7_multiFor {
    public static void main(String[] args) {
        // 2단부터 9단까지 이중 for문으로 다 찍기
        // 2 x 1 = 2 3 x 1 = 3 4 x 1 = 4 ... 9 x 1 = 9
        // ...
        // 2 x 9 = 18 3 x 9 = 27 4 x 9 = 36 ... 9 x 9 = 81

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf(
                    "%d x %d = %d\t", j, i, j * i);
                 } // inner
            System.out.println();
        } // outer

    }// main
}
//i=1일 때 j는 2에서 9까지 8회전. 
// 그럼 앞에 i가 아닌 j가 먼저 들어가는 게 맞다.
