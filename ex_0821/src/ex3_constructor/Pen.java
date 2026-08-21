package ex3_constructor;

public class Pen {
    
    private String name;
    private int price;
    private String color;
    boolean limited;

    public Pen(){ 
        //limited를 파라미터로 받는 생성자 호출
        this(false); //내 자신의 생성자. this = Pen
        /* 효율적이지 못한 코드 */
        //name = "모나미153";
        //price = 500;
        //color = "흰색";
        //limited = false;
    }

    //한정판 생성을 위한 오버로딩 생성자 - 생성자도 오버로딩 가능. 파라미터 다름.
    public Pen( boolean limited ){ //public Pen()이라는 똑같은 이름의 생성자는 불가
        this.limited = limited;

        if( limited ){ //limited == true
            name = "모나미153-G";
            price = 20000;
            color = "금색";
        }else{
            name = "모나미153";
            price = 500;
            color = "흰색";
        }
    }

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("색상 : " + color);

        if( !limited ){ //limited == false
            System.out.println("일반판 / " + color);
        }else{
            System.out.println("한정판 / " + color);
        }

        //System.out.println("일반판");
        System.out.println("---------------");
    }
}
//예전 모나미에서 2만원짜리 금색, 은색 볼펜 출시한 적