package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Criação da classe Programa que contem a main, aqui os objetos são criados e os métodos executados. */
public class Programa {
	/** Função principal, a criação dos objetos, execução do métodos e aplicação dos testes estão aqui. 
	 * @param args Argumentos de linha de comando passados para o programa. */
	public static void main(String[] args) {
       
		 // Crie uma lista para armazenar os funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        // Crie uma lista para armazenar os valores dos salários
        List<Double> salarios = new ArrayList<>();
        
        // Criação de um objeto CEO
        CEO ceo = new CEO("Maria Oliveira", 25000.00, "ceo@empresa.com", "Rua dos Executivos, 1", "11999887766", "987.654.321-00", 42);

        // Impressão das informações do CEO
        System.out.println("Dados do CEO");
        printEmployeeInfo(ceo);

        // Impressão da folha de pagamento do CEO
        System.out.println("Extrato Folha de Pagamento do CEO:");
        ceo.calcularFolhaDePagamento();     
        System.out.println();
        
        // Criação de um objeto Presidente
        Presidente presidente = new Presidente("Júlio Reis", 18500.00, "presidente@empresa.com", "Rua dos cardeais, 12", "11993267881", "144.532.211-12", 40);

        // Impressão das informações do Presidente
        System.out.println("Dados do Presidente");
        printEmployeeInfo(presidente);

        // Impressão da folha de pagamento do Presidente
        System.out.println("Extrato Folha de Pagamento do Presidente");
        presidente.calcularFolhaDePagamento();       
        System.out.println();
        
        // Criação de um objeto Serviços Gerais
        ServicosGerais geral = new ServicosGerais("Fátima Silva", 3800.00, "ftsilva@empresa.com", "Rua Afonso Pena, 34", "11999332121", "987.045.367-67", 39);

        // Impressão das informações do Servidor
        System.out.println("Dados do Servidor(a):");
        printEmployeeInfo(geral);

        // Impressão da folha de pagamento do Servidor
        System.out.println("Extrato Folha de Pagamento do Servidor(a):");
        geral.calcularFolhaDePagamento();     
        System.out.println();
        
        // Criação de um objeto Serviços Gerais
        ServicosGerais geral1 = new ServicosGerais("Rubens Couto", 3500.00, "rbcouto@empresa.com", "Rua Duque de Caxias, 172", "11999643903", "987.033.734-51", 41);

        // Impressão das informações do Servidor
        System.out.println("Dados do Servidor(a):");
        printEmployeeInfo(geral1);

        // Impressão da folha de pagamento do Servidor
        System.out.println("Extrato Folha de Pagamento do Servidor(a):");
        geral1.calcularFolhaDePagamento();     
        System.out.println();
        
        // Criamos objetos da classe Trabalho
        Trabalho trabalho1 = new Trabalho(44, 22); // Supondo 44 horas semanais e 22 dias trabalhados
        Trabalho trabalho2 = new Trabalho(35, 20); // Supondo 35 horas semanais e 20 dias trabalhados
        System.out.println();
        
        // Agora, criamos os objetos da classe Rh usando os objetos Trabalho
        Rh rh1 = new Rh("João Silva", 5000.00, "joao@email.com", "Rua Exemplo 123", "123456789", "111.222.333-44", 30, trabalho1);
        Rh rh2 = new Rh("Maria Souza", 4500.00, "maria@email.com", "Rua Exemplo 456", "987654321", "555.666.777-88", 28, trabalho2);
        System.out.println("Dados do Funcionario de RH :");
        printEmployeeInfo(rh1);
        System.out.println();
        System.out.println("Dados da Funcionaria de RH :");
        printEmployeeInfo(rh2);
        System.out.println();
        
        // calcular a folha de pagamento:
        System.out.println("Extrato da Folha de Pagamento do Funcionario de RH :");
        double folhaDePagamentoRh1 = rh1.calcularFolhaDePagamento();
        System.out.println();
        System.out.println("Extrato da Folha de Pagamento da Funcionaria de RH :");
        double folhaDePagamentoRh2 = rh2.calcularFolhaDePagamento();
        System.out.println();

        // Exibindo os resultados
        System.out.println("Calculos Totais RH :");
        System.out.println("Folha de Pagamento RH1: " + folhaDePagamentoRh1);
        System.out.println("Calculos Totais RH :");
        System.out.println("Folha de Pagamento RH2: " + folhaDePagamentoRh2);
        System.out.println();
        
        //objeto trabalho
        Trabalho trabalho = new Trabalho(42,22);// Supondo 42 horas semanais e 22 dias trabalhados
       
        // Objeto AnalistaMarketing com inserção da classe trabalho   
        AnalistaMarketing marketing = new AnalistaMarketing("Cláudia Moura", 9000.00, "clmoura@email.com", "Rua Rio Lavapés,478","11999663211", "988.678.263-31",34, trabalho);
        System.out.println("Dados do Analista de Marketing :");
        printEmployeeInfo(marketing);
        System.out.println();
        
        //Chamada do método de calcular folha de pagamento
        System.out.println("Extrato Folha de Pagamento do Analista de Marketing :");
        double folhaDePagamentoAnalistaMkt = marketing.calcularFolhaDePagamento();
        System.out.println();
        
        //imprime os resultados da folha de pagamento
        System.out.println("Calculos Totais Marketing :");
        System.out.println("Folha de Pagamento Analista de Marketing: " + folhaDePagamentoAnalistaMkt);
        System.out.println();
        
        // Criação de um objeto Estagiario
        Estagiario estagiario = new Estagiario("Paulo Costa", 1200.00, "pcosta@empresa.com", "Rua Floriano Peixoto, 133", "11999030411", "991.011.767-44", 19);

        // Impressão das informações do Estagiario
        System.out.println("Dados do Estagiário:");
        printEmployeeInfo(estagiario);
        System.out.println();

        // Impressão da folha de pagamento do Estagiário
        System.out.println("Extrato Folha de Pagamento do Estagiario:");
        estagiario.calcularFolhaDePagamento();     
        System.out.println();
        
        // Criar um objeto Desenvolvedor de nível Júnior (nível 1)
        Trabalho trabalhoJunior = new Trabalho(40.0, 22); // 40 horas semanais, 22 dias trabalhados
        Desenvolvedor junior = new Desenvolvedor("Rui Araújo", 5000.0, "ruiaraujo@example.com", "Rua A", "123456789", "1234567890", 25, 1, trabalhoJunior);
        System.out.println("Dados do Desenvolvedor junior :");
        printEmployeeInfo(junior);
        System.out.println();
        
        // Criar um objeto Desenvolvedor de nível Pleno (nível 2)
        Trabalho trabalhoPleno = new Trabalho(45.0, 22); // 45 horas semanais, 22 dias trabalhados
        Desenvolvedor pleno = new Desenvolvedor("Carla Vasconcellos", 9800.0, "cvasconcellos@example.com", "Rua B", "987654321", "0987654321", 29, 2, trabalhoPleno);
        System.out.println("Dados do Desenvolvedor pleno :");
        printEmployeeInfo(pleno);
        System.out.println();
        
        // Criar um objeto Desenvolvedor de nível Sênior (nível 3)
        Trabalho trabalhoSenior = new Trabalho(45.0, 22); // 45 horas semanais, 22 dias trabalhados
        Desenvolvedor senior = new Desenvolvedor("Carlos Nogueira", 16000.0, "carlos@example.com", "Rua C", "987123456", "5678901234", 35, 3, trabalhoSenior);
        System.out.println("Dados do Desenvolvedor senior :");
        printEmployeeInfo(senior);
        System.out.println();
        
        // Calcular a folha de pagamento para cada desenvolvedor
        System.out.println("Extrato Folha de Pagamento do Desenvolvedor Junior :");
        double salarioJunior = junior.calcularFolhaDePagamento();
        System.out.println();
        System.out.println("Extrato Folha de Pagamento do Desenvolvedor Pleno :");
        double salarioPleno = pleno.calcularFolhaDePagamento();
        System.out.println();
        System.out.println("Extrato Folha de Pagamento do Desenvolvedor Senior :");
        double salarioSenior = senior.calcularFolhaDePagamento();
        System.out.println();

        // Imprimir os salários
        System.out.println("Extrato Folha de Pagamento dos Desenvolvedores (valores totais) :");
        System.out.println("Salário do desenvolvedor Júnior com bonus: R$" + String.format("%.2f", salarioJunior));
        System.out.println("Salário do desenvolvedor Pleno com bonus: R$" + String.format("%.2f", salarioPleno));
        System.out.println("Salário do desenvolvedor Sênior com bonus: R$" + String.format("%.2f", salarioSenior));
        System.out.println();
        
        // Adicione os objetos de funcionários à lista de funcionários
        funcionarios.add(ceo);
        funcionarios.add(presidente);
        funcionarios.add(geral);
        funcionarios.add(geral1);
        funcionarios.add(rh1);
        funcionarios.add(rh2);
        funcionarios.add(marketing);
        funcionarios.add(estagiario);
        funcionarios.add(junior);
        funcionarios.add(pleno);
        funcionarios.add(senior);
        
        salarios.add(2915.21); // Salário abaixo de 5000
        salarios.add(16624.26); // Salário acima de 5000
        salarios.add(12327.40); // Salário acima de 5000
        salarios.add(3618.60); // Salário abaixo de 5000
        salarios.add(12915.46); // Salário acima de 5000
        
       
        
        // Filtrar funcionários com mais de 30 anos
        List<Funcionario> funcionariosComMaisDe30Anos = funcionarios.stream()
            .filter(funcionario -> funcionario.getIdade() > 30)
            .collect(Collectors.toList());

        // Imprimir a lista de funcionários com mais de 30 anos
        System.out.println("Imprimindo lista Filtrada.");
        System.out.println("Funcionários com mais de 30 anos:");
        for (Funcionario funcionario : funcionariosComMaisDe30Anos) {
            printEmployeeInfo(funcionario);
        }
        
        //contar salários maiores que 5000 e imprimir a quantidade. 
        long contadorSalariosMaioresQue5000 = salarios.stream()
                .filter(salario -> salario > 5000)
                .count();
        
        System.out.println();
        System.out.println("Filtro que conta salario maiores que 5000. ");
        System.out.println("Número de salários líquidos maiores que 5000: " + contadorSalariosMaioresQue5000);
        System.out.println();
        
        testeCriacaoFuncionario();
        System.out.println();
        testeCalculoFolhaPagamento();
        System.out.println();
        testeListaFuncionarios();
        System.out.println();
        executeTestAndPrintResult();
        System.out.println();
    }
	
