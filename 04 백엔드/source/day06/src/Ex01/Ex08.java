package Ex01;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args) {
        try(FileInputStream fis  = new FileInputStream("b.text")){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
