import CalcularValorAtributo.*;
import EnvioDeMensagens.EnviadorDeMarketing;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnviadorDeMarketing enviador = new EnviadorDeMarketing();
        System.out.println();
        enviador.enviarMensagemParaTodos("Promoção imperdível! Só hoje com 50% de desconto!");

        System.out.println();

        List<Produto> produtos = Arrays.asList(
                new Alimentacao("Arroz", 10.00),
                new SaudeBemEstar("Vitaminas", 50.00),
                new Vestuario("Camisa", 100.00),
                new Cultura("Livro", 60.00)
        );

        for (Produto produto : produtos) {
            System.out.printf("Produto: %s | Preço: R$%.2f | Imposto: R$%.2f | Preço total: R$%.2f%n",
                    produto.getNome(),
                    produto.getPreco(),
                    produto.calcularImposto(),
                    produto.getPreco() + produto.calcularImposto());
        }
    }
}
