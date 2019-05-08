import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws  IOException {
        RabinKarp testeRabinKarp = new RabinKarp("cousin");
        Naive testNaive = new Naive("souvl");

        if(testNaive.busca()){
            System.out.println("Achei, usando o Naive");
        }else{
            System.out.println("Nao achei, usando o Naive");
        }

        if (testeRabinKarp.ler()) {
            System.out.println("Achei, usando o Rabinkarp");
        } else {
            System.out.println("Nao achei, pelo RabinKary ");
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