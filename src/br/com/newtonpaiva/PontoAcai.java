package br.com.newtonpaiva;
import javax.swing.JOptionPane;
public class PontoAcai {
    public static void main(String[] args) {
        String[] opcoesTamanho = {"300ml", "500ml", "700ml"};
        String tamanhoEscolhido = (String)
                JOptionPane.showInputDialog(null, "Informe o tamanho do Açaí desejado:", "Tamanho do Açaí", JOptionPane.PLAIN_MESSAGE, null,
        opcoesTamanho, opcoesTamanho[0]);
        int tamanho = 0;
        switch (tamanhoEscolhido) {
            case "300ml":
                tamanho = 300;
                break;
            case "500ml":
                tamanho = 500;
                break;
            case "700ml":
                tamanho = 700;
                break;
        }
        int respostaAcrescimo = JOptionPane.showConfirmDialog(null,
                "Deseja acrescentar sorvete?", "Acrescentar sorvete",
                JOptionPane.YES_NO_OPTION);
        boolean acrescimoSorvete = respostaAcrescimo ==
                JOptionPane.YES_OPTION;
        Acai acai = new Acai(tamanho, acrescimoSorvete);
        JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: R$"+String.format("%.2f",acai.calcularValor()),"Valor do Açaí",
        JOptionPane.PLAIN_MESSAGE);
    }
}