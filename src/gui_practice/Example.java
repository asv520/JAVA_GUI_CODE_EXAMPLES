package gui_practice;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        //JFrame = a GUI window to add component to
        JFrame frame = new JFrame();
        frame.setVisible(true);//Frame will be visible
        frame.setSize(480,640);//width and height of the frame
        frame.setTitle("JFrame title goes here");//used for giving title to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of JFrame application when x is clicked
        //frame.setResizable(false);

        //ImageIcon image = new ImageIcon("icon.png");//create an ImageIcon
        //frame.setIconImage(image.getImage());//changes icon of the frame

        //frame.getContentPane().setBackground(new Color(Hex or RGB values here));//Used to set background color for the frame
        frame.getContentPane().setBackground(new Color(0x123456));
    }
}