/**
 * @author JavFuentes
 *
 */
public class Trabajador {

	private String run;
	private String nombres;
	private String apellidos;
	private String telefono;	
	private int edad;
	
	public Trabajador() {
		
	}
	
	public Trabajador(String rut, String nombres, String apellidos, String telefono, int edad) {
		super();
		this.run = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.edad = edad;
	}
	
	public String nombreCompleto() {
		return nombres + " " + apellidos;
	}

	@Override
	public String toString() {
		return "Trabajador [rut=" + run + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", edad=" + edad + "]";
	}
	
	public int descomponerRun() {
		String runSinDV = "";
		for (int i = 0; i < run.length(); i++) {
			char c = run.charAt(i);
			if(c == '-') {
				break;
			}else {
				runSinDV = runSinDV + c;
			}
		}
		
		return Integer.valueOf(runSinDV);
	}
}
