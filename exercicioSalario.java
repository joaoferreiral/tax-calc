import java.util.Scanner;
public class exercicioSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o salário do colaborador: R$ ");
        double salarioColaborador = sc.nextDouble();

        String tipoDesconto = defineDesconto(salarioColaborador);
        double porcentagemDesconto = calculaPorcentagem(salarioColaborador);
        double valorDesconto = calcularValorDesconto(salarioColaborador, porcentagemDesconto);
        System.out.println("Salário líquido: R$ " + (salarioColaborador - valorDesconto));
        System.out.println("Porcentagem do desconto: " + porcentagemDesconto + "%");
        System.out.println("Valor do desconto: " + valorDesconto);
        System.out.print("Desconto: " + tipoDesconto);
    }

        static double calculaPorcentagem(double salarioColaborador) {
            if (salarioColaborador <= 2000) {
                return 0.0;
            } else if (salarioColaborador < 4000) {
                return 2.0;
            } else {
                return 4.0;
            }
        }
        static double calcularValorDesconto(double salarioColaborador, double porcentagemDesconto) {
            double valorDesconto = salarioColaborador * porcentagemDesconto / 100;
            return valorDesconto;
        }
        static String defineDesconto(double salarioColaborador) {
        if (salarioColaborador <= 2000) {
            return "Isento";
        } else if (salarioColaborador < 4000) {
            return "Mínimo";
        } else if (salarioColaborador <= 9999){
            return "Médio";
        } else {
            return "Máximo";
        }

    }
}