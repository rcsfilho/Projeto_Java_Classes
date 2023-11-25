package empresa;

/** Criação da classe derivada Desenvolvedor, que recebe atributos e métodos da classe funcionário */
/** Nessa classe acrescentamos a contabilização de horas extras conforme valor de hora extra pesquisado.*/
/** Englobamos a categoria em três níveis, a saber júnior, pleno e senior. Os valores foram baseados em dados de pesquisa de mercado .*/
public class Desenvolvedor extends Funcionario {
    private int nivel; // Nível do desenvolvedor (sênior, pleno, júnior)
    private Trabalho trabalho; // Objeto para representar o tempo de trabalho do desenvolvedor

    public Desenvolvedor(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade, int nivel, Trabalho trabalho) {
        super(nome, salarioBase, email, endereco, telefone, cpf, idade);
        this.nivel = nivel;
        this.trabalho = trabalho;
    }

    @Override
    public double calcularFolhaDePagamento() {
    	double valorHoraNormal = 0;
        double valorHoraExtra = 0;

        if (nivel == 1) { // Nível Junior
            valorHoraNormal = 29.50;
            valorHoraExtra = valorHoraNormal + (0.5 * 29.50);
        } else if (nivel == 2) { // Nível Pleno
            valorHoraNormal = 42.00;
            valorHoraExtra = valorHoraNormal + (0.5 * 42.00);
        } else if (nivel == 3) { // Nível Sênior
            valorHoraNormal = 67.90;
            valorHoraExtra = valorHoraNormal + (0.5 * 67.90);
        }

        // Obtenha as horas extras do objeto Trabalho
        double horasExtras = trabalho.calcularHorasExtras();
        System.out.println("Horas Extras: " + String.format("%.2f", horasExtras) + " horas");

        // Cálculo do bônus a partir da hora extra
        double bonusHorasExtras = 0;
        if (horasExtras > 0) {
            bonusHorasExtras = horasExtras * valorHoraExtra;
        }
        System.out.println("Bonus horas extras: " + String.format("%.2f", bonusHorasExtras) + " reais");

        // Cálculo do salário líquido incluindo o bônus das horas extras
        double salarioLiquido = this.calcularSalarioLiquido() + bonusHorasExtras;

        return salarioLiquido;
    }

    public int getNivel() {
        return nivel;
    }
}




