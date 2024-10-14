public class Alumnos {
	
	String nombre;
	String apellidos;
	int edad;
	String fechaNacimiento;
	int logros;
	
	public Alumnos(String nombre, String apellidos, int edad, String fechaNacimiento, int logros) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.logros = logros;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public int getLogros() {
		return logros;
	}
	
	public void setEdad(int newEdad) {
		if(newEdad>=edad) {
			this.edad=newEdad;
		} 
	}
	public void setLogros(int newLogros) {
		if(newLogros>=logros) {
			this.logros=newLogros;
		}
	}
}
