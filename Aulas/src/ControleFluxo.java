public class ControleFluxo {
    // exemplo IF
    public static void CaixaEletronico() { 
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        System.out.println(saldo);
    }

    // exemplo IF-Else
    public static void ResultadoEscolar() {
        int nota = 8;
        if(nota >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    // exemplo IF-Else em cadeia
    public static void ResultadoEscolar2() {
        int nota = 6;
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }

    // operador ternário
    public static void ResultadoEscolar3 () {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}

    // operador ternário encadeado
    public static void ResultadoEscolar4 () {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}

    // Modo condicional convencional
    public static void PlanoOperadora (String plano) {		
		switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default: {
                System.out.println("nenhum");
            }
        }
	}


    public static void main(String[] args) {
        //CaixaEletronico();
        //ResultadoEscolar4();
        PlanoOperadora("B");
    }
}
