package view;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import model.Login;

public class Main extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                showLoginWindow(); // Hiển thị cửa sổ đăng nhập trước
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Hiển thị cửa sổ đăng nhập.
     */
    private static void showLoginWindow() {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(350, 250);
        loginFrame.setResizable(false);
        loginFrame.setLayout(new MigLayout("fill", "[fill]", "[fill]"));

        Login loginPanel = new Login(() -> {
            loginFrame.dispose(); // Đóng cửa sổ đăng nhập
            showMainWindow(); // Mở giao diện chính
        });

        loginFrame.add(loginPanel, "grow");
        loginFrame.setLocationRelativeTo(null); // Hiển thị giữa màn hình
        loginFrame.setVisible(true);
    }

    /**
     * Hiển thị giao diện chính sau khi đăng nhập thành công.
     */
    private static void showMainWindow() {
        Main mainFrame = new Main();
        mainFrame.setVisible(true);
    }

    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(-5, 0, 1554, 680);
        setTitle("Billards Shop Management");
        setResizable(false);

        contentPane = new JPanel(new MigLayout("fillx, filly", "0[220!]0[fill, 100%]0", "0[fill]0"));
        setContentPane(contentPane);

        // Thêm Sidebar và Body
        Sidebar sidebar = new Sidebar();
        contentPane.add(sidebar, "width 220:220:220");

        Body body = new Body();
        contentPane.add(body, "grow");
    }
}
