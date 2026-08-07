package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        
      //과제1 ) 비교값으로 1 ~ 12월 사이의 값을 준비
      //과제2 ) 비교값으로 1 ~ 12월 사이의 값을 키보드에서 입력. 스캐너코드 준비.
      //준비된 비교값에 해당하는 달이 몇일까지 있는지 출력
      //--------------------
      //2월은 28일 까지 있습니다.//윤달 고려 X
      //3월은 31일 까지 있습니다
      //힌트 : 케이스는 12개여도 break까지 12개일 필요는 없다. 의도적으로 break를 제거

      /*int month = 2; 
           
      switch (month) {
          case 1: case 3: case 5: case 7: case 8: case 10: case 12:
              System.out.println(month + "월은 31일 까지 있습니다.");
              break;
              
          case 4: case 6: case 9: case 11:
            System.out.println(month + "월은 30일 까지 있습니다.");
              break;
              
          case 2:
              System.out.println("2월은 28일 까지 있습니다.");
              break;

          default:
            System.out.println(month+"월은 없어요");
            break;
          
          }//switch
      */

          
          Scanner sc = new Scanner(System.in);
          System.out.print("1 ~ 12월 사이의 값을 입력하세요: ");
          int month = sc.nextInt(); //딱 두줄 수정 + 한줄 추가
          
          switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            System.out.println(month + "월은 31일 까지 있습니다.");
            break;
                          
            case 4: case 6: case 9: case 11:
            System.out.println(month + "월은 30일 까지 있습니다.");
            break;
                          
            case 2:
            System.out.println(month + "월은 28일 까지 있습니다.");
            break;
                          
            default:
            System.out.println(month + "월은 없어요");
            break;
         
        }//switch
      

  
    }//main
}//class
