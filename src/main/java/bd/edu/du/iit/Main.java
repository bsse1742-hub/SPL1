package bd.edu.du.iit.fintrack;

import bd.edu.du.iit.fintrack.model.User;
import bd.edu.du.iit.fintrack.model.IndividualUser;
import bd.edu.du.iit.fintrack.model.BusinessUser;


import javax.swing.*;
import java.awt.*;

public class Main {


    public static void main(String[] args) {
        IndividualUser individual = new IndividualUser(
                "U001",
                "Apon",
                "apon@example.com"
        );

        BusinessUser business = new BusinessUser(
                "U002",
                "Rahim",
                "rahim@example.com",
                "Rahim Store"
        );

        User[] users = {individual, business};

        for (User user : users) {
            System.out.println("ID: " + user.getUserId());
            System.out.println("Name: " + user.getName());
            System.out.println("Type: " + user.getUserType());
            System.out.println("-------------------------");
        }
        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame("FinTrack");

            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE
            );

            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);

            JLabel title = new JLabel(
                    "Welcome to FinTrack",
                    SwingConstants.CENTER
            );

            title.setFont(
                    new Font("Arial", Font.BOLD, 28)
            );

            frame.add(title, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}