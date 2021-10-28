package gui_practice;

import javax.swing.*;
import java.awt.*;

public class Alternate_Example extends JFrame {

    Alternate_Example(){
        this.setVisible(true);//Frame will be visible
        this.setSize(480,640);//width and height of the frame
        this.setTitle("JFrame title goes here");//Title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of JFrame application when x is clicked
        //frame.setResizable(false);

        //ImageIcon image = new ImageIcon("icon.png");//create an ImageIcon
        //frame.setIconImage(image.getImage());//changes icon of the frame

        //frame.getContentPane().setBackground(new Color(Hex or RGB values here));//Used to set background color for the frame
        this.getContentPane().setBackground(new Color(0x123456));
    }
}