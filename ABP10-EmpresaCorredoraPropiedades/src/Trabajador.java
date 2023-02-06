/**
 * @author JavFuentes
 *
 */
public class Trabajador {
	
	//Atributos
	private String run;
	private String nombres;
	private String apellidos;
	private String telefono;	
	private int edad;
	
	//Constructor vacío
	public Trabajador() {
		
	}
	
	//Constructor con parámetros
	public Trabajador(String rut, String nombres, String apellidos, String telefono, int edad) {
		super();
		this.run = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	//Método nombreCompleto
	public String nombreCompleto() {
		return nombres + " " + apellidos;
	}

	
	//Método toString
	@Override
	public String toString() {
		return "Trabajador [rut=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", edad=" + edad + "]";
	}
	
	//Método descomponerRun
	public int descomponerRun() {
		String runSinDV = "";
		for (int i = 0; i < run.length(); i++) {
			char caracterExtraido = run.charAt(i);
			if(caracterExtraido == '-') {
				break;
			}else {
				runSinDV = runSinDV + caracterExtraido;
			}
		}
		
		return Integer.valueOf(runSinDV);
	}
}
