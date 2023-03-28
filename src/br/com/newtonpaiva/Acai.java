package br.com.newtonpaiva;
public class Acai {
    private int tamanho; // tamanho em ml
    private double valor;
    private boolean acrescimoSorvete;
    public Acai(int tamanho, boolean acrescimoSorvete) {
        this.tamanho = tamanho;
        this.acrescimoSorvete = acrescimoSorvete;
        if (tamanho == 300) {
            this.valor = 8.00;
        } else if (tamanho == 500) {
            this.valor = 10.00;
        } else if (tamanho == 700) {
            this.valor = 12.00;
        }
        if (acrescimoSorvete) {
            this.valor += 2.00;
        }
    }
    public double calcularValor(){
        return this.valor;
    }
}