/*package Rabin_Karp;*/
public class RabinKarp {

  private Integer tamanhoPalavra;
  private Integer tamanhoFrase;
  private Integer multipicado ;
  private Integer valorPalavra;
  private Integer valorFrase;
  private String  temp;
  public  String  texto;
  public  String  palavra;
  

  public RabinKarp(String texto,String palavra){
    this.texto    = texto;
    this.palavra  = palavra;
  }

/*Pulo do gato*/
  public Boolean bucascando() {
    tamanhoPalavra = this.palavra.length();
    tamanhoFrase = this.texto.length();
    valorPalavra = hash(this.palavra);

    for(int x = tamanhoPalavra,y = 0; x <= tamanhoFrase;x++, y++){     
      temp = this.texto.substring(y,x);
      valorFrase = hash(temp);
      if(valorFrase.equals(valorPalavra)){
        return true;
      }
    }
    return false;
  }

  /* Medtodo para fazer as palavras serem unicas*/



  public int hash(String mudar) {
    int ascii = 1;
    for (Integer i = 0; i < mudar.length(); i++) {
      char character = mudar.charAt(i);    
       ascii *= (int) character; 
   }
    if(ascii < 0){
      ascii *= -1;
    }
    return ascii;
  }

  /*Get and set */
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

  public void setMultipicado( Integer multipicado) {
    this.multipicado = multipicado;
  }

}
