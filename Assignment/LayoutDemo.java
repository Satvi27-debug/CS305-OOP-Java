package Assignment;
import java.awt.*;
import java.awt.event.*;

class LayoutDemo extends Frame
{
    LayoutDemo()
    {
        super("Layout Demo");
        setVisible(true);
        setSize(400, 400);
        BorderLayout bl = new BorderLayout(10, 10);
        setLayout(bl);

        Button b1 = new Button("North");
        b1.setFont(new Font("Arial", Font.ITALIC, 16));
        Button b2 = new Button("South");
        b2.setFont(new Font("Arial", Font.ITALIC, 16));
        Button b3 = new Button("East");
        b3.setFont(new Font("Arial", Font.ITALIC, 16));
        Button b4 = new Button("West");
        b4.setFont(new Font("Arial", Font.ITALIC, 16));
        Button b5 = new Button("Center");
        b5.setFont(new Font("Arial", Font.ITALIC, 16));

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
        b5.setBackground(Color.black);
        b5.setForeground(Color.white);

        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                b1.setBackground(Color.white);
                b2.setBackground(Color.blue);
                b3.setBackground(Color.blue);
                b4.setBackground(Color.blue);
            }
        });

        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                b2.setBackground(Color.white);
                b1.setBackground(Color.green);
                b3.setBackground(Color.green);
                b4.setBackground(Color.green);
            }
        });

        b3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                b3.setBackground(Color.white);
                b2.setBackground(Color.red);
                b1.setBackground(Color.red);
                b4.setBackground(Color.red);
            }
        });

        b4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                b4.setBackground(Color.white);
                b2.setBackground(Color.yellow);
                b3.setBackground(Color.yellow);
                b1.setBackground(Color.yellow);
            }
        });

        b5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                b4.setBackground(Color.white);
                b2.setBackground(Color.white);
                b3.setBackground(Color.white);
                b1.setBackground(Color.white);
            }
        });

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });
    }
    public static void main(String[] args)
    {
        new LayoutDemo();
    }
}

// import java.awt.*;
// import java.awt.event.*;

// class LayoutDemo extends Frame {

//     private Label statusLabel;

//     LayoutDemo() {
//         super("Improved Layout Demo");

//         setSize(500, 450);
//         setLayout(new BorderLayout(10, 10));
//         setLocationRelativeTo(null);  // Center on screen

//         // --- MENU BAR ---
//         MenuBar menuBar = new MenuBar();

//         // File Menu
//         Menu fileMenu = new Menu("File");
//         MenuItem exitItem = new MenuItem("Exit");
//         exitItem.addActionListener(e -> dispose());
//         fileMenu.add(exitItem);

//         // Theme Menu
//         Menu themeMenu = new Menu("Theme");
//         MenuItem lightTheme = new MenuItem("Light Mode");
//         MenuItem darkTheme = new MenuItem("Dark Mode");

//         lightTheme.addActionListener(e -> setBackground(Color.LIGHT_GRAY));
//         darkTheme.addActionListener(e -> setBackground(Color.DARK_GRAY));

//         themeMenu.add(lightTheme);
//         themeMenu.add(darkTheme);

//         menuBar.add(fileMenu);
//         menuBar.add(themeMenu);
//         setMenuBar(menuBar);

//         // --- BUTTONS ---
//         Button bNorth = makeButton("North");
//         Button bSouth = makeButton("South");
//         Button bEast  = makeButton("East");
//         Button bWest  = makeButton("West");
//         Button bCenter = makeButton("Center");

//         add(bNorth, BorderLayout.NORTH);
//         add(bSouth, BorderLayout.SOUTH);
//         add(bEast,  BorderLayout.EAST);
//         add(bWest,  BorderLayout.WEST);
//         add(bCenter, BorderLayout.CENTER);

//         // CENTER BUTTON → SHOW DIALOG
//         bCenter.addActionListener(e -> {
//             Dialog d = new Dialog(this, "Center Button Clicked!", true);
//             d.setLayout(new FlowLayout());
//             d.add(new Label("You clicked the center button!"));
//             Button closeBtn = new Button("OK");
//             closeBtn.addActionListener(ev -> d.dispose());
//             d.add(closeBtn);

//             d.setSize(250, 150);
//             d.setLocationRelativeTo(this);
//             d.setVisible(true);
//         });

//         // STATUS BAR
//         statusLabel = new Label("Ready");
//         statusLabel.setBackground(Color.GRAY);
//         statusLabel.setForeground(Color.WHITE);
//         add(statusLabel, BorderLayout.SOUTH);

//         // BUTTON COLOR CHANGES
//         bNorth.addActionListener(e -> changeColors("North clicked", bNorth, Color.WHITE));
//         bSouth.addActionListener(e -> changeColors("South clicked", bSouth, Color.YELLOW));
//         bEast.addActionListener(e -> changeColors("East clicked", bEast, Color.CYAN));
//         bWest.addActionListener(e -> changeColors("West clicked", bWest, Color.PINK));

//         // CLOSE WINDOW
//         addWindowListener(new WindowAdapter() {
//             public void windowClosing(WindowEvent we) {
//                 dispose();
//             }
//         });

//         setVisible(true);
//     }

//     // Helper button creator
//     Button makeButton(String text) {
//         Button b = new Button(text);
//         b.setFont(new Font("Arial", Font.BOLD, 16));
//         return b;
//     }

//     // Helper to change colors & update status bar
//     void changeColors(String message, Button active, Color otherColor) {
//         statusLabel.setText(message);

//         for (Component c : getComponents()) {
//             if (c instanceof Button) {
//                 if (c == active)
//                     c.setBackground(Color.WHITE);
//                 else
//                     c.setBackground(otherColor);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         new LayoutDemo();
//     }
// }