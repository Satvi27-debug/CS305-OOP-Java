package Assignment;
import java.awt.*;
import java.awt.event.*;

class MiniCal extends Frame
{
    MiniCal()
    {
        super("Calculator");
        setSize(400, 350);
        setLayout(null);     // IMPORTANT so setBounds() works

        // Labels
        Label l = new Label("Enter first number:");
        l.setBounds(50, 60, 120, 30);

        Label l1 = new Label("Enter second number:");
        l1.setBounds(50, 100, 120, 30);

        Label l2 = new Label("Result:");
        l2.setBounds(50, 140, 120, 30);

        // Text fields
        TextField t1 = new TextField(10);
        t1.setBounds(180, 60, 150, 30);

        TextField t2 = new TextField(10);
        t2.setBounds(180, 100, 150, 30);

        TextField t3 = new TextField(10);
        t3.setBounds(180, 140, 150, 30);

        // Buttons
        Button b = new Button("Add");
        b.setBounds(50, 200, 60, 40);

        Button b1 = new Button("Sub");
        b1.setBounds(120, 200, 60, 40);

        Button b2 = new Button("Mul");
        b2.setBounds(190, 200, 60, 40);

        Button b3 = new Button("Div");
        b3.setBounds(260, 200, 60, 40);

        // Button Actions
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(t1.getText() + " + " + t2.getText() + " = " +
                        (Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(t1.getText() + " - " + t2.getText() + " = " +
                        (Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText())));
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(t1.getText() + " * " + t2.getText() + " = " +
                        (Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText())));
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                t3.setText(t1.getText() + " / " + t2.getText() + " = " +
                        (Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText())));
            }
        });

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Add components AFTER layout set to null
        add(l);
        add(l1);
        add(l2);

        add(t1);
        add(t2);
        add(t3);

        add(b);
        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
    }

    public static void main(String[] args)
    {
        new MiniCal();
    }
}