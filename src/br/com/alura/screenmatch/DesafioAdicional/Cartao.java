package br.com.alura.screenmatch.DesafioAdicional;

public class Cartao {
    private double limite;

    public Cartao(double valor) {
        if (valor <= 0) {
            System.out.println("Não é possível iniciar o seu limite com valores negativos ou igual a 0.");
        } else this.limite = valor;
    }

    public void setLimite(double valor) {
        this.limite = valor;
    }

    public double getLimite() {
        return this.limite;
    }
}
