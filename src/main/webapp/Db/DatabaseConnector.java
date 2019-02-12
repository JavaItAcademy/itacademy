package Db;

import Models.Application;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnector {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "123";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean addApplication(Application application) {
        String SQL =
                "insert into applications " +
                        "(fio, course, email, isOnline) " +
                        "values (?, ?, ?, ?)";
        try (Connection conn = connect()) {
            PreparedStatement stmt =
                    conn.prepareStatement(SQL);

            stmt.setString(1, application.getFio());
            stmt.setString(2, application.getCourse());
            stmt.setString(3, application.getEmail());
            stmt.setBoolean(4, application.isOnline());

            stmt.executeUpdate();
            System.out.println("Successfully");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    public ArrayList<Application> getAll() {
        ArrayList<Application> applications = new ArrayList<>();
        String SQL = "SELECT * FROM applications";
        try (Connection conn = connect()) {
            PreparedStatement stmt = conn.prepareStatement(SQL);

            ResultSet rs = stmt.executeQuery();
            Application ap = null;
            while(rs.next()){
                ap = new Application(rs.getInt("id"),
                        rs.getString("fio"),
                        rs.getString("course"),
                        rs.getString("email"),
                        rs.getBoolean("isOnline"));
                applications.add(ap);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

        return applications;
    }
}
