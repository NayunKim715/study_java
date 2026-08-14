public class Ex07_work {
    public static void main(String[] args) {
       //구구단을 2단부터 9단까지 출력
       //2 x 1 = 2     3 x 1 = 3    4 x 1 = 4 ... 9 x 1 = 9
       // ...
       //2 x 9 = 19    3 x 9 = 27 ............... 9 x 9 = 81

    for( int i = 1; i <= 9; i++ ){
       for( int j = 2; j <= 9; j++ ){
        System.out.printf(
            "%d x %d = %2d\t", j, i, j * i);
        }//inner
    System.out.println();
    }//outer
 }//main
}
//다음 주 금요일 출제 예고