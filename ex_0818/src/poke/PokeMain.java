package poke;

import java.util.Random;

public class PokeMain {
    public static void main(String[] args) {
        
        String[] sname = {"피카츄", "파이리"};
        int[] nhp = {100, 80};
        String[] stype = {"전기", "불"};

        Pokemon p1 = new Pokemon();
        /* 
        p1.name = "피카츄";
        p1.hp = 100;
        p1.type = "전기"; 
        */
        p1.name = sname[ new Random().nextInt(2) ];
        //랜던값이 1일 때는 피카츄가 되고, 2일 때는 파이리가 된다
        p1.hp = nhp[ new Random().nextInt(2) ];
        p1.type = stype[ new Random().nextInt(2) ];
        p1.info();

        Pokemon p2 = new Pokemon();
        p2.name = sname[ new Random().nextInt(2) ];
        p2.hp = nhp[ new Random().nextInt(2) ];
        p2.type = stype[ new Random().nextInt(2) ];
        p2.info();

    }
}

