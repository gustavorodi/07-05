import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import 	java.util.List;
import java.util.Map;

public class Naive {
    private String word;

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
        Path path = Paths.get("C:\\Users\\Gustavo\\Desktop\\Estrutura de Dados\\Trabalho\\1H4.txt");
        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            if(searchFile(linha)){
              return true;
            }
        }
        return false;
      }

}