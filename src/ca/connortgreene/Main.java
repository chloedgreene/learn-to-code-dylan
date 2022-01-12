package ca.connortgreene;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

    Robot r = new Robot();

    public Main() throws AWTException {
    }

    public void build() throws AWTException {
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JToggleButton button = new JToggleButton("Sussy Baka Press Space Bar");
        this.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Thread thread = new Thread(){
                    public void run(){
                       while (true){
                           space();
                       }
                    }
                };
                thread.start();

            }
        });
    }

    public void space(){
        r.keyPress(KeyEvent.VK_SPACE);
        r.keyRelease(KeyEvent.VK_SPACE);
    }

    public static void main(String[] args) throws AWTException {
	    new Main().build();
    }
}
