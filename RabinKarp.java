
/*package Rabin_Karp;*/
import java.math.BigInteger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

public class RabinKarp {

  private Integer tamanhoPalavra;
  private Integer tamanhoFrase;
  private Integer multipicado;
  private Integer valorPalavra;
  private Integer valorFrase;
  private String temp;
  private String palavra;
  private String diretorio;

  public RabinKarp(String palavra) {
    this.palavra = palavra;
  }

  /* Pulo do gato */
  public Boolean bucascando(String texto) {
    tamanhoPalavra = this.palavra.length();
    tamanhoFrase = texto.length();
    valorPalavra = hash(this.palavra);

    for (int x = tamanhoPalavra, y = 0; x <= tamanhoFrase; x++, y++) {
      temp = texto.substring(y, x);
      valorFrase = hash(temp);
      if (valorFrase.equals(valorPalavra)) {
        return true;
      }
    }
    return false;
  }

  /* Acha o arquivo para pular linha */
  public boolean ler() throws IOException {
    diretorio = "C:\\Users\\Gustavo\\Desktop\\Estrutura de Dados\\Trabalho\\Texto";
    File file = new File(diretorio);
    File nome[] = file.listFiles();

    for (int j = nome.length, i = 0; i < j; i++) {
      Path path = Paths.get("C:\\Users\\Gustavo\\Desktop\\Estrutura de Dados\\Trabalho\\Texto\\" + nome[i].getName());
      List<String> linhasArquivo = Files.readAllLines(path);
      for (String linha : linhasArquivo) {
        if (bucascando(linha)) {
          System.out.println("ACHEI A PALAVRA NO ARQUIVO ->" + nome[i].getName());
          return true;
        }
      }
    }
    System.out.println("NÃO ACHEI A PALAVRA NOS ARQUIVOS ");
    return false;
  }

  /* Medtodo para fazer as palavras serem unicas */

  public int hash(String mudar) {
    int ascii = 1;
    for (Integer i = 0; i < mudar.length(); i++) {
      char character = mudar.charAt(i);
      ascii *= (int) character;
    }
    if (ascii < 0) {
      ascii *= -1;
    }
    return ascii;
  }

  /* Get and set */
  public Integer getTamanhoPalavra() {
    return this.tamanhoPalavra;
  }

  public void setTamanhoPalavra(Integer tamanhoPalavra) {
    this.tamanhoPalavra = tamanhoPalavra;
  }

  public Integer getTamanhoFrase() {
    return this.tamanhoFrase;
  }

  public void setTamanhoFrase(Integer tamanhoFrase) {
    this.tamanhoFrase = tamanhoFrase;
  }

  public Integer getMultipicado() {
    return this.multipicado;
  }

  public void setMultipicado(Integer multipicado) {
    this.multipicado = multipicado;
  }

}
