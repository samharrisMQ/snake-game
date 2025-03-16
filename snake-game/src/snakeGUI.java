import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class snakeGUI implements KeyListener{
    private JPanel panel;

    public snakeGUI(JPanel panel) {
        this.panel = panel;
    }

    // Method to initialize and show the game screen
    public void startGame() {
        // Remove all components from the panel (clear the login form)
        panel.removeAll();

        // Add game components (for example, a label that says "Game is now starting...")
        JLabel gameLabel = new JLabel("Press Arrow Key To Start");
        gameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gameLabel.setForeground(Color.WHITE);
        gameLabel.setBounds(200, 200, 300, 40); // Position the label

        panel.add(gameLabel);

        // You can add more game-related components here, like game buttons, game board, etc.
        panel.setBackground(Color.BLACK);
        // Revalidate and repaint the panel to update the display
        panel.revalidate();
        panel.repaint();
    }

    public void drawComponents(Graphics g) {
        g.drawRect(20,20,20,20);
        g.setColor(Color.GREEN);
    }

    public void userInput() {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
