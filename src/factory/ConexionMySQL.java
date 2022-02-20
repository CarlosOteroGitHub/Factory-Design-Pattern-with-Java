package factory;

public class ConexionMySQL implements IConexion {
    
    private final String host, puerto, usuario, contrasena;

    public ConexionMySQL(String host, String puerto, String usuario, String contrasena) {
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    @Override
    public void conexion(){
        System.out.println("Conectado a MySQL");
    }
    
    @Override
    public void desconexion(){
        System.out.println("Desconectado de MySQL");
    }
}