public class ExecuteSystem {

    public static void runExecute(){
        String mensagem = "";
        int controladorFor;
        int alavanca = IO.menu();
        if (alavanca == 1){
            controladorFor = 5;
        } else if (alavanca == 2) {
            controladorFor = 3;
        } else if (alavanca == 3) {
            controladorFor = 0;
        }else throw new RuntimeException("Valor inválido");

        int pontuacaoFinal = gerarPontuacao(alavanca, controladorFor);

        if(pontuacaoFinal == 12000){
            mensagem = MensagemPontuacaoBonus.NIVEL1.getMensagemPontuacaoBonus();
        } else if (pontuacaoFinal == 35000) {
            mensagem = MensagemPontuacaoBonus.NIVEL2.getMensagemPontuacaoBonus();
        } else if (pontuacaoFinal == 49000) {
            mensagem = MensagemPontuacaoBonus.NIVEL3.getMensagemPontuacaoBonus();
        }

        System.out.println("----------------------------");
        System.out.println("Sua pontuação final foi: "+pontuacaoFinal);
        System.out.println(mensagem);
        System.out.println("----------------------------");
    }

    private static int gerarPontuacao(int alavanca, int controladorFor){
        GerarValores gerarValores = new GerarValores();
        ValoresDoJogo pontos = null;

        String confirmarOpcaoParaBonus = "";
        String valorSortidoParaConparar1 = "";
        String valorSortidoParaConparar2;
        int somaIgualdadeDosValoresDeComparacao = 0;
        int pontuacaoFinal = 0;
        int iniciarValorDeComparacao = 0;

        while (controladorFor < 8) {
            switch (alavanca){
                case 1: pontos = gerarValores.gerarValorAleatorioNivel1();
                    confirmarOpcaoParaBonus = "nivel1";
                    break;
                case 2: pontos = gerarValores.gerarValorAleatorioNivel2();
                    confirmarOpcaoParaBonus = "nivel2";
                    break;
                case 3: pontos = gerarValores.gerarValorAleatorioNivel3();
                    confirmarOpcaoParaBonus = "nivel3";
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

            if (somaIgualdadeDosValoresDeComparacao == 3 & confirmarOpcaoParaBonus.equals("nivel1")){
                pontuacaoFinal *= 100;
            } else if (somaIgualdadeDosValoresDeComparacao == 5 & confirmarOpcaoParaBonus.equals("nivel2")) {
                pontuacaoFinal *= 100;
            } else if (somaIgualdadeDosValoresDeComparacao == 7 & confirmarOpcaoParaBonus.equals("nivel3")) {
                pontuacaoFinal *= 100;
            }
            System.out.println(pontos);
            controladorFor++;
        }
        return pontuacaoFinal;
    }
}
