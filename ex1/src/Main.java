import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWR fwr = new FileWR("test.txt");
        fwr.read();
    }
}
