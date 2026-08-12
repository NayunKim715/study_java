package ex1_array;

public class Ex3_array {
    public static void main(String[] args) {
        
        char[] ch = new char[4];
        
        // J, A, V, A 각각의 방(0,1,2,3)에 넣기
        ch[0] = 'J'; //배열이 문자type -> ''필수. 
        ch[1] = 'A';
        ch[2] = 'V';
        ch[3] = 'A';
        //ch[4] = '!';//index 4개뿐이라 오류

        // 각 요소 출력
        for(int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
            //System.out.println();//JAVA가 세로로 출력
        }
        System.out.println();
        System.out.println("--------------------");

        //다른 방법
        char[] ch2 = { 'J', 'A', 'V', 'A' };
        for(int i = 0; i < ch.length; i++) {
            System.out.print( ch2[i] );
        }

        
    }//main
}
