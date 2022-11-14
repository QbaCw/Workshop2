import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskManager {

    private static final String CREATE_DATABASE_QUERY = "create database if not exists workshop_2\n" +
            "character set utf8mb4\n" +
            "collate utf8mb4_unicode_ci;";


    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false&characterEncoding=utf8&serverTimezone=UTC",
                "root", "coderslab");
             Statement statement = connection.createStatement()) {

            statement.execute(CREATE_DATABASE_QUERY);


        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
