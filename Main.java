import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws  IOException {
        RabinKarp testeRabinKarp = new RabinKarp("Play");
        Naive testNaive = new Naive("O mundo precisa de mais amor", "e");


        System.out.println(testNaive.searchFile());

        if (testeRabinKarp.ler()) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }
    }

}

/*
 * package scanner.text; import java.io.FileNotFoundException; import
 * java.io.FileReader; import java.util.Scanner;
 * 
 * public class Exemplo02 {
 * 
 * public static void main(String args[]) throws FileNotFoundException { Scanner
 * scanner = new Scanner(new
 * FileReader("C:\\Users\\lucas.bortolini\\workspace\\Exemplo\\arquivo.txt"));
 * scanner.useDelimiter("\\n");
 * 
 * while (scanner.hasNext()) { System.out.println( scanner.next() ); }
 * scanner.close();
 * 
 * }
 * 
 * } }
 * 
 * }
 */