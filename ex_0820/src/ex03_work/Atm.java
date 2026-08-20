package ex03_work;

public class Atm {
    private int money;//잔액

    //입금
    public void deposit( int money ){
        System.out.println("입금성공");
        this.money += money;
    }
    //출금
    public void withdraw( int money ){ 
        //출금은 무지성으로 출금성공 띄우면 안 된다.
        if( this.money - money < 0 ){
            System.out.println("잔액부족");
        }else
            System.out.println("출금성공");
            this.money -= money; //출금한 만큼 빠져나감
        //돌려주는 게 자연스럽다? return money; ?    
    }         

    //잔액확인
    public void balance(){ 
        System.out.println("잔액 : " + money);
    }
    //3개의 메서드를 만들어서 필요할 때마다 호출
    
}
// Atm의 입장. 기계가 가진 기능들을 class로 치환