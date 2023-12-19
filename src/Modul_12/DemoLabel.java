package Modul_12;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500,500);
        URL img = FrameB.class.getResource("meganyachan.jpeg");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}
