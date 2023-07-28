import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static javax.swing.JOptionPane.showMessageDialog;
public class ButtonListener implements ActionListener {
    public JTextField loginEmail;
    public JTextField loginPassword;
    SignUpFrame signUpFrame;
    LoginFrame loginFrame;
    public ButtonListener(JTextField loginEmail_field , JTextField loginPassword_field , LoginFrame loginFrame, SignUpFrame signUpFrame) {
        loginEmail = loginEmail_field;
        loginPassword = loginPassword_field;
        LoginFrame loginFrame1 = loginFrame;
        SignUpFrame signUpFrame1 = signUpFrame;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Email: " + loginEmail.getText());
        System.out.println("Password: " + loginPassword.getText());

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "15062001");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("username"));

                String userName = resultSet.getString("username");
                String password = resultSet.getString("password");

                if (userName.equals(loginEmail.getText()) || password.equals(loginPassword.getText())) {
                    LoginFrame loginFrame1 = new LoginFrame();
                    loginFrame1.run();
                    signUpFrame.setVisible(false);
                } else {
                    String msj = "Please Check Your Email or Password";
                    JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

//        if ("".equals(t1.getText()) || "".equals(t2.getText())){
//            OtherClass otherClass = new OtherClass();
//            otherClass.run();
//            controlPanel.setVisible(false);
//        }
//        else {
//            String msj = "Please Check Your Email or Password";
//            JOptionPane.showMessageDialog(null, msj, "Error", JOptionPane.ERROR_MESSAGE);
//        }
//        //if (e.getActionCommand().equals())
//    }
    }}



