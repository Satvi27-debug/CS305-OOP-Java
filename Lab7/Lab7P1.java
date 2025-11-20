import java.awt.*;
import java.awt.event.*;

class Lab7P1 extends Frame implements ItemListener
{
    Label l;
    Lab7P1()
    {
        super("Menu Bar Example");
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        String menus[] = {"File", "Edit", "Help", "More"};
        
        l = new Label();
        l.setFont(new Font("Arial", Font.BOLD, 20));
        l.setAlignment(Label.CENTER);
        l.setSize(40,40);
        add(l);
    
        for(String s : menus)
        {
            Menu m = new Menu(s);
            switch (s.toLowerCase())
            {
                case "file":
                    String[] file = {"New File : Ctrl + N", "Open File : Ctrl + O", "Save File : Ctrl + S", "Exit : Alt + F4"};
                    for (String item : file)
                    {
                        CheckboxMenuItem cmi = new CheckboxMenuItem(item);
                        cmi.addItemListener(this);
                        m.add(cmi);
                    }
                    break;
                case "edit":
                    String[] edit = {"Cut : Ctrl + X", "Copy : Ctrl + C", "Paste : Ctrl + V", "Delete : Backspace"};
                    for (String item : edit)
                    {
                        CheckboxMenuItem cmi = new CheckboxMenuItem(item);
                        cmi.addItemListener(this);
                        m.add(cmi);
                    }
                    break;
                case "help":
                    String[] help = {"Contents", "Index", "About"};
                    for (String item : help)
                    {
                        CheckboxMenuItem cmi = new CheckboxMenuItem(item);
                        cmi.addItemListener(this);
                        m.add(cmi);
                    }
                    break;
                default:
                    break;
            }
            mb.add(m);
        }
        setSize(500, 400);
        setVisible(true);
        setLayout(new BorderLayout());
        add(l, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    
    public void itemStateChanged(ItemEvent ie)
    {
        String msg = ie.getItem().toString();
        if(msg.equals("Exit : Alt + F4"))
        {
            dispose();
        }
        else
        {
            l.setText(msg);
        }
    }
    
    public static void main(String args[])
    {
        new Lab7P1();
    }
}
