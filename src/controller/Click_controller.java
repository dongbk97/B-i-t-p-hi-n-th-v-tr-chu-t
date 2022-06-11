package controller;

import view.Click_view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Click_controller implements MouseListener, MouseMotionListener {
    private Click_view click_view;

    public Click_controller(Click_view click_view) {
        this.click_view = click_view;
    }

    public Click_view getClick_view() {
        return click_view;
    }

    public void setClick_view(Click_view click_view) {
        this.click_view = click_view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.click_view.Click();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {
        this.click_view.EnterArr();
        int x= e.getX();
        int y=e.getY();
        this.click_view.GetPosition(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.click_view.ExitArr();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.click_view.EnterArr();
        int x= e.getX();
        int y=e.getY();
        this.click_view.GetPosition(x,y);
    }
}
