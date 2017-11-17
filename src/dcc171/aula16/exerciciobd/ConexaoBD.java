package dcc171.aula16.exerciciobd;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    private static Connection instancia = null;

    public static Connection getConnection() throws Exception {
        if (instancia == null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverUrl = "jdbc:derby://localhost:1527/2017-dcc171";
            instancia = DriverManager.getConnection(driverUrl, "usuario", "12345");
        } 

        return instancia;
    }    
}
