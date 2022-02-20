package factory;

public class ConexionSQLite implements IConexion {
    
    private final String host, puerto, usuario, contrasena;

    public ConexionSQLite(String host, String puerto, String usuario, String contrasena) {
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    @Override
    public void conexion(){
        System.out.println("Conectado a SQLite");
    }
    
    @Override
    public void desconexion(){
        System.out.println("Desconectado de SQLite");
    }
}
