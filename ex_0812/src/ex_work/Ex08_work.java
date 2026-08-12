package ex_work;

public class Ex08_work {
    public static void main(String[] args) {
        //변수 money에 10 ~ 5000 사이의 난수를 발생시킨다
        //단, 발생한 난수 money는 1의 자리가 반드시 0이 되도록 한다
        //money를 최소한의 동전으로 몇 개씩 거슬러지는지 출력
        //------------------------------
        //금액 : 2590(1의 자리는 반드시 0)
        //500원 : 5
        //50원 : 1
        //10원 : 4 
        int[] coin = { 500, 100, 50 ,10 };
        // 10 ~ 5000 사이의 난수, 1의 자리는 반드시 0
         // 아래와 같이 쉽게 고칠 수 있습니다.
        // 1의 자리가 0이 되게 하려면, 1~500까지 중 하나를 뽑고 그 값에 10을 곱하면 됨 (즉, 10, 20, ..., 5000)
        int money = ((int)(Math.random() * 500) + 1) * 10;

        System.out.println("금액 : " + money);

        for (int i = 0; i < coin.length; i++) {
            int cnt = money / coin[i];
            System.out.println(coin[i] + "원 : " + cnt);
            money = money % coin[i];
        }

    }//main
}
