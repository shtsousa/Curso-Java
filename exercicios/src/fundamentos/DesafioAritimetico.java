package fundamentos;

public class DesafioAritimetico {
	
	public static void main(String[] args) {
		
		//Soma do primeiro parentese
		int a = 6 * (3+2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int d = b / c; //Resultado final
				
		//Soma do segundo parentese
		int e = (1 - 5) * (2 - 7) / 2;
		int f = (int) Math.pow(e, 2);
				
		//Soma dos resultados
		int g = d - f;
		int h = (int) Math.pow(g, 3) /(int) Math.pow(10, 3);
		//Resultado final
		System.out.println(h);
		
		
		
	}

}
