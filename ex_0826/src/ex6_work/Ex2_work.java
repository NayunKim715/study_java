package ex6_work;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ex2_work {
    public static void main(String[] args) {
        //다섯개의 문장을 입력받아 Arraylist에 저장하고
        //가장 긴 문자열을 찾아 출력
        //---------------
        //입력 : aaa
        //입력 : bbbb
        // ...
        //입력 : cccccc
        //가장 긴 문자열 : cccccc

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        for( int i = 0; i < 5; i++ ){
            System.out.println("입력 : ");
            list.add( sc.next() );

        }//for

        String longer = "";

        for( int i = 0; i < list.size(); i++ ){
          String str = list.get(i);
          
          if( str.length() > longer.length() ){
            //if( str.length() >= longer.length() ){ 로 하면 맨 밑의 것 출력
             longer = str;
          }

        }//for

        System.out.println("가장 긴 문자열 : " + longer);

    }//main
}

/*문자와 숫자를 섞어서 입력
123456789a
1234567aaa
12345aaaaa
12aaaaaaaa
aaaaaaaaaa
가장 긴 문자열 : 123456789a 
=> 처음 것을 가지고 if문 만나는데 처음 것보다 긴 것을 만나지 못하고 중복되는 것만 만나니 처음 것 그대로 출력 
-------------------------
1234a
1234aa
1234aaa
1234aaaa
1234aaaaa
가장 긴 문자열 : 1234aaaaa
--------------------------
aa1
aa12
aa123
aa1234
aa12345
가장 긴 문자열 : aa12345
*/
