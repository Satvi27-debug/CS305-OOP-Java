package Assignment;
import java.awt.*;
import java.awt.event.*;

class GridBagDemo extends Frame implements ActionListener {

    TextField tf;
    String operator = "";
    int n1 = 0, n2 = 0, output = 0;

    GridBagDemo() {
        GridBagLayout gb = new GridBagLayout();
        setLayout(gb);
        GridBagConstraints gc = new GridBagConstraints();

        // ====== TEXT FIELD (TOP) ======
        tf = new TextField();
        tf.setFont(new Font("Arial", Font.BOLD, 24));

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 4;   // span across 4 columns
        gc.fill = GridBagConstraints.BOTH;
        gc.ipadx = 20;
        gc.ipady = 20;
        gc.insets = new Insets(10, 10, 10, 10);
        add(tf, gc);

        // ====== BUTTONS BELOW TEXT FIELD ======
        String[] ss = { "7", "8", "9", "+",
                        "4", "5", "6", "-",
                        "3", "2", "1", "*",
                        "0", "C", "=", "/" };

        int x = 0, y = 1;  // start from row 1

        for (String s : ss) {
            Button b = new Button(s);
            b.setFont(new Font("Arial", Font.BOLD, 20));
            b.addActionListener(this);

            gc.gridx = x;
            gc.gridy = y;
            gc.gridwidth = 1;
            gc.ipadx = 15;
            gc.ipady = 15;
            add(b, gc);

            x++;
            if (x == 4) {
                x = 0;
                y++;
            }
        }

        setSize(300, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String val = ae.getActionCommand();

        if (val.charAt(0) >= '0' && val.charAt(0) <= '9') {
            tf.setText(tf.getText() + val);
        } else if (val.equals("C")) {
            tf.setText("");
        } else if (val.equals("=")) {
            n2 = Integer.parseInt(tf.getText());
            switch (operator) {
                case "+": output = n1 + n2; break;
                case "-": output = n1 - n2; break;
                case "*": output = n1 * n2; break;
                case "/":
                    if (n2 == 0) {
                        tf.setText("Error: div/zero");
                        return;
                    }
                    output = n1 / n2;
                    break;
            }
            tf.setText(String.valueOf(output));
        } else {
            n1 = Integer.parseInt(tf.getText());
            operator = val;
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new GridBagDemo();
    }
}
