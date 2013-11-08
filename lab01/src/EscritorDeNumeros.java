import java.util.Scanner;

public class EscritorDeNumeros {

	public static void main(String[] args) {

		NumeroExtenso num = new NumeroExtenso();

		System.out.print("Digite um numero de 0 a 1.000.000.000: ");
		String valor = new Scanner(System.in).nextLine();

		while(!num.verificaInteiro(valor)){
			valor = new Scanner(System.in).nextLine();
		}
		
		System.out.println(num.escrever(Integer.parseInt(valor.trim())));
	}
}
