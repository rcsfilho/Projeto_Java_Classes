package empresa;

/** Criação da classe derivada Analista, que recebe atributos e métodos da classe funcionário */
/** Nessa classe acrescentamos o banco de horas, tal fator serve para abatimentos de tempo na jornada de trabalho.*/
public class AnalistaMarketing extends Funcionario {
	private Trabalho trabalho;
	public AnalistaMarketing(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade, Trabalho trabalho) {
	    super(nome, salarioBase, email, endereco, telefone, cpf, idade);
	    this.trabalho = trabalho;
	}

    @Override
    public double calcularFolhaDePagamento() {
    	// Calcule o banco de horas a partir do objeto Trabalho
        double bancoDeHoras = trabalho.calcularBancoDeHoras();
        
        // Exiba o banco de horas para saber quantos horas podem ser abatidas em uma jornada mensal
        System.out.println("Banco de Horas: " + String.format("%.2f", bancoDeHoras) + " horas");

		return this.calcularSalarioLiquido(); // Retornará o salário líquido após todos os descontos
    }
}