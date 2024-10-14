public class Repeticao {

public static void ExemploFor() {
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}
	}
    
public static void ExemploForArray() {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }
}

public static void ForArray2(){
	String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
	for(String aluno : alunos) {
	  System.out.println(aluno);
	}
}

public  static void breakcontinue() {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			//break;
            continue;
		
		System.out.println(numero);
		
	}
}
	public static void main(String[] args) {
        breakcontinue();
    }
}
