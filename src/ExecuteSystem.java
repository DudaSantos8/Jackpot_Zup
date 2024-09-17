import java.util.ArrayList;
import java.util.List;

public class ExecuteSystem {

    public static void runExecute(){
        String valorAleatorioNome = "";
        int pontucaoBonus = 0;
        int controladorWhile = 0;
        int alavanca = IO.menu();
        int pontuacaoFinal = 0;
        List<String> valoresSoteados = new ArrayList<>();


        while (controladorWhile < 8) {
            ValoresDoJogo valorAleatorio = GerarValores.gerarValorAleatorio();
            pontuacaoFinal += valorAleatorio.getPontos();

            if(controladorWhile == 0 ||valorAleatorio.getNome().equals(valorAleatorioNome)){
                valorAleatorioNome = valorAleatorio.getNome();
                pontucaoBonus += 1;
            }

            if(pontucaoBonus == 8){
                pontuacaoFinal = valorAleatorio.getPontos() * 100;
            } else if (pontucaoBonus == 5) {
                pontuacaoFinal = valorAleatorio.getPontos() * 100;
            } else if (pontucaoBonus == 3) {
                pontuacaoFinal = valorAleatorio.getPontos() * 100;
            }
            if(controladorWhile == 0){
                if (alavanca == 1){
                    controladorWhile = 5;
                } else if (alavanca == 2) {
                    controladorWhile = 3;
                } else if (alavanca == 3) {
                    controladorWhile = 1;
                }else throw new RuntimeException("Valor inválido");
            }

            valoresSoteados.add(valorAleatorio.toString());
            controladorWhile++;
        }

        System.out.println("----------------------------");
        System.out.println("Valores sorteados: \n" + valoresSoteados);
        System.out.println("\nPontuação final: " + pontuacaoFinal);
        System.out.println("----------------------------");
    }

}
