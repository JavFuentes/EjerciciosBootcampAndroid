/**
 * @author JavFuentes
 *
 *	Es importante aclarar que no es necesario crear esta clase, ya que
 * 	el ejercicio solo nos pide hacer la clase que representa a los trabajadores 
 *  de la empresa. 
 *  Sin embargo, puede ser relevante entender como podemos instanciar un objeto
 *  e invocar a sus métodos.
 *  
 */
public class Main {

	public static void main(String[] args) {
		
		//Instanciamos la clase trabajador, lo cual crea un objeto de tipo trabajador.
		//Y también lo inicializamos con los valores que lo diferencian de otros trabajadores.
		Trabajador trabajador1 = new Trabajador("16742032-K", "Juan Carlos", "Bodoque Vodoque", "+569 5152688", 31);
		
		//Ahora invocamos los métodos e imprimimos los resultados por consola
		
		//Método toString
		System.out.println(trabajador1.toString());;
		
		//Método que concatena nombres y apellidos
		System.out.println(trabajador1.nombreCompleto());
		
		//Método que extrae solamente los números del RUN
		System.out.println(trabajador1.descomponerRun());
	}

}
