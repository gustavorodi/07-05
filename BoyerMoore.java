public class BoyerMoore {
    private String palavraBuscada;
    private String frasePesquisada;
    private String ultimaLetra;
    private Integer tamanhoFrase;
    private Integer tamanhoPalavra;

    public BoyerMoore(String palavraBuscada, String frasePesquisada) {
        this.frasePesquisada = frasePesquisada;
        this.palavraBuscada = palavraBuscada;
    }

    public boolean darMach() {
        tamanhoPalavra = this.palavraBuscada.length();
        tamanhoFrase = this.frasePesquisada.length();

        for (int x = tamanhoPalavra, y = tamanhoPalavra - 1; x <= tamanhoFrase; x += 2, y += 2) {
            temp = this.frasePesquisada.substring(y, x);
            System.out.println(temp);
        }

    }

    public loop(){
        for(int x = tamanhoPalavra,y = 0; x <= tamanhoFrase;x++, y++){     
            temp = this.texto.substring(y,x);
            valorFrase = hash(temp);
            if(valorFrase.equals(valorPalavra)){
              return true;
            }
          }
          return false;
    }

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
}