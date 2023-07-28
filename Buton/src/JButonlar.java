import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class JButonlar extends JFrame {
    public JButonlar() {

        JLabel isim = new JLabel("İsim-Soyisim");
        add(isim);

        JTextField isimKutusu = new JTextField(10);
        add(isimKutusu);//JButonlar.add(...) yapmadık çünkü JButonlar frame ,add metodu da framein bir metodu o yüzden yazmıyoruz
        //Eğer label,text... olsaydı yapabilirdik.
        //Nesne tanımladık
        ButtonGroup butonGrup = new ButtonGroup();

        add(new JLabel("Cinsiyet : "));

        JRadioButton erkek = new JRadioButton();
        butonGrup.add(erkek);//Bu şekilde butonGroupa eklediğimiz için tek seçenek seçebiliyoruz
        add(new JLabel("Erkek"));
        add(erkek);
        JRadioButton bayan = new JRadioButton();
        butonGrup.add(bayan);// Erkek ve Bayan seçeneklerinden sadece bir tanesi seçileceği için butonGroup üzerinden add yaptık
        add(new JLabel("Bayan"));
        add(bayan);//Yukarıda butonGroupa ekledik ancak burada JButonlar örneği üzerine ekleriz

        add(new JLabel("Kayıt yaptırmak istediği kurslar :"));
        JCheckBox dans = new JCheckBox();
        add(new JLabel("Dans "));
        add(dans);
        JCheckBox gitar = new JCheckBox();
        add(new JLabel("Gitar "));
        add(gitar);
        JCheckBox resim = new JCheckBox();
        add(new JLabel("Resim "));
        add(resim);

        JButton tamamButon = new JButton("Tamam");
        add(tamamButon);

        setTitle("Butonlar Demo");
        setLayout(new FlowLayout());
        setBounds(350,50,230,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new JButonlar();
    }

}