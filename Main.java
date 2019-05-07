public class Main{
    public static void main(String[] args) {        
    RabinKarp testeRabinKarp = new RabinKarp("O mundo preciso de mais amor","mundo");
    Naive testNaive = new Naive("O mundo precisa de mais amor","e");
      
       
        System.out.println(testNaive.searchFile());
        
        if(testeRabinKarp.bucascando()){
            System.out.println("Achei");
        }else{
            System.out.println("Não achei");
        }
     
    }
   
}