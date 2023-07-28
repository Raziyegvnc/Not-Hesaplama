import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int vize1 = 0, vize2;
        int finali;

        String svize1 = JOptionPane.showInputDialog("Vize 1 notunu giriniz...");
        vize1 = Integer.parseInt(svize1);
        while (vize1 < 0 || vize1 > 79) {
            svize1 = JOptionPane.showInputDialog(null, "Vize 1 notu", JOptionPane.WARNING_MESSAGE);
            vize1 = Integer.parseInt(svize1);
        }

        String svize2 = JOptionPane.showInputDialog("Vize 2 notunu giriniz...");
        vize2 = Integer.parseInt(svize1);
        while (vize2 < 0 || vize2 > 100) {
            svize2 = JOptionPane.showInputDialog(null, "vize 2 notu", JOptionPane.WARNING_MESSAGE);
            vize2 = Integer.parseInt(svize2);
        }

        String sfinali = JOptionPane.showInputDialog("Final notunu giriniz...");
        //JOptionPane.showinputDialog bu yöntem kullanıcıdan girdi almak için kullanılır
        finali = Integer.parseInt(sfinali);
        while (finali < 0 || finali > 100) {
            sfinali = JOptionPane.showInputDialog(null, "final notu", JOptionPane.WARNING_MESSAGE);
            finali = Integer.parseInt(sfinali);
        }

        double result = vize1*0.2+vize2*0.2+finali*0.6;
        String mesaj = "";
        if(result<50){
            mesaj="Kaldınız";
        }
        else{
            mesaj="Geçtiniz";
        }
        JOptionPane.showMessageDialog(null,mesaj,"Sonuç açıklama",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog bu yöntem dialog görüntülemek için kullanılır

}}