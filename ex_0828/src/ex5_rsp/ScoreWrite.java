package ex5_rsp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ScoreWrite {
    public void save( User user ){
        String path = "C:/myFile/RspGame/"+user.getId()+"/info.sav";
        File dir = new File("C:/myFile/RspGame/"+user.getId());
        //폴더가 있는지 확인. 폴더가 없으면 이 게임을 처음 하는 사람

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        if( !dir.exists() ){
            dir.mkdirs(); // 폴더 만들어 저장을 위한 사전작업
        }

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            //use객체를 통째로 저장
            oos.writeObject( user );
            System.out.println("기록저장");
            
        } catch (Exception e) {
            System.out.println("저장실패");
            e.printStackTrace();//왜 실패했는지 알고 싶어서

        } finally {
            try {
                if( oos != null )
                    oos.close();
                if( fos != null )
                    fos.close();
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }//save()
}
//기록을 위한 클래스