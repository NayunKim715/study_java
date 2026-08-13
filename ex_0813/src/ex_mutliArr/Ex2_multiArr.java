package ex_mutliArr;

public class Ex2_multiArr {
    public static void main(String[] args) {
        String[][] str = new String[2][2]; //이번에는 자료형 String으로 해보려고
 
        str[0][0] = "안녕";
        str[0][1] = "하세요";
        str[1][0] = "반갑";
        str[1][1] = "습니다";

        //안녕하세요
        //반갑습니다

        for( int i = 0; i < str.length; i++ ){//큰방의 갯수
            for( int j = 0; j < str[i].length; j++ ){//작은방의 갯수
                System.out.print(str[i][j]);
                //System.out.print(str[i][j] + " ");//안녕 하세요-반갑 습니다
            }//inner
            System.out.println();
        }//outer

    }//main
} 
