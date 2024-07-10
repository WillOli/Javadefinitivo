import DB.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        System.out.println("Banco de dados conectado com sucesso!");
        DB.closeConnetion();
        System.out.println("Conexão encerrada!" );
    }
}