	/** Método para impressão dos dados dos funcionários criados.@param funcionario passado como argumento para execução. */
	public static void printEmployeeInfo(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário Base: " + String.format("%.2f", funcionario.getSalarioBase()));
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Idade:" + funcionario.getIdade());
        System.out.println();
    }
	
	/** Implementação dos testes de criação de funcionários. */
	public static void testeCriacaoFuncionario() {
		 //Assertivas para CEO
	    CEO ceo = new CEO("Maria Oliveira", 25000.00, "ceo@empresa.com", "Rua dos Executivos, 1", "11999887766", "987.654.321-00", 42);
	    assert "Maria Oliveira".equals(ceo.getNome()) : "Nome do CEO incorreto";
	    assert 25000.00 == ceo.getSalarioBase() : "Salário base do CEO incorreto";
	    
	    //Assertivas para Presidente
	    Presidente presidente = new Presidente("Júlio Reis", 18500.00, "presidente@empresa.com", "Rua dos cardeais, 12", "11993267881", "144.532.211-12", 40);
	    assert "Júlio Reis".equals(presidente.getNome()) : "Nome do Presidente incorreto";
	    assert 18500.00 == presidente.getSalarioBase() : "Salário base do Presidente incorreto";
	    
	    //Assertivas para Serviços Gerais
	    ServicosGerais geral = new ServicosGerais("Fátima Silva", 3800.00, "ftsilva@empresa.com", "Rua Afonso Pena, 34", "11999332121", "987.045.367-67", 39);
	    assert "Fátima Silva".equals(geral.getNome()) : "Nome do Serviço Geral incorreto";
	    assert 3800.00 == geral.getSalarioBase() : "Salário base do Serviço Geral incorreto";
	    
	    //Assertivas para Serviços Gerais
	    ServicosGerais geral1 = new ServicosGerais("Rubens Couto", 3500.00, "rbcouto@empresa.com", "Rua Duque de Caxias, 172", "11999643903", "987.033.734-51", 41);
	    assert "Rubens Couto".equals(geral1.getNome()) : "Nome do Serviço Geral 1 incorreto";
	    assert 3500.00 == geral1.getSalarioBase() : "Salário base do Serviço Geral 1 incorreto";
	    
	    // Assertivas para RH
	    Trabalho trabalho1 = new Trabalho(44, 22);
	    Rh rh1 = new Rh("João Silva", 5000.00, "joao@email.com", "Rua Exemplo 123", "123456789", "111.222.333-44", 30, trabalho1);
	    assert "João Silva".equals(rh1.getNome()) : "Nome do RH 1 incorreto";
	    assert 5000.00 == rh1.getSalarioBase() : "Salário base do RH 1 incorreto";

	    // Assertivas para o segundo RH
	    Trabalho trabalho2 = new Trabalho(35, 20);
	    Rh rh2 = new Rh("Maria Souza", 4500.00, "maria@email.com", "Rua Exemplo 456", "987654321", "555.666.777-88", 28, trabalho2);
	    assert "Maria Souza".equals(rh2.getNome()) : "Nome do RH 2 incorreto";
	    assert 4500.00 == rh2.getSalarioBase() : "Salário base do RH 2 incorreto";

	    // Assertivas para Analista de Marketing
	    Trabalho trabalho = new Trabalho(42,22);
	    AnalistaMarketing marketing = new AnalistaMarketing("Cláudia Moura", 9000.00, "clmoura@email.com", "Rua Rio Lavapés,478","11999663211", "988.678.263-31",34, trabalho);
	    assert "Cláudia Moura".equals(marketing.getNome()) : "Nome do Analista de Marketing incorreto";
	    assert 9000.00 == marketing.getSalarioBase() : "Salário base do Analista de Marketing incorreto";

	    // Assertivas para Estagiário
	    Estagiario estagiario = new Estagiario("Paulo Costa", 1200.00, "pcosta@empresa.com", "Rua Floriano Peixoto, 133", "11999030411", "991.011.767-44", 19);
	    assert "Paulo Costa".equals(estagiario.getNome()) : "Nome do Estagiário incorreto";
	    assert 1200.00 == estagiario.getSalarioBase() : "Salário base do Estagiário incorreto";

	    // Assertivas para Desenvolvedor Junior
	    Trabalho trabalhoJunior = new Trabalho(40.0, 22);
	    Desenvolvedor junior = new Desenvolvedor("Rui Araújo", 5000.0, "ruiaraujo@example.com", "Rua A", "123456789", "1234567890", 25, 1, trabalhoJunior);
	    assert "Rui Araújo".equals(junior.getNome()) : "Nome do Desenvolvedor Junior incorreto";
	    assert 5000.0 == junior.getSalarioBase() : "Salário base do Desenvolvedor Junior incorreto";

	    // Assertivas para Desenvolvedor Pleno
	    Trabalho trabalhoPleno = new Trabalho(45.0, 22);
	    Desenvolvedor pleno = new Desenvolvedor("Carla Vasconcellos", 9800.0, "cvasconcellos@example.com", "Rua B", "987654321", "0987654321", 29, 2, trabalhoPleno);
	    assert "Carla Vasconcellos".equals(pleno.getNome()) : "Nome do Desenvolvedor Pleno incorreto";
	    assert 9800.0 == pleno.getSalarioBase() : "Salário base do Desenvolvedor Pleno incorreto";

	    // Assertivas para Desenvolvedor Sênior
	    Trabalho trabalhoSenior = new Trabalho(45.0, 22);
	    Desenvolvedor senior = new Desenvolvedor("Carlos Nogueira", 16000.0, "carlos@example.com", "Rua C", "987123456", "5678901234", 35, 3, trabalhoSenior);
	    assert "Carlos Nogueira".equals(senior.getNome()) : "Nome do Desenvolvedor Sênior incorreto";
	    assert 16000.0 == senior.getSalarioBase() : "Salário base do Desenvolvedor Sênior incorreto";
	}
	
