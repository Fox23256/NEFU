import javax.swing.*;

public class SwingLab15 extends JFrame {
    SwingLab15(){
        super("Приложение которое прибавляет к числу +1 и -1.");
        setSize(400,400);
        setLayout(null);
        JTextField a= new JTextField();
        a.setText("0");
        a.setBounds(100,50,50,20);
        a.setEditable(false);
        JLabel jlabel = new JLabel("Number");
        jlabel.setBounds(25,50,50,20);
        JButton but1 = new JButton("+1");
        but1.setBounds(200,50,50,20);
        JButton but2 = new JButton("-1");
        but2.setBounds(200,85,50,20);
        add(a);
        add(jlabel);
        add(but1);
        add(but2);
        setVisible(true);
        but1.addActionListener(e -> {
            if (Integer.parseInt(a.getText())<3)
                a.setText(Integer.toString(Integer.parseInt(a.getText())+1));
            else{
                System.out.println();
            }
        });
        but2.addActionListener(e -> {
            if (Integer.parseInt(a.getText())>-5)
                a.setText(Integer.toString(Integer.parseInt(a.getText())-1));
            else{
                System.out.println();
            }
        });
    }
    public static void main(String[] args) {
        new SwingLab15();
    }
}
