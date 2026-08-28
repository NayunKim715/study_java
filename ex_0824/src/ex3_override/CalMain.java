package ex3_override;

public class CalMain {
    public static void main(String[] args) {
        CalPlus cp = new CalPlus();

        //cp.

        int n = cp.getResult( 10, 20 ); // -> 30
        System.out.println(n);

        CalMinus cm = new CalMinus();
        n = cm.getResult( 15, 10 ); // -> 5
        System.out.println(n);
      


    }//main
}
//2교시 내용 다시

//java api - TREE 관계도 - Object