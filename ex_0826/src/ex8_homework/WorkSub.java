package ex8_homework;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class WorkSub extends Thread{

    private List<String> arr;
    private String[] data;
    private Random rnd;

    public WorkSub( List<String> arr, String[] data ){
        this.arr = arr; //얕은 복사
        this.data = data;
        rnd = new Random();
    }

    @Override
    public void run() {
        while(true){ //while문이 무한반복하면서 3초에 한번씩 단어 넣음
            int random = rnd.nextInt( data.length );
            arr.add( data[random] );
            

        }
    }
}
