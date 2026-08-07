package ex2_statement;

public class Ex3_switch {
    public static void main(String[] args) {
        
      char name = '이';//'홍' 이라 넣으면 디폴트값

      switch( name ){//비교값

        case '김':
            System.out.println("1000만");
            break;

        case '이':
            System.out.println("730만");
            break; //김씨로 입력하고 김,이의 braek 2개 지우면 1000만, 730만, 419만 세 줄 나옴.

        case '박':
            System.out.println("419만");
            break; //박의 break까지 지우면 위에 있는 모든 설정문이 출력됨. break를 만나기 위해 default까지 들어옴.
        
        default:
            System.out.println("데이터가 없습니다");
            break;//디폴트의 break까지 지우면
        //break는 나가는 시점을 조절하기 위한 코드. 마지막까지 내려왔는데도 break가 없으면 포기하고 switch문 벗어나면서 마무리.    

      }//switch
       
    }//main
}

//switch문에서 사용할 수 있는 비교값이 세 개밖에 없다. 