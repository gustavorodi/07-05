import java.math.BigInteger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

public class Naive {
    private String word;
    private String diretorio;


    public Naive(String word) {
        this.word = word;

    }

    public Boolean searchFile(String content) {
        Integer n;
        Integer m;
        n = content.length();
        m = this.word.length();
        for (Integer i = 0; i < n - m; i++) {
            Integer j = 0;
            while (j < m && content.charAt(i + j) == this.word.charAt(j)) {
                j++;
            }
            if (j == m)
                return true;
        }
        return false;
    }

    public boolean busca() throws IOException {
        diretorio = "C:\\Users\\Gustavo\\Desktop\\Estrutura de Dados\\Trabalho\\Texto";
        File file = new File(diretorio);
        File nome[] = file.listFiles();
    
        for (int j = nome.length, i = 0; i < j; i++) {
            Path path = Paths.get("C:\\Users\\Gustavo\\Desktop\\Estrutura de Dados\\Trabalho\\Texto\\" + nome[i].getName());
            List<String> linhasArquivo = Files.readAllLines(path);
            for (String linha : linhasArquivo) {
                if(searchFile(linha)){
                System.out.println("ACHEI A PALAVRA NO ARQUIVO"+ nome[i].getName()+"\n");
                return true;
                }
            }
            
        }
        System.out.println("NÃO ACHEI A PALAVRA NOS ARQUIVOS ");
        return false;
    }  
}