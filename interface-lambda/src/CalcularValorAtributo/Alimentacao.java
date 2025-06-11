package CalcularValorAtributo;

public class Alimentacao extends Produto {
    public Alimentacao(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.025;
    }
    @Override
    public double precoTotal() {
        double sum = 0.0;
        return sum = getPreco() * calcularImposto();
    }
}
