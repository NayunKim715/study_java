package ex4_work;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex1_work {
   public static void main(String[] args) {
      //id : aaa
      //aaa
      //id : bbb
      //aaa 회원
      //bbb 회원
      //id : aaa
      //aaa회원은 이미 존재함
      //id : 
      Scanner sc = new Scanner(System.in);
      List<String> list = new ArrayList<String>();


      while(true){
        System.out.print("id : ");
        String id = sc.next();

        //중복체크 - 학생들이 손 더 가는 방식으로 만들었으니까
        for( int i = 0; i < list.size(); i++ ){
            if( id.equals() ){

            }

        }//for

       //중복체크
       //if( list.contains(id) ){
        //  System.out.prinlin(id + "회원은 이미 있음");
        //  continue;
       // }

        list.add(id);

        //전체 회원
        for( int i = 0; i < list.size(); i++ ){
            System.out.println( list.get(i) + "회원은 이미 있음");
            continue outer;

        }//for


      }//while

      

   }//main 
}

//중복체크 이후로 놓침

//야심차게 준비한 함정이었는데 비전공자 주제에 이걸.. (아니 너무 좋아서)