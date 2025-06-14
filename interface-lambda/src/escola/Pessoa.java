package escola;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String RG;
    private String cpf;
    private String nomePai;
    private String nomeMae;

    public Pessoa(){}

    public Pessoa(String nome, int idade,
                  String dataNascimento, String RG, String cpf,
                  String nomeMae, String nomePai) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.cpf = cpf;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }

    public abstract double salario();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", RG='" + RG + '\'' +
                ", cpf='" + cpf + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                '}';
    }
}
