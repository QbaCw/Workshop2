import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

    private static final String CREATE_DATABASE_QUERY = "create database if not exists workshop_2\n" +
            "character set utf8mb4\n" +
            "collate utf8mb4_unicode_ci;";

    private static final String CREATE_USERS_TABLE_QUERY = "create table if not exists workshop_2.users(\n" +
            "id int(11) not null primary key auto_increment,\n" +
            "email varchar(255) not null unique,\n" +
            "username varchar(255) not null,\n" +
            "password varchar(60) not null\n" +
            ");";


   // public static void main(String[] args) {

    public static void CreatedDataBase(){
        try (Connection connection = DbUtil.getConnection();
             Statement statement = connection.createStatement()) {

                statement.execute(CREATE_DATABASE_QUERY);
                statement.execute(CREATE_USERS_TABLE_QUERY);



        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
