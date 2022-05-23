import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("saisie.txt");
        PrintWriter out = new PrintWriter(fw);

        Scanner sc = new Scanner(System.in);
        System.out.println("HOW MANY PEOPLE ADING ?");
        int str = sc.nextInt();
        sc.nextLine();
         for(int i =0; i<str+1; i++){
             System.out.println("Nom n°" + i + ": ");
             out.print("Nom n°" + i + ": ");
             String s = sc.nextLine();
             fw.write(s);
             out.println();
             System.out.println("\n Prenom : ");
             out.print("Prenom : ");
             String s2 = sc.nextLine();
             fw.write(s2);
             out.println();
             System.out.println("\n Date de naissance : ");
             out.print("Date de naissance : ");
             String s3 = sc.nextLine();
             fw.write(s3);
             out.println();

         }
         fw.close();
    }
}
