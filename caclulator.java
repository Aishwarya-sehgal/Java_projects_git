import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class caclulator {
    static double num1 = 0, num2 = 0 ,result = 0;
    static char operator=' ';
    public static void main(String[] args) {
        
        JFrame f1=new JFrame();
        f1.setSize( 500, 550);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);

        JButton[] numberButtons = new JButton [10];
        JButton[] functionButtons = new JButton[8];
        JButton addButton=new JButton("+");
        JButton subtractButton=new JButton("-");
        JButton multiplyButton=new JButton("*");
        JButton divideButton=new JButton("/");
        JButton clearButton=new JButton("clear");
        JButton equalButton=new JButton("=");
        JButton deleteButton=new JButton("delete");
        JButton decimalButton=new JButton(".");

        functionButtons[0]=addButton;
        functionButtons[1]=subtractButton;
        functionButtons[2]=multiplyButton;
        functionButtons[3]=divideButton;
        functionButtons[4]=clearButton;
        functionButtons[5]=equalButton;
        functionButtons[6]=deleteButton;
        functionButtons[7]=decimalButton;

        JTextField tf1=new JTextField();
        tf1.setBounds(50,25,300,50);
        tf1.setFont(new Font("SansSerif",Font.BOLD,20));

        for(int i=0;i<8;i++){
            functionButtons[i].setFont(new Font("SansSerif",Font.BOLD,20));
            functionButtons[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(e.getSource()==addButton){
                        num1=Double.parseDouble(tf1.getText());
                        operator='+';
                        tf1.setText("");
                    }
                    if(e.getSource()==subtractButton){
                        num1=Double.parseDouble(tf1.getText());
                        operator='-';
                        tf1.setText("");
                    }
                    if(e.getSource()==multiplyButton){
                        num1=Double.parseDouble(tf1.getText());
                        operator='*';
                        tf1.setText("");
                    }
                    if(e.getSource()==divideButton){
                        num1=Double.parseDouble(tf1.getText());
                        operator='/';
                        tf1.setText("");
                    }
                   
                    if(e.getSource()==decimalButton){
                        tf1.setText(tf1.getText().concat("."));
                    }
                    if(e.getSource()==equalButton){
                        num2=Double.parseDouble(tf1.getText());

                        switch (operator) {
                            case '+': result=num1+num2;
                                break;
                            case '-': result=num1-num2;
                                break;
                            case '*': result=num1*num2;
                                break;
                            case '/': result=num1/num2;
                                break;
                        }
                        tf1.setText(String.valueOf(result));
                        num1=result;
                    }
                    if(e.getSource()==clearButton) 
                    {
                        tf1.setText("");
                    }
                    if(e.getSource()==deleteButton) 
                    {
                        String string = tf1.getText();
                        tf1.setText("");
                        for (int i=0;i<string.length()-1;i++) 
                        {
                        tf1.setText(tf1.getText()+string.charAt(i));
                        }
                    }
                }
            });
            functionButtons[i].setFocusable(false);
        }

        for(int i=0;i<10;i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(new Font("SansSerif",Font.BOLD,20));
            numberButtons[i].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    for(int i=0;i<10;i++){
                        if(e.getSource()==numberButtons[i]){
                            tf1.setText(tf1.getText().concat(String.valueOf(i)));
                        }
                    }
                }
            });
            numberButtons[i].setFocusable(false);
        }

        JPanel panel= new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.lightGray);
        panel.setFont(new Font("SansSerif",Font.BOLD,20));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subtractButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiplyButton);

        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(divideButton);
        panel.add(equalButton);

        deleteButton.setBounds(50,430,145,50); 
        deleteButton.setFont(new Font("SansSerif",Font.BOLD,20));
        clearButton.setBounds(205,430,145,50);
        clearButton.setFont(new Font("SansSerif",Font.BOLD,20));

        f1.add(tf1);
        f1.add(panel);
        f1.add(deleteButton);
        f1.add(clearButton);
        f1.setVisible(true); 
    }
}