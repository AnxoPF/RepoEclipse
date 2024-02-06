package arraysEj3;

public class Contacto {
	private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Contacto(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Email: " + email + ", Teléfono: " + telefono;
    }
}
