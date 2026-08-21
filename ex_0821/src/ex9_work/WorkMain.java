package ex9_work;

public class WorkMain {
    public static void main(String[] args) {
        //1 ~ 45 시이의 중복되지 않는 난수 6개를 출력하는
        //로또번호 생성기 만들기
        int[] lotto = new int[6]; 
    
        WorkSub ws = new WorkSub();
        ws.myLotto(lotto);

        for( int i = 0; i < lotto.length; i++ ){
            System.out.print( lotto[i] + " " );
        }

    }//main
}
/*
문제가 발생하는 이유는 WorkMain에서 myLotto로 중복되지 않는 숫자를 생성하여
lotto 배열에 채워 출력하는데, myLotto에서 이미 출력하고 있는데
main에서 또 한 번 각 원소를 출력해서 두 번 출력되고 있습니다.

즉, WorkSub의 myLotto에서 System.out.print로 중복해서 출력되고,
main에서도 다시 for문으로 출력하여 마지막으로 출력된 숫자가 두 번 나오게 됩니다.

해결방법:
1) WorkSub의 myLotto 메소드에서 출력하지 말고 배열만 채우기.
2) 아니면 main에서 for문을 통한 출력 부분을 제거.

보통은 myLotto는 배열만 채우고 출력은 main에서 하는 것이 좋습니다.
즉, WorkSub.java의 myLotto에서 System.out.print( lotto[i] + " " ); 이 부분을 삭제하면 됩니다.
*/

