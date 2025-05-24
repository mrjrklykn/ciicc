package Java;

import jdk.jfr.internal.tool.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hala extends JFrame{
    private JPanel A;
    private JTextField textField1;
    private JTextField textField2;
    private JButton okayButton;
    private JLabel sumText;

    public Hala() {
        setContentPane(A);
        setVisible(true);
        setTitle("Calculator");
        setSize(400,300);
        setLocationRelativeTo(null);
        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum=0;
                sum =Integer.parseInt(textField1.getText()) +
                        Integer.parseInt(textField2.getText());
                System.out.println("The answer is ");
                System.out.println(sum);
                sumText.setText(String.valueOf(sum));
                setContentPane(sumText);
            }
        });
    }
    public static void main (String[] args)
    {
      new Hala ();
    }
}
