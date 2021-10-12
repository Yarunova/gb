import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame
{
    int counter = 0;

    public Main()
    {
        setTitle("Счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,200,200);

        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);


        setLayout(new GridLayout(1,4));


        JButton buttonMinus = new JButton("-");

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                counter--;
                label.setText(String.valueOf(counter));

            }
        });

        JButton buttonPLus = new JButton("+");

        buttonPLus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                counter++;
                label.setText(String.valueOf(counter));
            }
        });

        JButton buttonZero = new JButton("C");

        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                counter = 0;
                label.setText(String.valueOf(counter));
            }
        });

        add(buttonMinus);
        add(label, BorderLayout.CENTER);
        add(buttonPLus);
        add(buttonZero);
        //add(label, BorderLayout.CENTER);

        setVisible(true);
    }

            public static void main(String[] args)
    {
        new Main();
    }
}
