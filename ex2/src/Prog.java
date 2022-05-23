import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Prog {
    private File file;

    public Prog(String path){
        file = new File(path);
    }

    public boolean test() throws IOException {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pwd = sc.nextLine();
        String spwd = sc.nextLine();

        FileReader fr = new FileReader(this.file);
        BufferedReader br = new BufferedReader(fr);
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] stng = line.split("/");

            if (user.equals(stng[0].trim()) && pwd.equals(stng[1].trim()) && spwd.equals(stng[2].trim())) {
                System.out.println("Auth done");
                return true;
            }
        }
        System.out.println("Auth failed");
        return false;
    }
}
