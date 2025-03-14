import javax.swing.*;
import java.awt.*;

public class tetrisGUI {
    private JPanel panel;

    public tetrisGUI(JPanel panel) {
        this.panel = panel;
    }

    // Method to initialize and show the game screen
    public void startGame() {
        // Remove all components from the panel (clear the login form)
        panel.removeAll();

        // Add game components (for example, a label that says "Game is now starting...")
        JLabel gameLabel = new JLabel("Tetris");
        gameLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gameLabel.setBounds(200, 200, 300, 40); // Position the label

        panel.add(gameLabel);

        // You can add more game-related components here, like game buttons, game board, etc.

        // Revalidate and repaint the panel to update the display
        panel.revalidate();
        panel.repaint();
    }
}