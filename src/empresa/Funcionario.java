package empresa;


/**Criação das classe base funcionário e dos metodos de calculos para folha de pagamento.
 * Colocamos a classe em modo abstrato pois as demais classes suprem seus atributos e métodos.
 Consideramos apenas pessoas físicas no programa para demonstrar os cálculos*/
/**Empregamos um metodo de folha de pagamento para imprimir as informações por desconto,
 * ao longo do programa adicionamos pequenas peculiaridades em algumas classes pois decidimos que horas extras e banco de horas são mais comumente 
empregados em classes hierarquicas mais baixas, não sendo comum para classes de diretoria. */
/** utilizamos getters e setters para "capturar" os valores das variáveis.  */

public abstract class Funcionario {
    private String nome;
    private double salarioBase;
    private int idade;
    private String email;
    private String endereco;
    private String telefone;
    private String cpf;

    /** Método construtor para a classe. */
    public Funcionario(String nome, double salarioBase, String email, String endereco, String telefone, String cpf, int idade) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.idade = idade;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
    	return idade; 
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
    
    /** Métodos de cálculo baseados na legislação trabalhista para folha de pagamento.  */
    public abstract double calcularFolhaDePagamento();

    public double calcularDepositoFGTS() {
    	double FGTS = salarioBase * 0.08;
        return FGTS;
    }

    public double calcularDescontoINSS() {
        double salario = getSalarioBase();
        double descontoINSS;
        if (salario <= 1320.00) {
            descontoINSS = salario * 0.075;
        } else if (salario <= 2571.29) {
            descontoINSS = salario * 0.09;
        } else if (salario <= 3856.94) {
            descontoINSS = salario * 0.12;
        } else if (salario <= 7507.49) {
            descontoINSS = salario * 0.14;
        } else {
            descontoINSS = 7507.49 * 0.14;
        }
        return descontoINSS;
    }

    public double calcularDescontoIR() {
        double salario = salarioBase;
        double descontoINSS = calcularDescontoINSS();
        double baseCalculo = salario - descontoINSS;
        double descontoIR;

        if (baseCalculo <= 1903.98) {
            descontoIR = 0;
        } else if (baseCalculo <= 2826.65) {
            descontoIR = (baseCalculo * 0.075) - 142.80;
        } else if (baseCalculo <= 3751.05) {
            descontoIR = (baseCalculo * 0.15) - 354.80;
        } else if (baseCalculo <= 4664.68) {
            descontoIR = (baseCalculo * 0.225) - 636.13;
        } else {
            descontoIR = (baseCalculo * 0.275) - 869.36;
        }
        return descontoIR;
    }

    public double calcularAbatimentoSalario() {
        double descontoINSS = this.calcularDescontoINSS(); // Use 'this' para deixar claro que é um método da própria classe
        double descontoIR = this.calcularDescontoIR();
        double salarioLiquido = this.getSalarioBase() - descontoINSS - descontoIR;
        double descontoValeTransporte = salarioLiquido * 0.06;
        return descontoValeTransporte;        
    }

    public double calcularAbatimentoPlanoSaude() {
        double descontoINSS = this.calcularDescontoINSS();
        double descontoIR = this.calcularDescontoIR();
        double salarioLiquido = this.getSalarioBase() - descontoINSS - descontoIR;
        double descontoValeTransporte = this.calcularAbatimentoSalario();
        salarioLiquido -= descontoValeTransporte;
        double descontoPlanoSaude = salarioLiquido * 0.03;
        return descontoPlanoSaude;
    }

    /** Método para impressão por desconto e com isso facilitar entendimento dos cálculos */
    public double calcularSalarioLiquido() {
    	// Calcula os descontos apenas uma vez
        double descontoINSS = calcularDescontoINSS();
        System.out.println("Desconto INSS: " + String.format("%.2f", descontoINSS));
        
        double descontoIR = calcularDescontoIR();
        System.out.println("Desconto IR: " + String.format("%.2f", descontoIR));
        
        // Passa o descontoINSS e descontoIR já calculados para evitar recálculo
        double descontoValeTransporte = calcularAbatimentoSalario();
        System.out.println("Desconto Vale Transporte: " + String.format("%.2f", descontoValeTransporte));
        
        // Usa os valores de descontoINSS e descontoIR para calcular o desconto do plano de saúde
        double descontoPlanoSaude = calcularAbatimentoPlanoSaude();
        System.out.println("Desconto Plano de Saúde: " + String.format("%.2f", descontoPlanoSaude));
        
        // Calcula o salário líquido usando todos os descontos
        double salarioLiquido = getSalarioBase() - descontoINSS - descontoIR - descontoValeTransporte - descontoPlanoSaude;
        System.out.println("O valor do salario líquido foi de :" + String.format("%.2f", salarioLiquido));

        return salarioLiquido;
    }
}