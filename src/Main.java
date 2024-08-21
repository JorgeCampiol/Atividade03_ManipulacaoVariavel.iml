import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Declaração das variáveis
        String nomeProduto;
        double precoUnitario;
        int quantidadeComprada;
        double taxaImposto;
        double margemLucro;

        // Atribuição de valores às variáveis
        nomeProduto = "Cadeira Gamer";
        precoUnitario = 365.00;
        quantidadeComprada = 5;
        taxaImposto = 0.03; // 3% de imposto
        margemLucro = 0.75; // 75% de margem de lucro

        // Cálculo do valor total sem impostos
        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;

        // Cálculo do valor do imposto
        double valorImposto = valorTotalSemImpostos * taxaImposto;

        // Cálculo do valor total com impostos
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;

        // Cálculo do preço de venda necessário para alcançar a margem de lucro desejada
        double precoVendaNecessario = valorTotalComImpostos * (1 + margemLucro);

        // Arredondar o preço de venda para duas casas decimais
        precoVendaNecessario = Math.round(precoVendaNecessario * 100.0) / 100.0;

        // Formatação como moeda
        NumberFormat moeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String valorTotalComImpostosFormatado = moeda.format(valorTotalComImpostos);
        String precoVendaNecessarioFormatado = moeda.format(precoVendaNecessario);

        // Exibição dos resultados
        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: " + moeda.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Valor Total Sem Impostos: " + moeda.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: " + moeda.format(valorImposto));
        System.out.println("Valor Total Com Impostos: " + valorTotalComImpostosFormatado);
        System.out.println("Preço de Venda Necessário: " + precoVendaNecessarioFormatado);

        // Mensagem final formatada
        String mensagemFinal = String.format(
                "Produto: %s\nValor Total com Impostos: %s\nPreço de Venda Sugerido: %s",
                nomeProduto,
                valorTotalComImpostosFormatado,
                precoVendaNecessarioFormatado
        );

        System.out.println("\n" + mensagemFinal);

    }
}