package factory;

public class NewClass {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Factory fabrica = new Factory();
        
        IConexion con1 = fabrica.getConexion("MySQL");
        con1.conexion();
        con1.desconexion();
        
        IConexion con2 = fabrica.getConexion("SQLite");
        con2.conexion();
        con2.desconexion();
        
        IConexion con3 = fabrica.getConexion("N/A");
        con3.conexion();
        con3.desconexion();
    }
}