package ex3_list;

import java.util.List;
import java.util.ArrayList;

public class Ex1_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(100);
        list.add(50);
        list.add(1, 60);
        list.set(0, 90);
        list.remove(2); //특정 index만 골라서 지울 수 있다.

        if( list.contains(50) ){
            System.out.println("list에 50이 있다");
        }

        System.out.println("size : " + list.size());
        System.out.println( list );
        System.out.println("2번 index값 : " + list.get(2));

        list.clear();//list의 모든 내용을 0으로 만드는 메서드. size : 0 됨
        System.out.println("size : " + list.size());

    }//main
}
