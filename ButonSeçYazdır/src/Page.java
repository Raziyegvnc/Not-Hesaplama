import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Page extends JFrame {


    public Page(){

        getContentPane().setBackground(Color.PINK);//Böyle yaparakta framein rengini değiştirebilirim yada maini aç

        setLayout(new FlowLayout());
        JButton button = new JButton("Choose 1");
        button.setBackground(new Color(144, 31, 153));//Yeni renk oluşturmak için
        Font font = new Font("Calibre",Font.BOLD,12);
        JButton button2 = new JButton("Choose 2");

        //button.setHorizontalTextPosition(AbstractButton.HORIZONTAL);
        button.setVerticalTextPosition(AbstractButton.BOTTOM);
        button.setMnemonic(KeyEvent.VK_B);

        button2.setBackground(Color.CYAN);
        button2.setForeground(Color.BLUE);//Butonun üstünde yazan yazının rengini değiştiriyor
        button2.setFont(font);
        button.setFont(font);

        //Resim dosyalarını ekleme
        JButton button5 = new JButton("İcon");
        Image img = new ImageIcon(Page.class.getResource("/icon.png")).getImage();
        button5.setIcon(new ImageIcon(img));


        //Hareket algılayıcı
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {         //Ctrl+tek tık istediklerimize
                button.setBackground(Color.LIGHT_GRAY);    //yada sağ tık generate override methods
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                button.setBackground(Color.ORANGE);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.BLACK);
            }
        });

        add(button);
        add(button2);
        getContentPane().add(button5);

        ButtonListener listener = new ButtonListener();
        button.addActionListener((ActionListener) listener);
        button2.addActionListener((ActionListener) listener);
        setVisible(true);

    }
}

