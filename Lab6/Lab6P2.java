import java.awt.event.*;
import java.awt.*;

class Lab6P2 implements ActionListener//, WindowListener
{
    final int[] n = {1};
    Frame f = new Frame("AWT Example");
    TextField tf = new TextField(20);
    // tf.setColumns(20); -> alternative to set size

    Button b = new Button("Click");
    Label l = new Label();

    Lab6P2()
    {
        // Configure components (move statements out of class body into constructor)
        b.setSize(80, 30);
        l.setPreferredSize(new Dimension(100, 100));

        // Action listener for button
        b.addActionListener(this);
        //f.addWindowListener(this);
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
        f.pack();
        f.setVisible(true);
    }
    
    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        System.out.println("The text is : " + tf.getText() + n[0]);
        l.setText(tf.getText() + " " + n[0]);// -> To see Text in label
        //tf.setText("Hello"); -> To see Hello in TextBox / TextField
        n[0]++;
    }

    /*// WindowListener implementations
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}*/

    public static void main(String[] args) {
        new Lab6P2();
    }
}