import java.util.Scanner;


public class NumeroPrimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Por favor ingrese un numero: ");
		int dato = in.nextInt();
		int i =2;
		double r= Math.sqrt(dato);		
		
		while((i<=r) && (dato%i!=0)){
			i++;
		}
				
		if (i>r){
			System.out.println("El numero: " + dato +" Es Primo");
		}
		else{
			System.out.println("El numero: " + dato +" no es Primo");
		}
	}

}
