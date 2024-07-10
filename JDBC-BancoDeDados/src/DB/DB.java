package DB;

import exception.DbException;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("JDBC-BancoDeDados/resources/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            props.setProperty("user", System.getenv("MY_USERNAME"));
            props.setProperty("password", System.getenv("MY_PASSWORD"));

            // Add allowPublicKeyRetrieval and useSSL properties if provided
            String url = props.getProperty("dburl");
            String useSSL = System.getenv("USE_SSL");
            String allowPublicKeyRetrieval = System.getenv("ALLOW_PUBLIC_KEY_RETRIEVAL");
            if (useSSL != null && allowPublicKeyRetrieval != null) {
                url += "?useSSL=" + useSSL + "&allowPublicKeyRetrieval=" + allowPublicKeyRetrieval;
                props.setProperty("dburl", url);
            }
            return props;
        } catch (Exception e) {
            throw new DbException(e.getMessage());
        }
    }

    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
