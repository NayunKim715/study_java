package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.gender = //private변수로는 접근이 아예 불가하니 바로 가져욜 수 없다
        
        //setter, getter 정말 중요.
        p1.setGender("남자");
        System.out.println(
            "성별 : " + p1.getGender());

        p1.setName("홍길동");    
        System.out.println("이름 : " + p1.getName() );
        //setting 해놓은 이름을 getter로 호출. 안 그러면 null 나옴

        p1.setAge(30);
        System.out.println("나이 : " + p1.getAge() );

        System.out.println("----------------");

        Person2 p2 = new Person2();
        p2.setInfo("홍길동", 30);

        System.out.println("이름 : " + p2.getName() );
        System.out.println("나이 : " + p2.getAge() );

        /*
        p1.gender = "남자";
        p1.name = "홍길동";
        p1.age = 20;

        System.out.println("이름 : " + p1.name );
        System.out.println("나이 : " + p1.age );
        */

    }//main
}
