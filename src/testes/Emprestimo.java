package testes;

public class Emprestimo {

	public static void main(String[] args) {
		
		System.out.println("Exerc�cio Empr�stimo");
		
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas1());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas1());
		Emprestimo.calcular(1000, 5);
		

	}

	

	public static int getDuasParcelas1() {
		 return 2;
	 }
	 public static int getTresParcelas1() {
		 return 3;
	 }
		 public static int getTaxaDuasParcelas() {
			 return (int) 0.3;
		 }
			 public static int getTaxaTresParcelas() {
				 return (int) 0.45;
			 }
	public static void calcular(double valor, int parcelas) {
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal); 
			
			
		} else {
			if (parcelas == 3) {
				double valorFinal = valor +(valor * getTaxaTresParcelas());
				
				System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);
			} else {
				System.out.println("Quantidade de parcelas n�o aceita! ");

			}

		}
		
	}
	




}
