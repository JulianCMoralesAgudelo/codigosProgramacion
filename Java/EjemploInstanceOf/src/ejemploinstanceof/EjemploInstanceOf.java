package ejemploinstanceof;

public class EjemploInstanceOf {

	public static void main(String[] args) {
		
		FiguraGeometrica figura;
		figura = new Triangulo();
		//Determina solo un tipo al que corresponde con la jerarquia.
		determinaTipo(figura);
		//Determina todos los tipos posibles.
		System.out.println("\nTodos sus tipos");
		determinaTodosLosTipos(figura);
	}
	
	public static void determinaTodosLosTipos(FiguraGeometrica figura){
		if (figura instanceof Elipse){
			//Proceso algo particular de la Elipse.
			System.out.println("Es una Elipse");
		}
		
		if (figura instanceof Circulo){
			//Proceso algo particular de la Circulo.
			System.out.println("Es una Circulo");
		}
		
		if (figura instanceof FiguraGeometrica){
			//Proceso algo particular de la FiguraGeometrica.
			System.out.println("Es una FiguraGeometrica");
		}
		
		if (figura instanceof Object){
			//Proceso algo particular de la Object.
			System.out.println("Es una Object");
		}
		
		else{
			System.out.println("No se encotro el tipo");
		}
	}
	
	private static void determinaTipo(FiguraGeometrica figura){
		
		if (figura instanceof Elipse){
			//Proceso algo particular de la Elipse.
			System.out.println("Es una Elipse");
		} 
		
		else if (figura instanceof Circulo){
			//Proceso algo particular de la Circulo.
			System.out.println("Es una Circulo");
		}
		
		else if (figura instanceof FiguraGeometrica){
			//Proceso algo particular de la FiguraGeometrica.
			System.out.println("Es una FiguraGeometrica");
		}
		
		else if (figura instanceof Object){
			//Proceso algo particular de la Object.
			System.out.println("Es una Object");
		}else{
			System.out.println("No se encotro el tipo");
		}
	}

}
