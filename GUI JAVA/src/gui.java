import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class gui {
    public static void main(String[] args) {

        // jframe is a gui application to add commponets to

        JFrame frame = new JFrame();
        // creates a new frame
        frame.setTitle("This is my title ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // USE DO NOTHING ON CLOSE OR EXIT OPERATION
        frame.setResizable(false);
        frame.setSize(400, 400);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("images.jpg");
        frame.setIconImage(image.getImage());// change icon of frame
        frame.getContentPane().setBackground(new Color(150, 52, 50));

    }
}
