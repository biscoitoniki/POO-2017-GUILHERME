package Exercicio2;

public class NumberUtils {
	int n;
	
	NumberUtils(int a){
		this.n = a;
	}
	
	boolean isPair() {
		if(n%2 == 0) {
			return true;
			}
		
		else{
			return false;
			}
	}
	
	boolean isPrime(){
		boolean resultado;
		int cont = 0;
		int aux = 1;
		while(aux <= n) {
			if(n % aux != 0) {
				cont += 1; 
				}
			else {
				cont += 0;
				}
			}
		if(cont == 2) {
			resultado = true;
			return resultado;
			}
		else{
			resultado = false;
			return resultado;
			}
	}
	
	String printCount(){
		int i = 0;
		String texto = i + ",";
		for(i = 1; i <= n; i++) {
			texto = texto + i + ",";
		}
		return texto;
	}
	
	String printReverseCount() {
		int i = n;
		String texto = i + ",";
		for(i = n; i <= n; i--) {
			texto = texto + i + ",";
		}
		return texto;
	}
	
}
		