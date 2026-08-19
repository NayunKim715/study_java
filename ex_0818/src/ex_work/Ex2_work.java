package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        //검색 : 조인성
        //[조인성]
        //모가디슈
        //호프

        //검색 : aaaa
        //해당 배우의 정보가 없습니다
        String[][] actor = { {"[송강호]", "박쥐", "괴물", "관상"}, 
                             {"[조인성]", "모가디슈", "호프"}, 
                             {"[이병헌]", "레드", "광해", "놈놈놈"} };
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("검색 : ");
        String name = sc.next();

        Ex2_Sub sub = new Ex2_Sub();
        sub.findActor(actor, name, cnt);

        /*
        for( int i = 0; i < actor.length; i++ ){
            if( actor[i][0].equals( "["+name+"]") ){ //내가 키보드에서 받은 것과 똑같은게 있는지 equals로 비교
        //대괄호 안에 배우 이름이 들어가있는데, 내가 검색할 때는 이름만 입력
        //비교할 떄는 앞뒤에 대괄후 붙여서 비교
               //System.out.println(name+ "찾음");
               for( int j = 0; j < actor[i].length; j++ ){
                   System.out.println(actor[i][j]);
               }//inner

            }else{
              cnt++;
              if( cnt == actor.length ){ //cnt는 2인데 actor.length는 3?
                System.out.println("배우정보가 없음");
              }

             //System.out.println("배우정보가 없음"); //흔한 실수. 조인성(i=1),이병헌(i=2) -> 배우정보가 없음 
            }
        }//for
        */

    }//main
}
//8월 19일 2교시
//여기부터 매우 어려움. 4-5년차  개발자들도 힘들어함.
//class분할