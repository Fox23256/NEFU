import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleFrame extends java.awt.Frame {
    SimpleFrame(String s){
        super(s);
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args){
        new SimpleFrame("New name for frame");
    }
}
