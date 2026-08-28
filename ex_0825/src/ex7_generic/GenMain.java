package ex7_generic;

public class GenMain {
    public static void main(String[] args) {
        GenTest<String> g1 = new GenTest<String>();
        g1.setValue("안녕");
        String res = g1.getValue();
        System.out.println("g1 : " + res);

        GenTest<Interger> g2 = new GenTest<Interger>();
        g2.setValue(100); //value:
        int res2 = g2.getValue();
        System.out.println("g2 : " + res2);

        //g2.obj = (int)100;
        //g2.obj = (String)"abc";
        //String str = (String)g2.obj;

        
    }//main
}
