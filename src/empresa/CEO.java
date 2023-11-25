package empresa;

/** Criação da classe derivada CEO, que recebe atributos e métodos da classe funcionário */
public class CEO extends Funcionario {
    public CEO(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade) {
    	 super(nome, salarioBase, email, endereco, telefone, cpf, idade);
    }

    @Override
    public double calcularFolhaDePagamento() {
    	return this.calcularSalarioLiquido(); // Retornará o salário líquido após todos os descontos
    }
}