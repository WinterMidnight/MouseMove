import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MouseMove extends JFrame {
    private JTextField textField;

    public MouseMove() {
        // Set up the frame
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Set the background color of the frame to pink
        getContentPane().setBackground(Color.PINK);

        // Create a text field to display mouse position
        textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.SOUTH);

        // Add a mouse listener to the frame
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Get the mouse position and set it to the text field
                int x = e.getX();
                int y = e.getY();
                textField.setText("Mouse Clicked at: (" + x + ", " + y + ")");
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Print mouse moved position in the console
                System.out.println("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the GUI
            MouseMove example = new MouseMove();
            example.setVisible(true);
    }
}
