import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQL {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Statement statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
