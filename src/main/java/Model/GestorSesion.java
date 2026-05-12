package Model;

//Patrón Singleton
public class GestorSesion {
    private static GestorSesion instancia;
    private Persona usuarioActual;

    private GestorSesion() { } // Constructor privado

    public static synchronized GestorSesion getInstancia() {
        if (instancia == null) {
            instancia = new GestorSesion();
        }
        return instancia;
    }

    public void iniciarSesion(Persona usuario) {
        this.usuarioActual = usuario;
    }

    public void cerrarSesion() {
        this.usuarioActual = null;
    }

    public Persona getUsuarioActual() {
        return usuarioActual;
    }

    public boolean esAdministrador() {
        return usuarioActual instanceof Administrador;
    }
}