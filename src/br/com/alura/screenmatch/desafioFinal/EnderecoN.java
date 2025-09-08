package br.com.alura.screenmatch.desafioFinal;

public class EnderecoN {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;

    public EnderecoN(Endereco endereco) {
        this.cep = endereco.cep();
        this.logradouro = endereco.logradouro();
        this.complemento = endereco.complemento();
        this.bairro = endereco.bairro();
        this.localidade = endereco.localidade();
    }

    public String getCep() {
        return this.cep;
    }
    @Override
    public String toString() {
        return "Cep: " + this.cep + "\nLogradouro: " + this.logradouro + "\nComplemento: " + this.complemento +
                "\nBairro: " + this.bairro + "\nLocalidade: " + this.localidade;
    }
}
