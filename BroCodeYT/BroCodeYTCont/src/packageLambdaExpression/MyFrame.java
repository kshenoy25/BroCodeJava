package packageLambdaExpression;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("My Button");
    JButton myButton2 = new JButton("Other Button");
    MyFrame(){

        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(
                (e) -> System.out.println("You clicked my button!")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
                (e) -> System.out.println("You clicked my other button!")
        );



        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);

    }
}
