package classes;

public class Emprestimo {
	//public static void main(String[] args) {
		
	
	public static int getDuasParcelas() {
		 return 2;
	 }
	 public static int getTresParcelas() {
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



