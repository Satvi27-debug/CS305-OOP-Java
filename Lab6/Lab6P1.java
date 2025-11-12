import java.awt.event.*;
import java.awt.*;

class Lab6P1
{
    public static void main(String[] args) {
        final int[] n = {1};
        Frame f = new Frame("AWT Example");
        TextField tf = new TextField(20);
        // tf.setColumns(20); -> alternative to set size

        Button b = new Button("Click");
        b.setSize(20, 40);

        Label l = new Label();
        l.setPreferredSize(new Dimension(100, 100));

        // Action listener for button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("The text is : " + tf.getText() + n[0]);
                l.setText(tf.getText() + " " + n[0]);// -> To see Text in label
                //tf.setText("Hello"); -> To see Hello in TextBox / TextField
                n[0]++;
            }
        });

        // Window listener to handle close
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);
        f.add(tf);
        f.add(b);
        f.add(l);
        f.setVisible(true);
    }
}
