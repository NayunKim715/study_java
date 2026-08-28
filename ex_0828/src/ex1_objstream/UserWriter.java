package ex1_objstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UserWriter {

    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    public void writeInfo(User user) {
        String path = "C:/myFile/User/" + user.getTel() + "/save.sav";
        File dir1 = new File("C:/myFile/User/");

        if (!dir1.exists()) {
            dir1.mkdirs();
        }

        //없으면 폴더를 만드는 코드
        File dir2 = new File(dir1, user.getTel());

        if (!dir2.exists()) {
            dir2.mkdirs();
        }

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);

            // user객체를 통째로 저장
            oos.writeObject(user);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("유저정보 저장 실패");

        } finally {
            try {
                if (oos != null)
                    oos.close();
                if (fos != null)
                    fos.close();
                // 제어문에 소괄호 없으면 밑에 한줄은 실행 가능

            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}
