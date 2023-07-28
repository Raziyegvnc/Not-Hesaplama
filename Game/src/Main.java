import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Game games = new Game();
        games.setLayout(null);//Bunu yapmazsak otomatik olarak Border Layout ayarlıyor bu yüzden panel tüm framei kaplıyor
        games.setSize(1400,800);
        games.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        games.setTitle("Taş Kağıt Makas Oyunu");
        games.setLocationRelativeTo(null);
        games.getContentPane().setBackground(new Color(80, 89, 135));
        games.setVisible(true);

    }
}