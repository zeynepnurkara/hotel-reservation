import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String user = "user1";
        String pass = "a123";
        String conUrl = "jdbc:mysql://localhost/hotelreservation";

        try {
            // Bağlantı oluştur
            Connection conn = DriverManager.getConnection(conUrl, user, pass);
            System.out.println("Connected..");

            // Meta verileri al
            DatabaseMetaData metaData = conn.getMetaData();

            // Meta verileriyle işlem yap
            System.out.println("Veritabanı ürün adı: " + metaData.getDatabaseProductName());
            System.out.println("Veritabanı sürümü: " + metaData.getDatabaseProductVersion());

            // Bağlantıyı kapat
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


