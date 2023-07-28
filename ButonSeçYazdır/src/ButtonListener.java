import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent a){
        if(a.getActionCommand().equals("Choose 1")){
            System.out.println("You have selected the button...");
        }
        else{
            System.out.println("You have selected the button2...");
        }
    }

}
