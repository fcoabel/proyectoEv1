package sqlite;

public class llamadas {

    private static final String nombreBD = "proyectoEv1";
    private static final String nombreTabla = "Usuarios";
    private static final String usuarioCol = "Usuario";
    private static final String contraseniaCol = "Contrasenia";
    private static String crearTablaUsuario = "";

    private static final int versioBD = 3;

    public static String getUsuarioCol(){
        return usuarioCol;
    }

    public static String getContraseniaCol(){
        return contraseniaCol;
    }
    public static String getNombreBD(){
        return nombreBD;
    }

    public static String getNombreTabla(){
        return nombreTabla;
    }

    public static int getVersioBD(){
        return versioBD;
    }

    public static String getCrearTablaUsuario(){
        crearTablaUsuario = "CREATE TABLE" + nombreTabla + "(" + usuarioCol + "TEXT," + contraseniaCol + "TEXT)";
        return crearTablaUsuario;
    }

}
