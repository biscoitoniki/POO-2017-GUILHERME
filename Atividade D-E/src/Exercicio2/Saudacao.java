package Exercicio2;

public class Saudacao {
	String texto;
	String destinatario;
	
	Saudacao(String texto, String destinatario){
		this.texto = texto;
		this.destinatario = destinatario;
	}

	String obterSaudacao() {
		return texto + destinatario;
	}

}
