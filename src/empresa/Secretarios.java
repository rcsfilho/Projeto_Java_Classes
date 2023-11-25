package empresa;

/** Criação da classe derivada Secretários, que recebe atributos e métodos da classe funcionário */
/** Nessa classe acrescentamos a contabilização de horas extras conforme valor de hora extra pesquisado.*/
public class Secretarios extends Funcionario {
	private Trabalho trabalho;
	 public Secretarios (String nome, double salarioBase, String email, String endereco, String telefone, String cpf,int idade, int nivel, double bonus, Trabalho trabalho) {
	        super(nome, salarioBase, email, endereco, telefone, cpf, idade);
	this.trabalho = trabalho; 
	}
	 
	@Override
    public double calcularFolhaDePagamento() {
        double valorHoraNormal = 35.00;
        double valorHoraExtra = valorHoraNormal + (35.00 * 0.5);
        
        double descontoINSS = calcularDescontoINSS();
        double descontoIR = calcularDescontoIR();
        double abatimentoSalario = calcularAbatimentoSalario();
        double abatimentoPlanoSaude = calcularAbatimentoPlanoSaude(); 
        double salarioLiquido = calcularSalarioLiquido(); 
        
        // Obtenha as horas extras do objeto Trabalho
        double horasExtras = trabalho.calcularHorasExtras();

        // Cálculo do bônus a partir da hora extra
        double bonusHorasExtras = 0;
        if (horasExtras > 0) {
            bonusHorasExtras = horasExtras * valorHoraExtra;
        }

        // Calcule a folha de pagamento final para Secretários
        double folhaDePagamento = getSalarioBase() - descontoINSS - descontoIR - abatimentoSalario - abatimentoPlanoSaude + salarioLiquido + bonusHorasExtras;

        return folhaDePagamento;
    }
}
