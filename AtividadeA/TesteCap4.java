package AtividadeA;

class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;
	
	void chamar(){
		System.out.println("O funcinário " + this.nome + " está sendo chamado");
	}
	
	void dispensar(){
		System.out.println("O funcinário " + this.nome + " está dispensado por hoje");	
	}
	
	void demitir() {
		System.out.println("O funcinário " + this.nome + " está demitido, por favor compareça no escritório");
		this.nome = "Demitido";
		this.departamento = "Inexistente";
		this.salario = 0;
		this.dataDeEntrada.ano = 0;
		this.dataDeEntrada.dia = 0;
		this.dataDeEntrada.mes = 0;
		this.rg = "Inexistente";
	}
	
	void recebeAumento(double aumento) {
		this.salario += aumento;
	}
	
	void calculaGanhoAnual() {
		int total = (int)(this.salario * 12);
		System.out.println("O ganho anual foi de: " + total);
	}
	
	void mostra() {
		System.out.println("Nome: " + this.nome + "\nDepartamento: " + this.departamento + "\nSalário: " + this.salario + "\nRg: "+  this.rg);
		this.dataDeEntrada.formatada();
	}
	void comparar(Funcionario compara1, Funcionario compara2) {
		if(compara1 == compara2) {
			System.out.println("São Iguais");
		}
		else {
			System.out.println("São Diferentes");
		}
	}
}

class Data{
	int dia;
	int mes;
	int ano;
	
	void formatada() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
}


