package empresa;

/** Criação da classe derivada Serviços Gerais, que recebe atributos e métodos da classe funcionário. Nessa classe estão englobados servidores como faxineiros
 * , motoristas, office boys e responsáveis pela manutenção predial. */
public class ServicosGerais extends Funcionario {
	public ServicosGerais(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade) {
	    super(nome, salarioBase, email, endereco, telefone, cpf, idade);
	}

    @Override
    public double calcularFolhaDePagamento() {
    	return this.calcularSalarioLiquido(); // Retornará o salário líquido após todos os descontos
    }
}