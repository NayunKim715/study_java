package ex_work;

public class Ex1_work {
    public static void main(String[] args) {
    
        //나이가 15세 이상이거나, 키가 150cm 이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력
        //둘 중 하나만 만족하면 되니까 OR 연산. else if문도 가능은 함.

        int age = 14;
        //int height = 145; //소숫점 고려하면 double이나 float
        int height = 160;
        String str = "";
                
        if (age >= 15 || height >= 150) { //OR 연산은 둘 다 거짓일 때만 거짓이므로 둘 다 해볼 수밖에 없다.
            str = "탑승가능";
        } else {
            str = "탑승불가";
        }
                
        System.out.println(str);

        // 삼항연산자로
        age = 14;
        height = 145;
        String res1 = (age >= 15 || height >= 150) ? "탑승가능" : "탑승불가";
        System.out.println(res1);

        
    }//main
   
}
