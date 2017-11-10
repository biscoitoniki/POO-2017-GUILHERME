package AtividadeA;

public class Cap4 {
	public static void main(String[] args) {
		Funcionario felipe = new Funcionario();
		felipe.nome = "Felipe";
		felipe.chamar();
		felipe.salario = 200;
		System.out.println(felipe.salario);
		felipe.recebeAumento(300);
		System.out.println(felipe.salario);
		felipe.calculaGanhoAnual();
		
		//Q-4
		
		System.out.println("\n");
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Danilo";
		f1.salario = 100;
		f2.nome = "Danilo";
		f2.salario = 100;
		
		f1.comparar(f1,f2);
		
		//------------------------------
		
		//Q-5
		
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Hugo";
		f1.salario = 200;
		
		Funcionario f4 = f3;
		
		f3.comparar(f3, f4);

		//------------------------------
		
		//Q-6
		Data data = new Data();
		felipe.dataDeEntrada = data;
		
		felipe.mostra();
		
		
	}

}
