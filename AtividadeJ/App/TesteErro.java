package App;

import Model.ContaCorrente;

class TesteErro	{
	public	static	void main(String[]args){
		System.out.println("inicio	do	main");	
		metodo1();
		System.out.println("fim	do	main");			}
	
	static	void	metodo1()	{
		System.out.println("inicio	do	metodo1");
		metodo2();
		System.out.println("fim	do	metodo1");			}
	
	static	void	metodo2()	{
		System.out.println("inicio	do	metodo2");
		ContaCorrente	cc	=	new	ContaCorrente();
		for	(int	i	=	0;	i	<=	15;	i++){
			cc.depositar(i	+	1000);
			System.out.println(cc.getSaldo());
			if	(i	==	5){
				cc = null;}
			}
		System.out.println("fim	do	metodo2");} 
	
	
	/* 2�
	static	void metodo2() {
		System.out.println("inicio	do	metodo2");
		ContaCorrente	cc	=	new	ContaCorrente();
		try{
		for	(int	i	=	0;	i	<=	15;	i++){
			cc.deposita(i	+	1000);
			System.out.println(cc.getSaldo());
			if	(i	==	5)	{
				cc	=	null;
				}
			}
		}catch (NullPointerException e){
			System.out.println("erro:	" +	e);
			}
		
		System.out.println("fim	do	metodo2");
	
	}
}
	*/
	
	/*3�
	static	void metodo2() {
		System.out.println("inicio	do	metodo2");
		ContaCorrente	cc	=	new	ContaCorrente();
		for	(int	i	=	0;	i	<=	15;	i++){
			try{
				cc.deposita(i	+	1000);
				System.out.println(cc.getSaldo());
				if	(i	==	5)	{
					cc	=	null;
					}
			}catch (NullPointerException e){
				System.out.println("erro:	" +	e);
				}
		}
	System.out.println("fim	do	metodo2");
	}
}
	*/

	/*4�
	public	static	void	main(String[]	args) {
		System.out.println("inicio	do	main");
		metodo1();
		System.out.println("fim	do	main");
		}

	static	void metodo1() {
		System.out.println("inicio	do	metodo1");
		try{
		metodo2();
		}catch (NullPointerException e){
			System.out.println("erro:	" + e);
		}
	
		System.out.println("fim	do	metodo1");
		}*/
	/*5�
	public	static	void main(String[]args){
		System.out.println("inicio	do	main");
		try	{
			metodo1();
			}catch(NullPointerException	e){
				System.out.println("erro: " + e);
				}
		System.out.println("fim	do	main");
	}*/

}