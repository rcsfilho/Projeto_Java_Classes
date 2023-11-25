package empresa;


/**Criamos a classe trabalho para cuidar das horas trabalhadas e ser possivel calcular banco de horas e benefício para horas extras. */
/**Utilizamos como padrão 8 horas diárias o que dá 176 horas semanais em uma semana útil de 5 dias. */
public class Trabalho {
	private double horasSemanais; // Horas semanais de trabalho
    private int diasTrabalhados; // Dias trabalhados no mês

    public Trabalho(double horasSemanais, int diasTrabalhados) {
        this.horasSemanais = horasSemanais;
        this.diasTrabalhados = diasTrabalhados;
    }

    /** Método para calcular as horas extras com base nas horas semanais e dias trabalhados */
    public double calcularHorasExtras() {
        double horasDiarias = horasSemanais / 5; // Assumindo uma semana de 5 dias
        double horasMensais = horasDiarias * diasTrabalhados;
        double horasExtras = 0;
     

        if (horasMensais > 176) { // 176 horas é a marca de 8 horas por dia em média
            horasExtras = horasMensais - 176;
            return horasExtras;
        } else {
            return 0;
        }
    }

    /**Método para calcular a média de horas trabalhadas por dia no mês */
    public double calcularMediaHorasDiarias() {
        double horasDiarias = horasSemanais / 5; // Assumindo uma semana de 5 dias
        return horasDiarias;
    }

    /**Método para calcular a média de horas trabalhadas por semana no mês*/ 
    public double calcularMediaHorasSemanais() {
        return horasSemanais;
    }
    /**Consideramos esse método de banco de horas como um abatimento de jornada de trabalho a ser acordado entre empregador e empregado.*/
    public double calcularBancoDeHoras() {
        double horasDiarias = horasSemanais / 5; // Assumindo uma semana de 5 dias
        double horasMensais = horasDiarias * diasTrabalhados;
        
        // considerando 176 horas mensais como um padrão diário de 8 horas de trabalho
        if (horasMensais > 176) {
            // Horas mensais maiores que as horas padrão, então há um acúmulo no banco de horas
            return horasMensais - 176;
        } else {
            // Horas trabalhadas menores ou iguais às horas mensais, não há acúmulo no banco de horas
            return 0;
        }
    }
}
