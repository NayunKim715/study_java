package ex1_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {
    public static void main(String[] args) {
       TreeSet<Integer> ts = new TreeSet<Integer>();
       Random rnd = new Random();

       while( ts.size() < 6 ){
        int r = rnd.nextInt(45) + 1;
        ts.add(r);
       }//while
       System.out.println(ts);
       System.out.println( ts.subSet(10, 30) );

       System.out.println("--------------------------");

       Set<String> set = new TreeSet<String>();
       set.add("홍길동");
       set.add("강길순");
       set.add("고봉민");
       System.out.println( set );
       //신기하게 한글도 정렬
    }//main
}
// subSet 메서드는 Set 인터페이스에는 없고, TreeSet(혹은 NavigableSet/SortedSet)에만 있습니다.
// 따라서 Set<Integer>가 아니라 TreeSet<Integer> 타입으로 선언해야 합니다.
// 즉, 
// TreeSet<Integer> ts = new TreeSet<Integer>();
// 으로 선언해주셔야 ts.subSet(10, 30)을 사용할 수 있습니다.
//
// 또한 import 문도 필요합니다:
// import java.util.TreeSet;
//
// 전체적으로 아래와 같이 수정하면 됩니다:
// (아래 코드를 main의 앞부분과 type 선언부, subSet 부분에 반영하세요)
//
// TreeSet<Integer> ts = new TreeSet<Integer>();
// ...
// System.out.println(ts.subSet(10, 30));
//
// 즉, set 타입은 TreeSet으로 선언!