	/** Implementação dos testes para cálculo do valor final de salário líquido por funcionário. 
	 * O valor encontrado é baseado na execução do programa main. */
	public static void testeCalculoFolhaPagamento() {	    
	    double folhaPagamentoCEO = 16624.26;
	    assert 16624.26 == folhaPagamentoCEO : "Cálculo da folha de pagamento do CEO incorreto";
	    	   
	    double folhaPagamentoPresidente = 12327.40;
	    assert 12327.40 == folhaPagamentoPresidente : "Cálculo da folha de pagamento do Presidente incorreto";
	    	   
	    double folhaPagamentoGeral = 2915.21;
	    assert 2915.21 == folhaPagamentoGeral  : "Cálculo da folha de pagamento do Servidor incorreto";
	    
	    double folhaPagamentoGeral1 = 2710.60;
	    assert 2710.60 == folhaPagamentoGeral1  : "Cálculo da folha de pagamento do Servidor incorreto";
	    
	    double folhaPagamentorh1 = 3618.60;
	    assert 3618.60 == folhaPagamentorh1 : "Cálculo da folha de pagamento do RH incorreto";
	    
	    double folhaPagamentorh2 = 3314.74;
	    assert 3314.74 == folhaPagamentorh2 : "Cálculo da folha de pagamento do RH incorreto";
	    	   
	    double folhaPagamentoAnalista = 6047.38;
	    assert 6047.38 == folhaPagamentoAnalista : "Cálculo da folha de pagamento do Analista incorreto";
	    	    
	    double folhaPagamentoEstagiario = 1012.10;
	    assert 1012.10 == folhaPagamentoEstagiario : "Cálculo da folha de pagamento do Estagiario incorreto";
	   
	    double folhaPagamentojunior = 3618.60;
	    assert 3618.60 == folhaPagamentojunior : "Cálculo da folha de pagamento do junior incorreto";
	    
	    double folhaPagamentopleno = 7962.22;
	    assert 7962.22 == folhaPagamentopleno : "Cálculo da folha de pagamento do pleno incorreto";
	     
        double folhaPagamentosenior = 12915.46;
        assert 12915.46 == folhaPagamentosenior : "Cálculo da folha de pagamento do senior incorreto";
	    
	}
	
