import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class Main {
    public static void main(String[] args) throws  IOException {
        
        
      
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escolha uma palavra para ser utilizada para pesquisa:\n");
        String chaveDeProdura = leitor.nextLine();

        RabinKarp testeRabinKarp = new RabinKarp(chaveDeProdura);
        Naive testNaive = new Naive(chaveDeProdura);        

        System.out.println("Iniciando a busca usando o Naive...\n\n");
        testNaive.busca();
        System.out.println("Fim da busca usando o Naive! \n\n");

        System.out.println("Iniciando a busca usando o Rabinkarp...\n\n");
        testeRabinKarp.ler();
        System.out.println("Fim da busca usando o RabinKary! ");
  
    }
    
}