package main.view;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The opening panel of the application.
 */
public class HomeScreenView extends JFrame {

    private JButton btnPractice;
    private JButton btnTest;
    private JLabel lblTitle;
    private JPanel pnlInteract;
    private JPanel pnlLogo;
    private JPanel pnlGUI;

    /**
     * The adapter that connect our view to the controller so that
     * messages can be sent to the model.
     */
    private IHomeView2ModelAdapter _view2Model = IHomeView2ModelAdapter.NULL_OBJECT;

    /**
     * Create the frame.
     * send information from the view to the adapter.
     */
    public HomeScreenView(IHomeView2ModelAdapter adapter) {
        this._view2Model = adapter;
        InitHomeGUI();
    }

    /**
     * Initialize the home screen GUI aspect of the application.
     */
    public void InitHomeGUI() {
        JFrame frame = new JFrame("Arithmetica");
        frame.setContentPane(pnlGUI);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 300, 700, 850);
        frame.pack();
        frame.setVisible(true);

        btnPractice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InitPracticeGUI();
                pnlLogo.setOpaque(true);
            }
        });

        btnTest.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InitTestGUI();
            }
        });
    }

    /**
     * Initialize the Practice GUI aspect of the application.
     */
    public void InitPracticeGUI() {

    }

    /**
     * Initialize the Testing GUI aspect of the application.
     */
    public void InitTestGUI() {

    }

    /**
     * Sets everything in our GUI to be visible.
     */
    public void start() {
        this.setVisible(true);
    }
}




