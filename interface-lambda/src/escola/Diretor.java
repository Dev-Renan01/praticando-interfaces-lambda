package escola;

public class Diretor extends Pessoa{

    private String registroEducacao;
    private String tempoDirecao;
    private String titulacao;

    public String getRegistroEducacao() {
        return registroEducacao;
    }

    public void setRegistroEducacao(String registroEducacao) {
        this.registroEducacao = registroEducacao;
    }

    public String getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(String tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public double salario(){
        return 1800.80 * 0.9;
    }
}
