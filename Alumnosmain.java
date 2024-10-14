
public class Alumnosmain {

	public static void main(String[] args) {
		
		Alumnos alumno = new Alumnos("Manuel", "Vega", 19, "01/12/2004", 30);
		
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("Apellidos: " + alumno.getApellidos());
		System.out.println("Edad: " + alumno.getEdad());
		System.out.println("Fecha de nacimiento: " + alumno.getFechaNacimiento());
		System.out.println("Logros totales: " + alumno.getLogros());
		System.out.println("--------------------------------");
		
		alumno.setEdad(20);
		alumno.setLogros(37);
		
		System.out.println("Nueva edad: " + alumno.getEdad());
		System.out.println("Nuevos logros totales: " + alumno.getLogros());	
	}
}
