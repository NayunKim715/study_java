package ex2_valueType;

public class Ex2_valueType {
    public static void main(String[] args) {
        //문자형 : 홑따옴표 안에 딱 한글자만 저장할 수 있는 자료형
        char ch = 'A'; // 홑따옴표 없어도, 쌍따옴표여도 오류
        // char ch = 'AB'; 오류. AB 두글자면 문자가 아닌 문자형
        // char ch = 'B'; 는 오류. ch 이미 이름 겹침.
        // char b = 'B'; // class가 다르면 이름이 겹쳐도 된다.
        char ch2 = 65 + 1;
        System.out.println("ch : " + ch);
        System.out.println("ch : " + ch2); //jvm이 가진 가진 데이터 중 아스키코드에서 65는 A, 66은 B
        
        // 실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100;
        f1 = 3.14F; // 기본설정인 double이 아닌 float이라고 명시. 앞에 float f1 이라고 안 붙였으므로 재정의

        double d1 = 3.14;  

        System.out.println("f1 : " + f1);
        System.out.println("d1 : " + d1);
    }
}  
