package apoio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Narinha
 */
public class conexao {

    public static Connection connection;

    static {
        String url = "jdbc:postgresql://localhost:5432/Consultorio";
        String usuario = "postgres";
        String senha = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
