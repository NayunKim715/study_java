package ex5_work;

public class Ex1_work {
   public static void main(String[] args) {
    
   /*
   과수원이 있다.
   배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
   각각 5, 7, 5개.
   
   1.과수원에서 하루에 생산되는 과일의 총 갯수를 출력
   2.시간당 전체 과일의 평균 생산 갯수
   단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float
   */ 
   
   //훌륭한 개발자는 변수 이름 한눈에 알아볼수 있게.
   //a,b,c는 변수 갯수 많아ㅈ면 비효율적
   int pear = 5;
   int apple = 7;
   int orange = 5; // 숫자는 마음대로 바꿔도 밑에 코드는 불변
   int total = pear + apple + orange;
   //float avg = (float)total / 24; //첫번째 방법
   float avg = total / 24.0f; 
   //total/24는 정수끼리의 연산이라 소숫점 뒷자리를 못 구한다.
   
   System.out.println("하루생산량 : " + total + "개");
   System.out.println("시간당 평균 : " + avg + "개");
    
   /*
   [응용 연습문제]
   당신은 과수원에서 일하고 있습니다. 과수원에는 배, 사과, 오렌지 외에 포도와 복숭아도 하루에 각각 8개, 6개씩 생산됩니다.

   1. 다섯 종류의 과일이 하루에 생산되는 총 갯수를 구하세요.
   2. 각 과일별로 하루 생산 비율(해당 과일 생산 갯수 ÷ 총 과일 갯수)을 구하세요. (소수점 둘째자리까지)
   3. 오전(6시간) 동안 생산되는 사과와 오렌지의 합계를 구하세요.
   4. 전체 과일의 시간당 평균 생산량을 float형으로 계산하세요.
   */

   }//main 
}
