import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Game extends JFrame {
    int oyuncuSkor=0;
    int bilgisayarSkor=0;
    int oyuncu;
    int bilgisayar;
    JPanel oyuncuInf = new JPanel();
    JTextField ad = new JTextField(15);
    JPanel oyunAlanı = new JPanel();
    JPanel skor = new JPanel();

    public Game() {
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 12, 15);
        oyuncuInf.setLayout(flow);
        oyuncuInf.setBounds(20,20,900,80);
        oyuncuInf.setBackground(new Color(138, 155, 229));
        this.add(oyuncuInf);//Private olmadğı için this'e gerek yok o yüzden olması sıkıntı değil

        JLabel oyuncuAd = new JLabel("Adınız Soyadınız: ");
        oyuncuInf.add(oyuncuAd);
        oyuncuInf.add(ad);
        ad.setPreferredSize(new Dimension(100, 50));//Text Field boşluğunun boyunu ayarlar
        ad.setColumns(60);//Text Field boşluğunun enini ayarlar
        Font font = new Font("Calibre",Font.BOLD,30);
        oyuncuAd.setFont(font);

        oyunAlanı.setLayout(new GridLayout());
        oyunAlanı.setBounds(20,120,900,620);
        oyunAlanı.setBackground(new Color(150, 155, 200));
        add(oyunAlanı);

        JLabel resimuser = new JLabel();
        resimuser.setText("USER");
        resimuser.setBounds(120,30,100,50);
        oyunAlanı.add(resimuser);

        JLabel resimComp = new JLabel();
        resimComp.setText("COMPUTER");
        resimComp.setBounds(600,30,100,50);
        oyunAlanı.add(resimComp);

        JLabel başlık = new JLabel();
        skor.add(başlık);
        başlık.setText("SKOR");
        add(skor);
        skor.setBounds(930,20,440,718);
        skor.setBackground(new Color(150,155,250));
        //skor.setLayout(new FlowLayout(FlowLayout.LEFT)); (SKOR yazısını sola yazar)

        ButtonGroup butonGrubu = new ButtonGroup();
        JRadioButton taş = new JRadioButton();
        Dimension buttonDimension = new Dimension(10, 10);
        taş.setHorizontalAlignment(SwingConstants.LEFT);
        taş.setPreferredSize(buttonDimension);
        butonGrubu.add(taş);
        oyunAlanı.add(new JLabel("TAŞ"));
        oyunAlanı.add(taş);

        JRadioButton kağıt = new JRadioButton();
        kağıt.setPreferredSize(buttonDimension);
        butonGrubu.add(kağıt);
        oyunAlanı.add(new JLabel("KAĞIT"));
        oyunAlanı.add(kağıt);

        JRadioButton makas = new JRadioButton();
        butonGrubu.add(makas);
        makas.setPreferredSize(buttonDimension);
        oyunAlanı.add(new JLabel("MAKAS"));
        oyunAlanı.add(makas);

        oyunAlanı.setLayout(new GridLayout(8,2));

        JButton start = new JButton("BAŞLA");
        start.setSize(10,10);
        oyunAlanı.add(start);


        ad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kullaniciAdi = ad.getText();
                resimuser.setText(kullaniciAdi);
            }}
        );

    }
}
