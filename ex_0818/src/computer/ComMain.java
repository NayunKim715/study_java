package computer;

public class ComMain {
    public static void main(String[] args) {
        
        Computer c1 = new Computer();//내가 만든 것을 가지고 객체를 지정
        c1.ssd = 1024; //c1만 값을 바꿨죠. 업데이트
        c1.info();//10줄 코드가 두 줄로 줄었다. 사양 보고 싶을 때 info라는 메소드 만들어서 데이터 전부 가져옴
        /*
        System.out.println("브랜드 : " + c1.brand);
        System.out.println("ssd : " + c1.ssd);
        System.out.println("ram : " + c1.ram);
        System.out.println("cpu : " + c1.cpu);
        System.out.println("색상 : " + c1.color);
        System.out.println("------------------");
        */
        
        Computer c2 = new Computer();
        c2.info();
        /*
        System.out.println("브랜드 : " + c2.brand);
        System.out.println("ssd : " + c2.ssd);
        System.out.println("ram : " + c2.ram);
        System.out.println("cpu : " + c2.cpu);
        System.out.println("색상 : " + c2.color);
        */

    }//main
}
//같은 공장에서 같은 설계도로 만들어짐.
//그러나 만들어지고 나서는 다른 것. c1이 배터리 망가졌다고 c2도 망가지는 것 아님.
//c1과 c2가 참조하는 메모리 주소가 다름.