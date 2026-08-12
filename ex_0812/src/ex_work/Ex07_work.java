package ex_work;

public class Ex07_work {
    public static void main(String[] args) {
        
        //배열 arr을 오름차순으로 출력
        //-----------------
        //11 7 9 20 15 3
        //3 7 9 11 15 20
        int[] arr = {11, 7, 9, 20, 15, 3};

        

        // 배열 arr을 오름차순으로 정렬 (버블 정렬 사용)
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    // 두 값 교환
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 정렬된 배열 출력
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }//main
}
