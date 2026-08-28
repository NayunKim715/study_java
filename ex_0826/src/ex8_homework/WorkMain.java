package ex8_homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkMain {
    public static void main(String[] args) {
        /*
        * [strawberry]
        * >> strawberry
        * [orange, grape, apple]
        * >> orange
        * [grape, apple]
        * >> grape
        * [apple, apple]
        * >> apple
        * [apple]
        * >> apple
        * [strawberry]
        * >> strawberry
        * 클리어!!!
        */        
        String[] data = { "apple", "banana", "orange", "grape", "strawberry", "pineapple" };
        List<String> arr = new ArrayList<String>();

        WorkSub ws = new WorkSub(arr, data); 
        //주소값이 Sub로 넘어간다. 
        //원본까지 size가 바뀔 수 있다? - 8월 27일 1교시 재시청
        ws.setDaemon(true);
        ws.start(); //run() 메서드가 백그라운드에서 별개로 동작하도록 호출됨
        //arr은 실시간으로 size가 바뀐다

        Scanner sc = new Scanner(System.in); //start보다 위에 있을 때 아래에 있을 때 다름

        while(true){
            if( arr.size() == 0 ){
                System.out.println("클리어!!!");
                break;
            }
            System.out.println(arr);
        }//while  
        
    }//main
}

//try-catch 지움? 2교시 영상 다시 보기