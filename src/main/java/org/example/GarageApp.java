package org.example;

        import org.example.beans.Garage;
        import org.example.beans.Mechanic;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

public class GarageApp {
    public static void main(String[] args) {
        Mechanic myMechanic = new Mechanic();
        myMechanic.setName("OLEG");
        myMechanic.setTool("Wrench");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Garage garage = context.getBean(Garage.class);

        garage.someGarageMethod();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/garage", "StillG", "124578963")) {
            String insertQuery = "INSERT INTO mechanics (mechanic_name, tool, garage_id) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, myMechanic.getName());
                preparedStatement.setString(2, myMechanic.getTool());
                preparedStatement.setInt(3, 1);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(garage);
    }
}