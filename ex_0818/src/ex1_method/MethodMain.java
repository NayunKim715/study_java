package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
        
        MethodTest m1 = new MethodTest();
        m1.test1();

        int su = 100;
        //m1.test2( su );
        //String res = m1.test2( su );
        int res = m1.test2( su );

        //System.out.println("su : " + su); //여전히 su는 100
        System.out.println("su : " + res);
    
    }//main
}
