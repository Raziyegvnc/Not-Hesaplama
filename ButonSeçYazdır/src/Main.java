import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        //Page page = new Page("Test");(Bunu kabul etmeme sebebi bunun frame olmaması
        Page page = new Page();
        page.setSize(300,300);
        //page.getContentPane().setBackground(Color.BLACK);(Böyle yaparak framein rengini değiştirebilirim yada page sınıfını aç)

        page.setTitle("Test");//Burada page sınıfı üzerinden constructora isim verdiğim için böyle
        //JFrame frame = new JFrame("Başlık"); bu şekilde olabilir çünkü burada direk framei adlandırdığı için
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.setLocationRelativeTo(null);//Frame'in tam ekranın ortasında gözükmesini sağlar
        //page.setResizable(false);(Bu satır çıkan frame'i genişletip daraltmamayı sağlar size neyse o boyutta verdirir.)
        page.setVisible(true);

    }}
