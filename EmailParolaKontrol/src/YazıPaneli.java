import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import static java.awt.FlowLayout.*;

public class YazıPaneli extends JFrame {
    JPanel yazıPaneli = new JPanel();
    JTextField ft = new JTextField(15);
    JTextField ft1 = new JTextField(15);

    public YazıPaneli(){

        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,15,15);
       // ft1.setPreferredSize(new Dimension(150, ft1.getPreferredSize().height));

        yazıPaneli.setLayout(f1);//this.setLayout(f1); şeklinde de yazılabilir
        //extends edersen this.xxx şeklinde kullanabilirsin ancak extend etmezsen 
        yazıPaneli.setBackground(Color.GREEN);

        JLabel label = new JLabel("Mail Address: ");
        yazıPaneli.add(label);
        yazıPaneli.add(ft);
        label.setToolTipText("Enter you mail address...");

        JLabel label1 = new JLabel("Password: ");
        yazıPaneli.add(label1);
        yazıPaneli.add(ft1);
        label1.setToolTipText("Enter your password...");

        JButton gonder = new JButton("Send");
        yazıPaneli.add(gonder);

        ButonDinleyici dinleyici = new ButonDinleyici(ft, ft1); // ft ve ft1 nesnelerini parametre olarak geçiyoruz
        gonder.addActionListener(dinleyici); // ActionListener'ı doğrudan dinleyici olarak ekliyoruz
        add(yazıPaneli);



    }
}
