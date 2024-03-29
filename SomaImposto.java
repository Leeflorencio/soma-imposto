import java.util.Scanner;

public class SomaImposto {
    public double somaImposto(double taxaImposto, double custo){
        double valorImposto = custo * (taxaImposto / 100);
        return custo + valorImposto;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int taxa = 0;
        double valorProduto = 0.0;

        SomaImposto imposto = new SomaImposto();

        System.out.println("Informe o valor da taxa de imposto: ");
        taxa = sc.nextInt();

        System.out.println("Informe o valor do produto: ");
        valorProduto = sc.nextDouble();

        double resultado = imposto.somaImposto(taxa, valorProduto);

        System.out.println("----------------");
        System.out.println("Taxa de imposto: " + taxa + "%");
        System.out.println("Valor do produto: " + valorProduto);
        System.out.println("Valor do produto com imposto: " + resultado);

    }
}
