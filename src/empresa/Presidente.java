package empresa;

/** Criação da classe derivada Presidente, que recebe atributos e métodos da classe funcionário */
public class Presidente extends Funcionario {
	public Presidente(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade) {
	    super(nome, salarioBase, email, endereco, telefone, cpf, idade);
	}

    @Override
    public double calcularFolhaDePagamento() {
    	return this.calcularSalarioLiquido(); // Retornará o salário líquido após todos os descontos
    }
}