package src4.ex6_work;

public class Ex3_work {
    public static void main(String[] args) {
        
        //주사위 두 개를 던졌을 때
        //합이 5, 6, 7이 되는 경우의 수를 찾아 출력
        //-----------------
        //5 : 1 4  2 3  3 2  4 1
        //6 : 1 5  2 4  3 3  4 2  5 1
        //7 : 1 6  2 5  3 4  4 3  5 2  6 1
        String five = ""; //틀린 건 아니지만 null로 넣으면 아예 공간 자체가 없음. 
        String six = "";
        String seven = "";
        //null을 +=으로 이어붙이면 문자열로 인식해버림. 빈값으로 초기화하자.

        for( int i = 1; i <= 6; i++ ){
           for( int j = 1; j <= 6; j++ ){

           int res = i + j;

           switch( res ){
             case 5:
                five += i + " " + j + "  "; //문자열은 누적해서 이어붙여야. String 타입의 변수는 이어붙이는 게 불가능
                break;

             case 6:
                six += i + " " + j + "  ";
                break;
             
             case 7:
                seven += i + " " + j + "  ";
                break;

           }//switch


           }//inner

        }//outer

        System.out.println("5 : " + five);
        System.out.println("6 : " + six);
        System.out.println("7 : " + seven);

    }//main
}
//교훈 2개 - 영상보고