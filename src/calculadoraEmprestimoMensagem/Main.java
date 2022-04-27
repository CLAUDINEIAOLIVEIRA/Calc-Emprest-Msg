package calculadoraEmprestimoMensagem;
/** Esta classe onde será feito todo o processo do desenvolvimento
 */
 

public class Main  {
	
	public static  void main(String [] args) {
	
	 
	
		 // CALCULADORA  //
		  System.out.println("calculadora");
		  Calculadora.soma(25, 59);
		  Calculadora.subtracao(52, 30);
		  Calculadora.divisao(12, 4);
		  Calculadora.multiplicacao(25, 3);
		  
	
		 	 
			 
		// MENSAGEM //
	      System.out.println("Exercicio mensagem");
	     
		  Mensagem.obterMensagem ( 9 );
	      Mensagem.obterMensagem ( 13 );
	      Mensagem.obterMensagem (23);
	      
	
		
		// EMPRÉSTIMO //
	       System.out.println("Exercício Emprestimo");
	       Emprestimo.calcular(1000, Emprestimo. getDuasParcelas());
	       Emprestimo.calcular(1000, Emprestimo. getTresParcelas());
	       Emprestimo.calcular(1000, 5);
	       
	 }
	  
}