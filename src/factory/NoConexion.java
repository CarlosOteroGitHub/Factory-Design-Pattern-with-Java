package factory;

public class NoConexion implements IConexion {
    
    @Override
    public void conexion(){
        System.out.println("No se especificó SGBD");
    }
    
    @Override
    public void desconexion(){
        System.out.println("No se especificó SGBD");
    }
}