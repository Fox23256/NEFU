import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingLab15 extends JFrame {
    JLabel jlabel;
    private JTextField txt;
    final JButton but1;
    final JButton but2;
    private JButton but3;

    SwingLab15(){
        super("Приложение которое прибавляет к числу +1 и -1.");
        setSize(400,400);
        setLayout(null);
        JTextField a= new JTextField();
        a.setText("0");
        a.setBounds(100,50,50,20);
        a.setEditable(false);
        jlabel= new JLabel("Number");
        jlabel.setBounds(25,50,50,20);
        but1 = new JButton("+1");
        but1.setBounds(200,50,50,20);
        but2 = new JButton("-1");
        but2.setBounds(200,85,50,20);
        add(a);
        add(jlabel);
        add(but1);

        add(but2);
        setVisible(true);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(a.getText())<3)
                a.setText(Integer.toString(Integer.parseInt(a.getText())+1));
                else{
                    System.out.println();
                }

            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Integer.parseInt(a.getText())>-5)
                a.setText(Integer.toString(Integer.parseInt(a.getText())-1));
                else{
                    System.out.println();
                }
            }
        });



    }
    public static void main(String[] args) {
        SwingLab15 n = new SwingLab15();
    }
}