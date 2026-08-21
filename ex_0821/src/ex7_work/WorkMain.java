package ex7_work;

public class WorkMain {
    public static void main(String[] args) {
        //가장 큰 값 : 20
        int[] arr = { 1, 11, 7, 20, 13, 15 };
        //int[] arr = { 1, 11, 7, 20, V, A }; //숫자 2개를 알파벳으로 2개 오류 알려줌. 

        WorkSub ws = new WorkSub();
        int res = ws.getBigger(arr);

        System.out.println("가장 큰 값 : " + res);
    
    }//main

}
