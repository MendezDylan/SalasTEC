
import controlador.ControladorUsuario;
import modelo.Usuario;
import vista.LoginForm;


public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginForm vista = new LoginForm();
        Usuario modelo = new Usuario();
        ControladorUsuario controlador = new ControladorUsuario(vista,modelo);
       
    }
    
}
