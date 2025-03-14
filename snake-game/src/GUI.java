import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    int count = 0;
    JLabel label;
    JFrame frame;
    JPanel panel;
    JButton button;

    public GUI() {
        frame = new JFrame();

        button = new JButton("Click to start");
        button.addActionListener(this);

        label = new JLabel("Attempts: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder());
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(100,100);
        frame.setTitle("snake");
        frame.pack();


        frame.setVisible(true);
    }


    public static void main(String[] args) throws Exception {
        System.out.println("test");

        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        count++;
        label.setText("Attempts: " + count);
    }
}
