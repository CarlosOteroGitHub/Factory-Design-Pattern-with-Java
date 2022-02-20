package factory;

public class Factory {
    
    public IConexion getConexion(String sgbd){
        if(sgbd == null){
            return new NoConexion();
        } 
        
        if("MySQL".equalsIgnoreCase(sgbd)){
            return new ConexionMySQL("localhost", "4381", "root", "mysql");
        } else if("SQLite".equalsIgnoreCase(sgbd)){
            return new ConexionSQLite("localhost", "8021", "root", "sqlite");
        } else {
            return new NoConexion();
        }
    }
}