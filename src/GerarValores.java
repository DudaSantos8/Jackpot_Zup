public class GerarValores {

    public static ValoresDoJogo gerarValorAleatorio() {
        int condicao = 0;
        int indexAleatorio =(int) (Math.random()*3);

        ValoresDoJogo valorAleatorio = ValoresDoJogo.BANANA;
        for(ValoresDoJogo valor : ValoresDoJogo.values()){
            condicao++;
            if(condicao == indexAleatorio){
                valorAleatorio = valor;
            }
        }
        return valorAleatorio;
    }
}
