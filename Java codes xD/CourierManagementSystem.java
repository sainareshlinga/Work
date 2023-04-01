import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourierManagementSystem extends JFrame implements ActionListener {
    // Declare components
    private JTabbedPane tabbedPane;
    private JPanel homePanel;
    private JPanel calculatorPanel;
    private JPanel locationsPanel;
    private JPanel trackingPanel;

    public CourierManagementSystem() {
        // Set layout
        setLayout(new BorderLayout());

        // Initialize components
        tabbedPane = new JTabbedPane();
        homePanel = new JPanel();
        calculatorPanel = new JPanel();
        locationsPanel = new JPanel();
        trackingPanel = new JPanel();

        // Add components to tabbed pane
        tabbedPane.addTab("Home", homePanel);
        tabbedPane.addTab("Calculator", calculatorPanel);
        tabbedPane.addTab("Locations", locationsPanel);
        tabbedPane.addTab("Tracking", trackingPanel);

        // Add tabbed pane to frame
        add(tabbedPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("ABC Courier Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle events here
    }

    public static void main(String[] args) {
        new CourierManagementSystem();
    }
}