package ex_work;

import java.util.Scanner;

public class Ex04_work {
    public static void main(String[] args) {
        /*
        배열의 크기를 입력하세요 : 5
        정수1 : 6
        정수2 : 7
        정수3 : 11
        정수4 : 20
        정수5 : 31
        -------------        
        홀수 개수: 3
        짝수 개수: 2
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기 : ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        
        int odd = 0;//홀수 찾을 때마다 그 갯수를 여기에 저장
        int even = 0;

        for (int i = 0; i < size; i++) {
            //지금은 곧 size가 lenght이므로 nums.length로 써도 됨.
            System.out.printf("정수%d : ", i + 1 );
            nums[i] = sc.nextInt();

            if (nums[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }   

        }//for

        System.out.println("홀수 : " + odd);
        System.out.println("짝수 : " + even);


    }//main
}
