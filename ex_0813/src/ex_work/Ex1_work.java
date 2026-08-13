package ex_work;

public class Ex1_work {
    public static void main(String[] args) {
        //배열 arr에 담긴 모든 값의 합과 평균 구하기
        //------------------------
        //총합 : 119
        //평균 : 7.44
        int[][] arr = { { 7, 8, 11, 6 },
                        { 20, 13, 9, 2, 5 },
                        { 7, 7, 10 },
                        { 2, 3, 4, 5 } };
                       
        int total = 0;//최종적으로 합을 보여줄 변수
        float avg = 0;
        //avg = total/16; //유지보수에서 좋은 코드 아니라 변수 하나 더 만든다. 
        int cnt = 0; //cnt값이 16이 되어야 한다. count
        
        for( int i = 0; i < arr.length; i++ ){
            for( int j = 0; j < arr[i].length; j++ ){
                total += arr[i][j]; //어떻게 알고 16개 더했죠? 더하는 김에 한 바퀴 돌 때마다 한 바퀴 늘릴까?
                cnt++;
            }//inner
        }//outer

              
        System.out.println("총합 : " + total);
        avg = (float)total / cnt;
        System.out.printf("평균 : %.2f", avg);
        
    }//main
}
