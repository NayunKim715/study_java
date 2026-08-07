package src3.ex1_statement;

public class Ex2_for {
    public static void main(String[] args) {

        // 1~10까지의 정수들 중에서 홀수의 합만 계산하여 출력
        // ------------------------
        // 결과 : 25
        int sum = 0; //홀수들을 다 더했을 때 최종값을 기억할 변수가 필요
        for ( int i = 1; i <= 10; i++) {
            if( i % 2 == 1 )//for문 안으로 들어와 홀짝 판단. 홀수 일 때만 if문 으로 들어옴. 
            //System.out.println(i);//1 3 5 7 9 
          
               //int sum = 0; 재활용이 아닌 초기화. sum이 항상 0이 됨.
               //그래서 sum은 for문 안에다 만들면 안 되고 밖에서 갱신해줘야 함.
               sum += i;
            
            }//for
            //System.out.println("결과 : " + sum); // 과정 보여줌
               System.out.println("결과 : " + sum);
    }
}
