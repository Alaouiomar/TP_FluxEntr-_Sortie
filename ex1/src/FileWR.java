import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileWR {
private  int max;
private File file;

  public FileWR(String path){
      max=40;
      file=new File(path);
  }

  public void read() throws IOException {
      FileReader fr = new FileReader(this.file);
      BufferedReader br = new BufferedReader(fr);
      String line = null;
      int n =0;
      while((line = br.readLine()) != null){
          int l = (line.length() / max) +1;
          for (int i =0; i< l ;i++){
              System.out.println((++n) + "" + line.substring(i*max,((i+1)*max > line.length()) ? line.length() : (i+1)*max).trim());
          }

      }
  }
}
