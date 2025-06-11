package CalcularValorAtributo;

public class SaudeBemEstar extends Produto {

    public SaudeBemEstar(String nome, double preco) {
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
