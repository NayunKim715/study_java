package ex9_list;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {

        //학생 수 : 2
        //-----------------
        //이름 : 홍길동
        //국어 : 99
        //영어 : 87
        //------------------
        //이름 : 임진호
        //국어 : 75
        //영어 : 80
        //------------------
        //홍길동    국어:99    영어:87    총점:186    평균:93.0
        //임진호    국어:75    영어:80    총점:155    평균:77.5
        //반 전체 평균 : 85.25
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<Student>();
        //List<Integer> list = new ArrayList<Student>();
        Student stu;//학생 정보를 여기에 묶어서 받는다

        System.out.print("학생 수 : ");
        int cnt = sc.nextInt();

        for( int i = 0; i < cnt; i++ ){
            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("국어 : ");
            int kor = sc.nextInt();

            System.out.print("영어 : ");
            int eng = sc.nextInt();

            stu = new Student(name, kor, eng);
            list.add(stu); //stu를 array에 담는다
            System.out.println("-----------------------");
            //여기까지가 성적 입력. 쉽지 않다.
        }//for

        //반 전체평균
        float all_avg = 0;

        //학생정보 출력
        for( int i = 0; i < list.size(); i++ ){
            list.get(i).studentInfo();

            all_avg += list.get(i).getAvg();
        }//for

        System.out.printf(
            "반 전체 평균 : %.2f", all_avg / list.size() );

    }//main
}
//제가 엄마 다음으로 좋아하는 게 처음 보는 사탕인데, 못 받아도 괜찮지.