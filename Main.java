import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException {



        Scanner leitor = new Scanner(System.in);
        System.out.print("Escolha uma palavra para ser utilizada para pesquisa:\n");
        String chaveDeProdura = leitor.nextLine();

        BoyerMoore testeBoyerMoore = new BoyerMoore("amor","chuva de amor");
        RabinKarp testeRabinKarp = new RabinKarp(chaveDeProdura);
        Naive testNaive = new Naive(chaveDeProdura);
        Time contando = new Time();

        System.out.println("\n**************************************");
        System.out.println("Iniciando a busca usando o Naive...");
        contando.comecar();
        testNaive.busca();
        contando.parar("Naive");
        System.out.println("Fim da busca usando o Naive! ");
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Iniciando a busca usando o Rabinkarp...");
        contando.comecar();
        testeRabinKarp.ler();
        contando.parar("Rabinkarp");
        System.out.println("Fim da busca usando o RabinKarp! ");
        System.out.println("**************************************");

        System.out.println("**************************************");
        System.out.println("Iniciando a busca usando o BoyerMoore...");
 
        testeBoyerMoore.darMach();
      
        System.out.println("Fim da busca usando o BoyerMoore! ");
        System.out.println("**************************************");
        

    }

}