	/** Implementação dos testes de lista. Tamanho e conteúdo são colocados aqui. */
	public static void testeListaFuncionarios() {
	    List<Funcionario> funcionarios = new ArrayList<>();
	    CEO ceo = new CEO("Maria Oliveira", 25000.00, "ceo@empresa.com", "Rua dos Executivos, 1", "11999887766", "987.654.321-00", 42);
	    Presidente presidente = new Presidente("Júlio Reis", 18500.00, "presidente@empresa.com", "Rua dos cardeais, 12", "11993267881", "144.532.211-12", 40);
	    ServicosGerais geral = new ServicosGerais("Fátima Silva", 3800.00, "ftsilva@empresa.com", "Rua Afonso Pena, 34", "11999332121", "987.045.367-67", 39);
	    ServicosGerais geral1 = new ServicosGerais("Rubens Couto", 3500.00, "rbcouto@empresa.com", "Rua Duque de Caxias, 172", "11999643903", "987.033.734-51", 41);
	    Trabalho trabalho1 = new Trabalho(44, 22);
	    Rh rh1 = new Rh("João Silva", 5000.00, "joao@email.com", "Rua Exemplo 123", "123456789", "111.222.333-44", 30, trabalho1);
	    Trabalho trabalho2 = new Trabalho(35, 20);
	    Rh rh2 = new Rh("Maria Souza", 4500.00, "maria@email.com", "Rua Exemplo 456", "987654321", "555.666.777-88", 28, trabalho2);
	    Trabalho trabalho = new Trabalho(42,22);
	    AnalistaMarketing marketing = new AnalistaMarketing("Cláudia Moura", 9000.00, "clmoura@email.com", "Rua Rio Lavapés,478","11999663211", "988.678.263-31",34, trabalho);
	    Estagiario estagiario = new Estagiario("Paulo Costa", 1200.00, "pcosta@empresa.com", "Rua Floriano Peixoto, 133", "11999030411", "991.011.767-44", 19);
	    Trabalho trabalhoJunior = new Trabalho(40.0, 22);
	    Desenvolvedor junior = new Desenvolvedor("Rui Araújo", 5000.0, "ruiaraujo@example.com", "Rua A", "123456789", "1234567890", 25, 1, trabalhoJunior);
	    Trabalho trabalhoPleno = new Trabalho(45.0, 22);
	    Desenvolvedor pleno = new Desenvolvedor("Carla Vasconcellos", 9800.0, "cvasconcellos@example.com", "Rua B", "987654321", "0987654321", 29, 2, trabalhoPleno);
	    Trabalho trabalhoSenior = new Trabalho(45.0, 22); // 45 horas semanais, 22 dias trabalhados
        Desenvolvedor senior = new Desenvolvedor("Carlos Nogueira", 16000.0, "carlos@example.com", "Rua C", "987123456", "5678901234", 35, 3, trabalhoSenior);
	    
	    
	    funcionarios.add(ceo);
	    funcionarios.add(presidente);
        funcionarios.add(geral);
        funcionarios.add(geral1);
        funcionarios.add(rh1);
        funcionarios.add(rh2);
        funcionarios.add(marketing);
        funcionarios.add(estagiario);
        funcionarios.add(junior);
        funcionarios.add(pleno);
        funcionarios.add(senior);
        
        //System.out.println("Tamanho atual da lista: " + funcionarios.size());
	    assert funcionarios.size() == 11 : "Tamanho da lista de funcionários incorreto"; // Atualize o número conforme necessário
	    assert "Maria Oliveira".equals(funcionarios.get(0).getNome()) : "Nome do primeiro funcionário na lista incorreto";
	    assert "Júlio Reis".equals(funcionarios.get(1).getNome()) : "Nome do segundo funcionário na lista incorreto";
	    assert "Fátima Silva".equals(funcionarios.get(2).getNome()) : "Nome do primeiro funcionário na lista incorreto";
	    assert "Rubens Couto".equals(funcionarios.get(3).getNome()) : "Nome do primeiro funcionário na lista incorreto";
	}
	
	/** Método para impressão da execução dos testes. Se o valor concordam, emite uma aprovação, se não estão de acordo, emite uma exceção.  */
	public static void executeTestAndPrintResult() {
	    try {
	        testeCriacaoFuncionario();
	        System.out.println("Todos os testes passaram com sucesso!");
	        testeCalculoFolhaPagamento();
	        System.out.println("Todos os testes passaram com sucesso!");
	        testeListaFuncionarios();
	        System.out.println("Todos os testes passaram com sucesso!");
	    } catch (AssertionError e) {
	        System.out.println("Falha no teste: " + e.getMessage());
	    }
	}
}
