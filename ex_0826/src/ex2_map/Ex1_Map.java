package ex2_map;

import java.util.Map;
import java.util.HashMap;

public class Ex1_Map {
    public static void main(String[] args) {
        //    key  ,  value
        Map<Integer, Character> map = new HashMap<>(); //인터페이스라서 new Map으로 만들 순 없다 
        map.put(10, 'A'); 
        map.put(11, 'C');
        map.put(12, 'A');

        //key값이 중복되면 기존 key값의 value를 갱신
        map.put(10, 'D'); 
        System.out.println("size" + map.size());

        char res = map.get(11);
        System.out.println(res);

        System.out.println("map : " + map);

        if( map.containsKey(10) ){
            System.out.println("map에 key가 10인 데이터가 있음");
        }
        if( map.containsKey('A') ){
            System.out.println("map에 A가 저장되어 있음");
        }

    }//main
}

// "Unlikely argument type char for containsKey(Object) on a Map<Integer,Character>"는
// 현재 map의 key 타입이 Integer인데 containsKey('A')와 같이 char 타입 인자를 전달해서 발생하는 경고입니다.
//
// 즉, 아래 코드에서:
// if( map.containsKey('A') ){
//     System.out.println("map에 A가 저장되어 있음");
// }
//
// 'A'는 char 타입이고, map의 key는 Integer 타입이므로 일치하지 않습니다.
// 이 코드는 의미상 올바르지 않고, 항상 false가 반환됩니다.
// 
// 만약 'A'라는 value를 가진 값이 map에 저장되어 있는지 확인하려면 containsValue('A')를 사용해야 합니다:
// if( map.containsValue('A') ){
//     System.out.println("map에 A가 저장되어 있음");
// }
//
// 또는, containsKey를 사용하려면 Integer 타입의 key로 확인해야 합니다:
// if( map.containsKey(10) ){ ... }
//
// 결론: containsKey에는 map의 key 타입과 같은 타입(여기서는 Integer)을 넣어야 하며,
// value를 찾고 싶으면 containsValue를 사용해야 합니다.
