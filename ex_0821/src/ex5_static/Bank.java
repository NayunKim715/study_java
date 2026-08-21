package ex5_static;

public class Bank {
    //위치와 전화번호는 지점마다 다르니 세팅
    private String point;
    private String tel;
    //float interest = 10f; //이자율 10%. 지점 상관없이.
    static float interest = 10f; //이렇게 하니, 내가 이자율 손댄 적 없는 강남, 역삼점도 이자율 바뀜.

    public Bank( String point, String tel ){
        this.point = point;
        this.tel = tel;
    }
 
    public void info(){
        System.out.println("지점 : " + point);
        System.out.println("전화 : " + tel);
        System.out.println("이자율 : " + interest + "%");
        System.out.println("-------------------");
    }

}
//stack - heap - static 삽화