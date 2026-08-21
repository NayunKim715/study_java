package ex3_constructor;

public class PenMain {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.info();

        //Pen p2 = new Pen();으로 객체 생성하면 일반판
        Pen p2 = new Pen(true); //true라는 키워드 딱 하나 넣으니 한정판으로 변경됨
        //잠깐. '일반판'으로 출력. -> if문
        p2.info();

    }//main
    
}
