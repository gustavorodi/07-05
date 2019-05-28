import java.util.Random;

public class BoyerMoore 
{
    private String palavraBuscada;
    private String frasePesquisada;
    private String ultimaLetra;
    private String ultimaLetraDaBusca;
    private Integer tamanhoFrase;
    private Integer tamanhoPalavra;
    private Integer conta;
    private Integer hashTemp;
    private Integer tamanhoP;
    private Integer tamanho;

    Random aleatorio = new Random();

    public BoyerMoore(String palavraBuscada, String frasePesquisada) {
        this.frasePesquisada = frasePesquisada;
        this.palavraBuscada = palavraBuscada;
    }

    public boolean darMach() {
        tamanhoPalavra = this.palavraBuscada.length();
        tamanhoFrase = this.frasePesquisada.length();

        for (int x = tamanhoPalavra, y = tamanhoPalavra-1; x <= tamanhoFrase; x+=conta, y+=conta) {
            conta = aleatorio.nextInt(10);
            ultimaLetraDaBusca = this.frasePesquisada.substring(y, x);

            if(ultimocaracter(palavraBuscada)==ultimaLetraDaBusca){
                if(reverter(x,y)){
                    System.out.println("ACHEI A PALAVRA ");
                    return true;
                }
            }
        }
        System.out.println("PALAVRA NÃO ACHADA");
        return false;
    }

    public String ultimocaracter(String text)
    {
        Integer temp =  text.length();
        return text.substring(temp-1, temp);
    }

    public Integer contando()
    {
        Integer temp = 0;
        String result;
        tamanhoP = this.palavraBuscada.length();
        for(int x = tamanhoP , y = x -1; y == 0; y--,x--){
            result = this.frasePesquisada.substring(y,x);
            temp += hash(result);
        }
        return temp;
    }

    public boolean reverter(Integer frase_x,Integer frase_y){
       String v;
        tamanho = this.palavraBuscada.length();
        for(int x = frase_x, y = frase_y; tamanho == 0; x--, y--,tamanho--){
            v = this.frasePesquisada.substring(y,x);
            hashTemp += hash(v);
        }
        if(hashTemp == contando()){
            return true;
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