import java.util.HashMap;

public class NumeroExtenso {
	HashMap<Integer, Object> dicionario; 
	String extenso;
	int numero;
	
	public NumeroExtenso(){
		numero = -2;
		extenso = "";
		dicionario = new HashMap<Integer, Object>();
		dicionario.put(0, "zero");
		dicionario.put(1, "um");
		dicionario.put(2, "dois");
		dicionario.put(3, "tres");
		dicionario.put(4, "quatro");
		dicionario.put(5, "cinco");
		dicionario.put(6, "seis");
		dicionario.put(7, "sete");
		dicionario.put(8, "oito");
		dicionario.put(9, "nove");
		dicionario.put(10, "dez");
		
		dicionario.put(11, "onze");
		dicionario.put(12, "doze");
		dicionario.put(13, "treze");
		dicionario.put(14, "quatorze");
		dicionario.put(15, "quinze");
		dicionario.put(16, "dezesseis");
		dicionario.put(17, "dezessete");
		dicionario.put(18, "dezoito");
		dicionario.put(19, "dezenove");
		
		dicionario.put(20, "vinte");
		dicionario.put(30, "trinta");
		dicionario.put(40, "quarenta");
		dicionario.put(50, "cinquenta");
		dicionario.put(60, "sessenta");
		dicionario.put(70, "setenta");
		dicionario.put(80, "oitenta");
		dicionario.put(90, "noventa");
		
		dicionario.put(100, "cem");
		dicionario.put(101, "cento");
		dicionario.put(200, "duzentos");
		dicionario.put(300, "trezentos");
		dicionario.put(400, "quatrocentos");
		dicionario.put(500, "quinhentos");
		dicionario.put(600, "seicentos");
		dicionario.put(700, "setecentos");
		dicionario.put(800, "oitocentos");
		dicionario.put(900, "novecentos");

	}

	public String escrever(int num) {
		extenso = "";
		if (unico(num)){
			extenso = calculaUnico(num);
		}
		else if(dezena(num)){
			extenso += calculaDezena(num);			
		}
		else if(centena(num)){
			extenso += calculaCentena(num);
		}
		else if(maiorQueMil(num)){
			extenso += calculaMaiorQueMil(num);
		}
		else if(maiorQueMilhao(num)){
			extenso += calculaMaiorQueMilhao(num);
		}	
		return extenso;
	}
	
	private boolean unico(int num){
		return num != 101 && dicionario.containsKey(num);
	}
	
	private boolean dezena(int num){
		return num < 100 && num > 20;
	}
	
	private String calculaUnico(int num){
		return (String) dicionario.get(num);
	}
	
	private boolean centena(int num){
		return num > 100 && num < 1000;
	}
	
	private boolean maiorQueMil(int num){
		return num >= 1000 && num < 1000000;
	}
	
	private boolean maiorQueMilhao(int num){
		return num >= 1000000 && num <= 1000000000;
	}
	
	
	private String calculaDezena(int num){
		return (String) dicionario.get((num/10) * 10) + " e " + calculaUnico(num%10);
	}

	
	private String calculaCentena(int num){
		String palavra = "";
		if((num/100) * 100 == 100){
			palavra += (String) dicionario.get(101) + " e ";
		}
		else{
			palavra += (String) dicionario.get((num/100) * 100) + " e ";
		}
		
		if(unico(num - (num/100) * 100)){
			palavra += calculaUnico(num - (num/100) * 100);
		}
		else{
			palavra += calculaDezena(num - (num/100) * 100);
		}
		return palavra;
	}
	
	
	private String calculaMaiorQueMil(int num){
		int valor = (num/1000);
		String palavra;
		if(valor == 1 && extenso.equals("") && numero == -2 ){
			palavra = "mil";
		}
		else{
			palavra = escrever(valor) + " mil";
		}
		
		if(num%1000 > 0){
			if(unico(num%1000) || num%1000 < 100){
				palavra += " e " + escrever(num%1000);
			}
			else{
				palavra += " " + escrever(num%1000);
			}
		}
		return palavra;
	}
	
	
	private String calculaMaiorQueMilhao(int num){
		if(numero == -2){
			numero = num;
		}
		String palavra;
		if(num == 1000000000){
			palavra = "um bilhao";
		}
		else{
			int valor = (num/1000000);
			if(valor == 1){
				palavra = escrever(valor) + " milhao";
			}
			else{
				palavra = escrever(valor) + " milhoes";

			}
			if(num%1000000 > 0){
				if(unico(num%1000000) || num%1000000 < 100){
					palavra += " e " + escrever(num%1000000);
				}
				else{
					palavra += " " + escrever(num%1000000);
	
				}
			}
		}
		return palavra;
	}
	
	public boolean verificaInteiro(String palavra){
		if (palavra.isEmpty()) {
			System.out.print("Voce deve informar um numero. Tente novamente: ");
			return false;
		}
		
		if (!palavra.equals("-1")) {
			for (char letra : palavra.toCharArray()) {
				if (letra < '0' || letra > '9') {
					System.out.print("Isto nao me parece algo aceito pelo sistema. Tente novamente: ");
					return false;
				}
			}
		}
		if((long)Integer.parseInt(palavra.trim()) > 1000000000){
			System.out.print("Isto nao me parece algo aceito pelo sistema. Tente novamente: ");
			return false;
		}
		return true;
	}
}