package ex1_set;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;

public class Ex1_Set {
    public static void main(String[] args) {
        //collection : 
        //많은 수의 데이터를 그 사용 목적에 적합한 구조로 묶어서
        //하나로 그룹화 한 객체
        //Set, Map, List  -> 우선순위 증가

        //Set은 java.util패키지의 인터페이스다.
        //특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
        //복잡한 코드없이 중복요소를 빠르게 제거할 수 있다.

        //Set인터페이스를 구현하고 있는 대표적인 자식클래스
        //HashSet : 정렬이 안됨
        //TreeSet : 오름차순 정렬
        int[] arr = {150, 70, 10, 200};

        HashSet<Integer> set = new HashSet<Integer>(); //Ctrl+space -> 엔터
        set.add(150);
        set.add(70);
        set.add(10);
        set.add(200);
        
        //중복된 값은 추가하지 않는다
        set.add(10); //여전히 set의 크기 : 4

        //set의 모든 내용을 비운다
        set.clear();
        
        System.out.println("set의 크기 : " + set.size());
        System.out.println( set ); //배열이라면 set[0],set[1] 이런식으로 for문 돌리면서 출력

        System.out.println("--------------------------");

        Set<Integer> set2 = new HashSet<Integer>();
        Random rnd = new Random();

        while(true){
           int r = rnd.nextInt(45) + 1;
           set2.add(r);

           if( set2.size() == 6 ){
            break; //중복이 안 되는 6개의 숫자가 set에 들어가면 while문 나옴
           }

        }//while

        System.out.println(set2);

        //set2를 배열로 변환
        Integer[] arr = set2.toArray( new Integer[0] );

        for( int i = 0; i < arr.length; i++ ){
            System.out.print( arr[i] + " " );

        }//for
        System.out.println("--------------------");

        int[] arr2 = new int[ set2.size() ];
        int i = 0;
        for( Integer num : set2 ){
            arr2[i++] = num;
            //System.out.print( arr2[i] + " " );
        }

        for( int j = 0; j < arr2.length; j++ ){
            System.out.print( arr2[j] + " " );
        }
    }//main
}
//25일 식사 후

// 네, "arr2"처럼 다른 이름으로 선언하면 Duplicate local variable 오류를 피할 수 있습니다.
// 예시:
// Integer[] arr2 = set2.toArray(new Integer[0]);
//
// int[] arr3 = new int[set2.size()];
// int i = 0;
// for (Integer num : set2) {
//     arr3[i++] = num;
// }
//
// for (int j = 0; j < arr3.length; j++) {
//     System.out.print(arr3[j] + " ");
// }



