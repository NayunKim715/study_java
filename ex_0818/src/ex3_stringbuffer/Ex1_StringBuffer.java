package ex3_stringbuffer;

public class Ex1_StringBuffer {
    public static void main(String[] args) {
        
       String str = "안녕";//암시적 객체 생성. class 중에 new 없이 객체 만들 수 있는 건 String밖에 없다
       str = "반갑습니다";
       str += "!";
       System.out.println(str);

       StringBuffer sb = new StringBuffer("안녕");//이건 암시적 객체 생성 안됨. 명시적.
       sb.setLength(0);//안녕하세요 사라짐
       sb.append("반가워요");
       sb.append("!!!");
       System.out.println( sb.toString() );


    }//main
}

//stack과 heap 삽화설명