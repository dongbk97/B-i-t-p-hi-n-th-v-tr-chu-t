package view;

import controller.Click_controller;
import model.Click_model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Click_view extends JFrame {
    private Click_model click_model;
    private JPanel jPanel_mouse;
    private JPanel jPanel_display;
    private JLabel jLabel_position;
    private JLabel jLabel_X;
    private JLabel jLabel_Y;
    private JLabel jLabel_numClick;
    private JLabel jLabel_numClick_valuae;
    private JLabel jLabel_emty1;
    private JLabel jLabel_exist;
    private JLabel jLabel_display;
    private JLabel jLabel_emt2;

    public Click_view() throws HeadlessException {
        this.click_model = new Click_model();
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Click_Mouse");
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Click_controller controller = new Click_controller(this);

        Font font = new Font("Time new roman", Font.BOLD, 20);
// Khu vực click chuột
        jPanel_mouse = new JPanel();
        jPanel_mouse.addMouseListener(controller);
        jPanel_mouse.addMouseMotionListener(controller);
        jPanel_mouse.setBackground(Color.cyan);
// Khu vực hiển thị
        jPanel_display = new JPanel();
        jPanel_display.setLayout(new GridLayout(3, 3));
        jLabel_position = new JLabel("Position: ");
        jLabel_position.setFont(font);
        jLabel_X = new JLabel();
        jLabel_X.setFont(font);
        jLabel_Y = new JLabel();
        jLabel_Y.setFont(font);
        jLabel_numClick = new JLabel("Number of Click: ");
        jLabel_numClick.setFont(font);
        jLabel_numClick_valuae = new JLabel();
        jLabel_numClick_valuae.setFont(font);
        jLabel_emty1 = new JLabel();
        jLabel_exist = new JLabel("Mouse exist: ");
        jLabel_exist.setFont(font);
        jLabel_display = new JLabel();
        jLabel_display.setFont(font);
        jLabel_emt2 = new JLabel();
        jPanel_display.add(jLabel_position);
        jPanel_display.add(jLabel_X);
        jPanel_display.add(jLabel_Y);
        jPanel_display.add(jLabel_numClick);
        jPanel_display.add(jLabel_numClick_valuae);
        jPanel_display.add(jLabel_emty1);
        jPanel_display.add(jLabel_exist);
        jPanel_display.add(jLabel_display);
        jPanel_display.add(jLabel_emt2);
//Set Layout chính
        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse, BorderLayout.CENTER);
        this.add(jPanel_display, BorderLayout.SOUTH);

    }

    public void Click() {
        this.click_model.NumOfClick();
        jLabel_numClick_valuae.setText(this.click_model.getCount() + "");
    }

    public void ExitArr() {

        this.click_model.Exit();
        jLabel_display.setText(this.click_model.getEnter());
    }

    public void EnterArr() {
        this.click_model.Enter();
        jLabel_display.setText(this.click_model.getEnter());

    }

    public void GetPosition(int x, int y) {
        jLabel_X.setText(x + "");
        jLabel_Y.setText(y + "");

    }

}
