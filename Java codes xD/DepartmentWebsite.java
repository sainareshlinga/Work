import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DepartmentWebsite extends JFrame implements ActionListener {
    // Declare components
    private JTabbedPane tabbedPane;
    private JPanel aboutPanel;
    private JPanel attendancePanel;
    private JPanel activitiesPanel;

    public DepartmentWebsite() {
        // Set layout
        setLayout(new BorderLayout());

        // Initialize components
        tabbedPane = new JTabbedPane();
        aboutPanel = new JPanel();
        attendancePanel = new JPanel();
        activitiesPanel = new JPanel();

        // Add components to tabbed pane
        tabbedPane.addTab("About", aboutPanel);
        tabbedPane.addTab("Attendance", attendancePanel);
        tabbedPane.addTab("Activities", activitiesPanel);

        // Add tabbed pane to frame
        add(tabbedPane, BorderLayout.CENTER);

        // Set frame properties
        setTitle("Department Website");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle events here
    }

    public static void main(String[] args) {
        new DepartmentWebsite();
    }
}