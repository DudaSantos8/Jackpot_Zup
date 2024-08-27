public class ExecuteSystem {

    public static void runExecute(){
        int pontuacaoFinal = 0;
        int controladorFor;
        String mensagemPontuacaoBonus = "";

        int alavanca = IO.menu();
        if (alavanca == 1){
            controladorFor = 5;
        } else if (alavanca == 2) {
            controladorFor = 3;
        } else if (alavanca == 3) {
            controladorFor = 0;
        }else throw new RuntimeException("Valor inválido");

        pontuacaoFinal = gerarPontuacao(alavanca, controladorFor, pontuacaoFinal);
        if(pontuacaoFinal > 480){
            mensagemPontuacaoBonus = "\nParabens todos os seus valores foram iguais";
        }
        System.out.println("----------------------------");
        System.out.println("Sua pontuação final foi: "+pontuacaoFinal + mensagemPontuacaoBonus);
        System.out.println("----------------------------");
    }

    public static int gerarPontuacao(int alavanca, int controladorFor, int pontuacaoFinal){
        GerarValores gerarValores = new GerarValores();
        ValoresDoJogo pontos = null;
        String valorSortidoParaConparar1 = "";
        String valorSortidoParaConparar2;
        int somaIgualdadeDosValoresDeComparacao = 0;
        int iniciarValorDeComparacao = 0;
        while (controladorFor < 8) {
            switch (alavanca){
                case 1: pontos = gerarValores.gerarValorAleatorioNivel1();
                    break;
                case 2: pontos = gerarValores.gerarValorAleatorioNivel2();
                    break;
                case 3: pontos = gerarValores.gerarValorAleatorioNivel3();
                    break;
            }
            assert pontos != null;
            pontuacaoFinal += pontos.getPontos();
            valorSortidoParaConparar2 = pontos.getNome();

            if(iniciarValorDeComparacao == 0){
                valorSortidoParaConparar1 = valorSortidoParaConparar2;
                iniciarValorDeComparacao++;
            }

            if ( valorSortidoParaConparar1.equals(valorSortidoParaConparar2)){
                valorSortidoParaConparar1 = valorSortidoParaConparar2;
                somaIgualdadeDosValoresDeComparacao ++;
            }

            if (somaIgualdadeDosValoresDeComparacao == 3 ||
                    somaIgualdadeDosValoresDeComparacao == 5 || somaIgualdadeDosValoresDeComparacao == 7){
                pontuacaoFinal *= 100;
            }
            System.out.println(pontos);
            controladorFor++;
        }
        return pontuacaoFinal;
    }
}
