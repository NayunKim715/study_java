package ex1_file;

import java.io.File;

public class Ex2_File {
    public static void main(String[] args) {

        String path = "c:/java";
        File f = new File(path);

        //if( f.isFile() ){ //지금은 거짓.
        //if( !f.isFile() ){ 
        if( f.isDirectory() ){ 

            //path경로의 하위 요소들의 이름을 가져온다
            String[] names = f.list();
            
            //하위목록들의 이름을 출력
            for( int i = 0; i < names.length; i++ ){
                System.out.println( names[i] );
            }
            //String type이라 이름 싹다 가져오지만 폴더, 파일 구분은 못함
        }
        
    }//main
}
