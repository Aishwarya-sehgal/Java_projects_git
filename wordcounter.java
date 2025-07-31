import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class wordcounter {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Word Counter");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
    
        JLabel label1=new JLabel("Enter the text here");
        JLabel label2=new JLabel("The word count is");        
        JLabel label3=new JLabel("The letter count is");        
        
        label1.setOpaque(true);
        label2.setOpaque(true);
        label3.setOpaque(true);

        label1.setVerticalAlignment(JLabel.CENTER);

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();

        JTextArea textArea1=new JTextArea();
        textArea1.setColumns(25);
        textArea1.setRows(10);

        JTextField textField1=new JTextField();
        textField1.setColumns(7);

        JTextField textField2=new JTextField();
        textField2.setColumns(7);    

        JButton button1=new JButton("Count Words");
        JButton button2=new JButton("Count Letters");
        
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==button1){
                    Integer length=textArea1.getText().length();
                    textField1.setText(String.valueOf(length));
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == button2) {
                    String text = textArea1.getText();
                    int letterCount = 0;
                    for (int i = 0; i < text.length(); i++) {
                        if (Character.isLetter(text.charAt(i))) {
                            letterCount++;
                        }
                    }
                    textField2.setText(String.valueOf(letterCount));
                }
            }
        });
        
        label1.setFont(new Font("MONOSPACED",Font.BOLD,12));
        label2.setFont(new Font("MONOSPACED",Font.BOLD,12));
        label3.setFont(new Font("MONOSPACED",Font.BOLD,12));

        textArea1.setFont(new Font("MONOSPACED",Font.BOLD,12));
        textField1.setFont(new Font("MONOSPACED",Font.BOLD,12));
        textField2.setFont(new Font("MONOSPACED",Font.BOLD,12));

        button1.setFont(new Font("MONOSPACED",Font.BOLD,12));
        button2.setFont(new Font("MONOSPACED",Font.BOLD,12));

        label1.setForeground(Color.white);
        label2.setForeground(Color.white);
        label3.setForeground(Color.white);

        label1.setBackground(Color.black);
        label2.setBackground(Color.black);
        label3.setBackground(Color.black);

        textArea1.setBackground(Color.white);
        
        textField1.setBackground(Color.white);
        textField2.setBackground(Color.white);

        button1.setForeground(Color.black);
        button2.setForeground(Color.black);

        panel1.setBackground(Color.black);
        panel2.setBackground(Color.black);
        panel3.setBackground(Color.black);

        panel1.add(label1);
        panel1.add(textArea1);

        panel2.add(button1);
        panel2.add(label2);
        panel2.add(textField1);

        panel3.add(button2);
        panel3.add(label3);
        panel3.add(textField2);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setVisible(true);
    }
}
