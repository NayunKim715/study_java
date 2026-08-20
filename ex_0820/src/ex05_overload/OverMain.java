package ex05_overload;

public class OverMain {
    public static void main(String[] args) {
        
        OverSub os = new OverSub();
        os.result();
        os.result( 100 );
        os.result( 'A' );
        os.result( "a" );
        os.result( 1, "a" );
        os.result( "r", 100 );

        //System.out.printInt(100);
        //System.out.printString("abc");
        System.out.println();
       //오버로드는 println이 대표적



    }//main
}
