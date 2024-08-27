import java.util.ArrayList;
import java.util.List;

public class GerarValores {
    private final List<ValoresDoJogo> opcoesDeValores = new ArrayList<>();
    private ValoresDoJogo frutaSorteada;
    private int indexAleatorio;

    public  ValoresDoJogo gerarValorAleatorioNivel1() {
        indexAleatorio =(int) (Math.random()*3);

        opcoesDeValores.add(ValoresDoJogo.BANANA);
        opcoesDeValores.add(ValoresDoJogo.MORANGO);
        opcoesDeValores.add(ValoresDoJogo.ESTRELA);

        frutaSorteada = opcoesDeValores.get(indexAleatorio);
        return frutaSorteada;
    }

    public  ValoresDoJogo gerarValorAleatorioNivel2() {
        indexAleatorio =(int) (Math.random()*5);

        opcoesDeValores.add(ValoresDoJogo.ESTRELA);
        opcoesDeValores.add(ValoresDoJogo.CARRINHO);
        opcoesDeValores.add(ValoresDoJogo.RATO);
        opcoesDeValores.add(ValoresDoJogo.PIZZA);
        opcoesDeValores.add(ValoresDoJogo.FOGUETE);

        frutaSorteada = opcoesDeValores.get(indexAleatorio);
        return frutaSorteada;
    }

    public  ValoresDoJogo gerarValorAleatorioNivel3() {
        indexAleatorio =(int) (Math.random()*7);

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
