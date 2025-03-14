import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginGUI implements ActionListener {
    
    private JLabel user;
    private JTextField userText;
    private JLabel pass;
    private JPasswordField passText;
    private JButton button;
    private JLabel success;
    private JPanel panel;
    private JFrame frame;


    public static void main(String[] args) {
        LoginGUI loginGui = new LoginGUI();
        loginGui.setupGUI();
    }

    public LoginGUI() {
        panel = new JPanel();
        frame = new JFrame();

        user = new JLabel("user:");
        userText = new JTextField();

        pass = new JLabel("pass:");
        passText = new JPasswordField();

        button = new JButton("Login");
        button.addActionListener(this);

        success = new JLabel("");
    }

    public void setupGUI() {
        //frame setup
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        //panel setup
        panel.setLayout(null);

        //setup layout for components
        int labelWidth = 80;
        int labelHeight = 25;
        int xMiddle = frame.getWidth() / 2 - labelWidth;
        int yMiddle = frame.getHeight() /2 - labelHeight*2;
        int fieldWidth = 165;
        int fieldHeight = 25;

        int labelxPos = xMiddle - labelWidth;
        int labelyPos = yMiddle - labelHeight;

        //set bounds for components & add them to frame
        user.setBounds(labelxPos, labelyPos, labelWidth, labelHeight);
        panel.add(user);

        
        userText.setBounds(labelxPos + labelWidth, labelyPos, fieldWidth, fieldHeight);
        panel.add(userText);

        
        pass.setBounds(labelxPos, labelyPos + labelHeight, labelWidth, labelHeight);
        panel.add(pass);

        
        passText.setBounds(xMiddle, yMiddle, fieldWidth, fieldHeight);
        panel.add(passText);

        
        button.setBounds(xMiddle, yMiddle + labelHeight, labelWidth, labelHeight);
        panel.add(button);

        
        success.setBounds(xMiddle - labelWidth, yMiddle + labelHeight*2, labelWidth*3, labelHeight);
        panel.add(success);
        
        //make frame visible
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();
        System.out.println(user + ", " + password);

        if(user.equals("snake") && password.equals("snake")) { //start snake
            success.setText("Login successful, starting snake.");

            new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    success.setText("Login successful, starting snake..");
                }
            }).start();
            new Timer(2000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    success.setText("Login successful, starting snake...");                  
                }
            }).start();
            new Timer(3000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                         snakeGUI gameGui = new snakeGUI(panel);  
                         gameGui.startGame();             
                }
            }).start(); 
        } else if(user.equals("") || password.equals("")) { //invalid user/pass
            success.setText("Please enter a username & password");
        } else if(user.equals("tetris") && password.equals("tetris")) { //start tetris
            success.setText("Login successful, starting tetris.");

            new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    success.setText("Login successful, starting tetris..");
                }
            }).start();
            new Timer(2000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    success.setText("Login successful, starting tetris...");                  
                }
            }).start();
            new Timer(3000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                         tetrisGUI tetrisGui = new tetrisGUI(panel);  
                         tetrisGui.startGame();             
                }
            }).start();
        } else { //incorrect login
            success.setText("Incorrect username/password");
        }
    }
}