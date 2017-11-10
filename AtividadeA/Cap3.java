package AtividadeA;
import javax.swing.JOptionPane;

class Cap3 {
	public static void main(String[] args) {
		//Q-1
		int gastosJaneiro = 15000;
		int gastosFervereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFervereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		
		//Q-2
		double mediaMensal = gastosTrimestre/3;
		System.out.println("Valor da média " + mediaMensal);
		
		//Pag30 - Q-1
		int i;
		for(i = 150; i < 301; i++) {
			System.out.println(i);
		}
		
		//Q-2
		int soma = 0;
		for(i = 2; i < 1000; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
		
		//Q-3
		for(i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		//Q-4
		int num1;
		int aux = 1;
		int num2 = 1;
		for(num1= 0; num1 <= 10; num1++) {
			if(num1 != 0 && num1 > 0) {
				num1 -= 1;
				System.out.println("O fatorial de " + aux + " é (" + num1 + "!) * " + aux + " = " + num2 );
				num1 += 1;
				aux += 1;
				num2 = num2 * aux;
			}
			else {
				System.out.println("O fatorial de 0 é 1");
			}
		}
		
		//Q-5 - Pois int possui um limite para caracteries
		
		//Q-6 e Desafio
		int valor1 = 0;
		int valor2 = 1;
		for(valor1 = 0; valor1 <= 500 && valor2 <= 500;) {
			if (valor1 > 100) {
				System.out.println(valor1);
				break;
			}
			else {
			System.out.print(valor1+" , " + valor2 + " , ");
			valor1 = valor1 + valor2;
			valor2 = valor1 + valor2;
			
			}
		}
		
		//Q-7
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("entre com um número: " ));
		while (x != 1) {
			if (x % 2 == 0) {
				x = x / 2;
				System.out.print(" > " + x + " > " );
			}
			else {
				x = 3*x+1;
				System.out.print(x);
			}
		}
		
		//Q-8 / Não consegui fazer
		int numero1;
		int numero2;
		for(numero2 = 1; numero2 <= 4; numero2++){
			for(numero1 = 1; numero1 <= numero2 ;) {
				int total = numero1*numero2;
				System.out.print(total);
				
			}
		}
		
	}

}
	
