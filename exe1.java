import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) throws Exception {
    
        String nome;
        int idade; 
        String sexo;
        float salario;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Informe sua Idade: ");
		idade = ler.nextInt();
		
		ler.nextLine(); // LIMPANDO O BUFFER DO TECLADO
		
		System.out.println("Informe seu sexo: ");
		sexo = ler.nextLine();
		
		System.out.println("Informe Salario: ");
		salario = ler.nextInt();
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Salario: " + salario);

        ler.close();
    }
}
