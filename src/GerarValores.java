import java.util.ArrayList;
import java.util.List;

public class GerarValores {

    public  ValoresDoJogo gerarValorAleatorioNivel1() {
        List<ValoresDoJogo> opcoesDeValores = new ArrayList<>();
        var indexAleatorio =(int) (Math.random()*3);
        ValoresDoJogo frutaSorteada;

        opcoesDeValores.add(ValoresDoJogo.BANANA);
        opcoesDeValores.add(ValoresDoJogo.MORANGO);
        opcoesDeValores.add(ValoresDoJogo.ESTRELA);

        frutaSorteada = opcoesDeValores.get(indexAleatorio);
        return frutaSorteada;
    }

    public  ValoresDoJogo gerarValorAleatorioNivel2() {
        List<ValoresDoJogo> opcoesDeValores = new ArrayList<>();
        var indexAleatorio =(int) (Math.random()*5);
        ValoresDoJogo frutaSorteada;

        opcoesDeValores.add(ValoresDoJogo.ESTRELA);
        opcoesDeValores.add(ValoresDoJogo.CARRINHO);
        opcoesDeValores.add(ValoresDoJogo.RATO);
        opcoesDeValores.add(ValoresDoJogo.PIZZA);
        opcoesDeValores.add(ValoresDoJogo.FOGUETE);

        frutaSorteada = opcoesDeValores.get(indexAleatorio);
        return frutaSorteada;
    }

    public  ValoresDoJogo gerarValorAleatorioNivel3() {
        List<ValoresDoJogo> opcoesDeValores = new ArrayList<>();
        var indexAleatorio =(int) (Math.random()*7);
        ValoresDoJogo frutaSorteada;

        opcoesDeValores.add(ValoresDoJogo.BANANA);
        opcoesDeValores.add(ValoresDoJogo.MORANGO);
        opcoesDeValores.add(ValoresDoJogo.ESTRELA);
        opcoesDeValores.add(ValoresDoJogo.CARRINHO);
        opcoesDeValores.add(ValoresDoJogo.RATO);
        opcoesDeValores.add(ValoresDoJogo.PIZZA);
        opcoesDeValores.add(ValoresDoJogo.FOGUETE);

        frutaSorteada = opcoesDeValores.get(indexAleatorio);
        return frutaSorteada;
    }
}
