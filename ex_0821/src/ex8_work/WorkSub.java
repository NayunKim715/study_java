package ex8_work;

public class WorkSub {
    public void myCoin( int[] coin, int money ){
        for( int i = 0; i < coin.length; i++ ){

            int res = money / coin[i];

            //사용하지 않을 동전은 결과에서 보여주지 않음
            if( res > 0 ){
                System.out.printf("%d원 : %d개\n", coin[i], res);

                money %= coin[i]; //money를 coin으로 나눈 나머지
            }

        }//for

    }//myCoin()
}
