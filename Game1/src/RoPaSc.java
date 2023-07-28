import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RoPaSc {
    JFrame frame ;
    JLabel P1;
    JLabel P2;
    JLabel P1_img;
    JLabel P2_img;
    JLabel score;
    JLabel draw ;
    JButton rock;
    JButton paper;
    JButton scissor;
    String p1;
    int P1_scor=0;
    int P2_scor=0;

    public RoPaSc(){
        this.frame=new JFrame("GAME");
        frame.setSize(1000,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(100,100,100,100));
        frame.setLocationRelativeTo(null);// ekranda ortalamak için

        this.rock = new JButton(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\rock.png"));
        rock.setBounds(50, 90, 200, 400);
        rock.setBorderPainted(false);
        rock.setOpaque(false);
        //rock.setContentAreaFilled(false);


        rock.addActionListener((ActionEvent e)->{
            P1_img.setIcon(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\photo-1603366615917-1fa6dad5c4fa.jpg"));
            p1 = "rock";
        });
        this.scissor = new JButton(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\scissor.png"));
        scissor.setBounds(500, 90, 200, 400);
        scissor.setBorderPainted(false);
        scissor.setOpaque(false);
        scissor.setContentAreaFilled(false);


        scissor.addActionListener((ActionEvent e)->{
            P1_img.setIcon(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\photo-1603366615917-1fa6dad5c4fa.jpg"));
            p1 = "scissor";
        });

        this.paper = new JButton(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\paper.png"));
        paper.setBounds(800, 90, 200, 400);
        paper.setBorderPainted(false);
        paper.setOpaque(false);
        paper.setContentAreaFilled(false);


        paper.addActionListener((ActionEvent e)->{
            P1_img.setIcon(new ImageIcon("C:\\Users\\gvncr\\IdeaProjects\\Game1\\src\\photo-1603366615917-1fa6dad5c4fa.jpg"));
            p1 = "paper";
        });

        this.P1 = new JLabel(P1_scor + "-" + P2_scor);
        P1.setBounds(150,40,160,50);
        this.P2 = new JLabel("Player 2");
        P2.setBounds(150,40,160,50);
        this.score = new JLabel("");
        score.setBounds(300,110,200,100);
        score.setHorizontalAlignment(JLabel.CENTER);
        this.draw = new JLabel("");
        draw.setBounds(350,180,100,20);
        draw.setHorizontalAlignment(JLabel.CENTER);



        frame.add(draw);
        frame.add(score);
        frame.add(P1_img);
        frame.add(P2_img);
        frame.add(P2);
        frame.add(P1);
        frame.add(scissor);
        frame.add(paper);
        frame.add(rock);
        frame.setVisible(true);
    }

}
