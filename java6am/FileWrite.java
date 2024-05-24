package Filedata;
import java.io.*;
public class FileWrite {
      public static void main(String[] args) throws IOException {

          try ( /* File f1=new File("d://file1.txt");
          FileWriter fr=new FileWriter(f1);*/ //FileWriter fr=new FileWriter(new File("d://file2.txt"));
          //FileWriter: file file exist cant create new
          //   open file for Writing
          // if file not exist create new file automatically
          // and open new file for writing
                  FileWriter fr = new FileWriter("d://beans.txt")) {
              String str="anish kumar paswan";
              fr.write(str);
              fr.flush();
          }


    }

}
