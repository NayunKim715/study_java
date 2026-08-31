package ex4_listener;

import java.awt.event.WindowListener;

public class ListenerClass implements WindowListener{
    @Override
    public void windowOpened(java.awt.event.WindowEvent e) {}

    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {}

    @Override
    public void windowClosed(java.awt.event.WindowEvent e) {}

    @Override
    public void windowIconified(java.awt.event.WindowEvent e) {}
    //최소화 버튼 눌렀을 때 호출

    @Override
    public void windowDeiconified(java.awt.event.WindowEvent e) {}

    @Override
    public void windowActivated(java.awt.event.WindowEvent e) {}

    @Override
    public void windowDeactivated(java.awt.event.WindowEvent e) {}
    
}
