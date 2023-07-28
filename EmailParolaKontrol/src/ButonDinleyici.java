import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonDinleyici implements ActionListener {
    private JTextField ft;
    private JTextField ft1;

    public ButonDinleyici(JTextField field1, JTextField field2) {

        ft = field1;

        ft1 = field2;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Email: " + ft.getText());
        System.out.println("Password: " + ft1.getText());
        if ("hello@hotmail.com".equals(ft.getText()) && "1234".equals(ft1.getText())){
            JFrame frame = new JFrame();
            FlowLayout flow = new FlowLayout();
            frame.setLayout(flow);
            frame.add(new JLabel("...YOU SUCCED..."));
            frame.setSize(400,400);
            frame.setTitle("New Window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            }
        else{

            System.out.println("PLEASE TRY AGAİN!!!");
        }
        }

}
