//Author : Beulah  Evanjalin
//Central University of Tamil Nadu
//Advanced Programming – Java Lab-1
//Date : 29/7/2020
//Displaying welcome message
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;

public class WelcomeWindow {
    public static void main (String args[]) {
        // This creates a label with a plain text
        JLabel welcome = new JLabel("Welcome user");
        welcome.setHorizontalAlignment(JLabel.CENTER);
        welcome.setFont(new Font("Serif", Font.PLAIN, 33));
        // Now you need a frame to hold the label
        // so that it can be displayed in the gui
        JFrame app = new JFrame();
        // This empty JFrame app can hold the label
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // putting the welcome screen in the center of the GUI
        app.add(welcome,BorderLayout.CENTER);
        app.setSize(400,400);
        app.setVisible(true);
    }
}