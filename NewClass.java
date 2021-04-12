
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class NewClass {
    public static void main(String[] args) throws IOException {
        FileInputStream filee=null;
        FileOutputStream file=null;
        int deger;
        String s = "";
        try {
            file=new FileOutputStream("deneme2.txt",true);
            String a="elam";
            byte[] aa=a.getBytes();
            file.write(aa);
           filee=new FileInputStream("deneme2.txt");
           while((deger=filee.read())!=-1)
               s+=(char)filee.read();
           
             System.out.println(s);
        } catch (FileNotFoundException ex) {
            
            System.out.println("dosya bulunamadı...");   
        }
        finally{
            try {
                filee.close();
            } catch (IOException ex) {
                System.out.println("dosya kapanmadıı");
            }
        }
        
    }
}
