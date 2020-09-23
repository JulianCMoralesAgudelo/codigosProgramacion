// Realmente los arreglos se pasan por referencia de forma impl�cita
Subproceso Inicializar(Personas)
	
	Personas[0,0]<-'76571673Y';
	Personas[0,1]<-'Juan Pérez';
	Personas[0,2]<-'56';
	
	Personas[1,0]<-'59184731M';
	Personas[1,1]<-'María García';
	Personas[1,2]<-'22';
	
	Personas[2,0]<-'39383736J';
	Personas[2,1]<-'Miguel Hernández';
	Personas[2,2]<-'84';
	
FinSubProceso

Subproceso Consultar(Personas, Filas)
	Definir i Como Entero;
	Para i<-0 hasta Filas-1 Hacer
		Escribir Personas[i,0],' - ' Personas[i,1],' - ',Personas[i,2] ' años';
	FinPara
FinSubProceso

// De izquierda a derecha si se encuentra se devuelve el número de la posición sino -1
SubProceso Encontrado<-Buscar_Por_DNI(DNI, Personas, Filas)
	Definir i,Encontrado Como Entero;
	Encontrado <- -1;
	Para i<-0 hasta Filas-1 Hacer
		Si Personas[i,0]=DNI Entonces
			Encontrado<-i;
		FinSi
	FinPara
FinSubProceso

Proceso ProcesoPrincipal
	Definir Personas como Cadena;
	Definir Filas, Columnas, Encontrado como Entero;
	Filas<-3; 
	Columnas<-3;
	
	// Creamos un arreglo multidimensional
	Dimension Personas[Filas,Columnas];
	
	// Llamamos a una funcion que le asigne unos valores de ejemplo
	Inicializar(Personas);
	
	// La función consultar nos muestra todo el contenido del arreglo
	Consultar(Personas, Filas);
	
	// La función Buscar_Por_DNI devuelve el índice dónde se encuentra el DNI
	// Si no se encuentra el DNI en el arreglo, se devuelve -1
	Encontrado<-Buscar_Por_DNI('39383736J', Personas, Filas);
	
	// Si Encontrado es diferente de -1 mostramos los datos de la persona encontrada
	Si Encontrado<> -1 Entonces	
		Escribir 'Persona encontrada: ';
		Escribir Personas[Encontrado,0],' - ' Personas[Encontrado,1],' - ',Personas[Encontrado,2] ' años';
	FinSi
	
FinProceso
