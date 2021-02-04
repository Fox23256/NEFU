import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SumLab14 extends Frame {
    Label NewLabel(String Name, int x, int y, int width, int height){
        Label a= new Label(Name);
        a.setBounds(x, y, width, height);
        return a;
    }
    Button NewButton(String Name, int x, int y, int width, int height){
        Button a=new Button(Name);
        a.setBounds(x, y, width, height);
        return a;
    }
    public SumLab14(){
        setTitle("Sum");
        setLayout(null);
        setSize(300,300);

        TextField a= new TextField();
        TextField b= new TextField();
        TextField c= new TextField();

        a.setBounds(150,50,50,20);
        b.setBounds(150,85,50,20);
        c.setBounds(150,120,50,20);

        Label Error =
                NewLabel("Error in Field",150,200,100,20);
        Label firstLabel =
                NewLabel("First Number ",30,50,50,20);
        Label secondLabel =
                NewLabel("Second  Number",30,85,50,20);
        Label thirdLabel =
                NewLabel("Sum",30,120,50,20);

        Button calc = NewButton("Calculate",150,150,70,20);
        Button clear = NewButton("Clear",150,175,50,20);

        add(clear);
        add(calc);
        add(firstLabel);
        add(secondLabel);
        add(thirdLabel);
        add(a);
        add(b);
        add(c);
        setVisible(true);

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                int firstNum = Integer.parseInt(a.getText());
                int secondNum = Integer.parseInt(b.getText());
                String answer = String.valueOf(firstNum+ secondNum);
                c.setText(answer);
                }catch (NumberFormatException eb){
                    add(Error);
                    Error.setVisible(true);
                }

            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a.setText(null);
                b.setText(null);
                c.setText(null);
                Error.setVisible(false);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SumLab14 n = new SumLab14();
    }
}
