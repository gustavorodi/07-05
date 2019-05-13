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