import DB.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
//        Connection conn = DB.getConnection();
//        System.out.println("Banco de dados conectado com sucesso!");
//        DB.closeConnetion();
//        System.out.println("Conexão encerrada!" );q

        /*Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }*/


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
           try {
                conn = DB.getConnection();

               st = conn.prepareStatement(
                       "INSERT INTO seller "
                               + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                               + "VALUES "
                               + "(?, ?, ?, ?, ?)",
                       Statement.RETURN_GENERATED_KEYS);

               st.setString(1, "William Oliveira");
               st.setString(2, "will@gmail.com");
               st.setDate(3, new java.sql.Date(sdf.parse("07/01/1989").getTime()));
               st.setDouble(4, 5000.0);
               st.setInt(5, 4);

               int rowsAffected = st.executeUpdate();

               System.out.println("Done! Rows affected " + rowsAffected);

           }
           catch (SQLException e) {
               e.printStackTrace();
           }
           catch (ParseException e) {
               e.printStackTrace();
           }
           finally {
               DB.closeStatement(st);
               DB.closeConnection();
           }

    }
}