package ex2_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3_Map {

    Scanner sc = new Scanner(System.in);

    MapString<String, Integer> map = new HashMap<String, Integer>();
    map.put("kim", 1111); //key value
    map.put("lee", 2222);

    System.out.print("id : ");
    String id = sc.next();

    System.out.print("pw : ");
    int pwd = sc.nextInt();

    if( !map.containsKey(id) ){
        System.out.println("아이디가 존재하지 않음");
    }else{
        if( map.get(id) == pwd){
            System.out.println("로그인 성공");
        }else{
            System.out.println("비밀번호 불일치");
        }

}










}
//8월 26일 1교시 지각