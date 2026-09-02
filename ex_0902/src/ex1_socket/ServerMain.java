package ex1_socket;

public class ServerMain {
    public static void main(String[] args) {
        
        MyServer ms = new MyServer();
        ms.start(); //3000번 포트 열어두고 쓰레드를 돌린다




    }//main
}
//선생님만 ServerMain실행하고, 학생들은 ClientMain실행하니
//선생님 실행창에 학생들 아이피 ---님 다녀감 실시간으로 뜸.