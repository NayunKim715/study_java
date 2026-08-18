package ex2_method;

public class Test {
    /*
    public void average( int su1, int su2, int su3 ){
       int num = su1 + su2 + su3 / 3;
       if( num > 50 ){
       System.out.println("합격");
       }else{
        System.out.println("불합격");
       }
    */
    public String average( int su1, int su2, int su3 ){   
       int num = su1 + su2 + su3 / 3;
       if( num > 50 ){
         return "합격";
       }else{
        return "불합격";
       }
     }
}
//선생님 추가설명 4:19
