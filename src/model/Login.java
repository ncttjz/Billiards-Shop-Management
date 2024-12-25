package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login {
    public static void main(String[] args) {
        new Login();
    }

    public Login() {
        JFrame frame = new JFrame("Login");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Desktop\\JzncttProJect\\icon.ico"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.setLayout(null); // Sử dụng null layout

        // Username label và field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        userLabel.setBounds(50, 30, 100, 20);

        JTextField userField = new JTextField();
        userField.setFont(new Font("Arial", Font.PLAIN, 12));
        userField.setBounds(130, 30, 150, 20);

        // Password label và field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        passLabel.setBounds(50, 70, 100, 20);

        JPasswordField passField = new JPasswordField();
        passField.setFont(new Font("Arial", Font.PLAIN, 12));
        passField.setBounds(130, 70, 150, 20);

        // Nút login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(130, 110, 80, 30);

        // Thông báo
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setBounds(50, 150, 250, 20);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // Thêm các thành phần vào frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // ActionListener cho nút login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText().trim();
                String password = new String(passField.getPassword()).trim();

                if (authenticate(username, password)) {
                    messageLabel.setText("Đăng nhập thành công!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Tài khoản hoặc mật khẩu không chính xác.");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        frame.setLocationRelativeTo(null); // Căn giữa cửa sổ
        frame.setVisible(true);
    }

    private boolean authenticate(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/owner";
        String dbUser = "root"; // USER Database
        String dbPass = "Zettc1702!"; // Password Database

        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
