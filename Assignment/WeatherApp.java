package Assignment;
import java.awt.*;
import java.awt.event.*;

class WeatherApp extends Frame
{

    TextField txt;
    Button b1, b2, b3, b4, b5, b6;

    WeatherApp()
    {

        // 4 rows, 2 columns
        setLayout(new GridLayout(4, 2));

        txt = new TextField();
        add(txt);      // Cell 1

        add(new Label(""));  // Empty cell because GridLayout cannot merge cells

        b1 = new Button("Temp: 30 Hum: 30");
        b2 = new Button("Temp: 50 Hum: 50");
        b3 = new Button("Temp: 10 Hum: 10");
        b4 = new Button("Temp: 0 Hum: 10");
        b5 = new Button("Temp: 25 Hum: 35");
        b6 = new Button("Temp: 30 Hum: 20");

        add(b1); add(b2);
        add(b3); add(b4);
        add(b5); add(b6);

        // Anonymous listeners
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(30, 30);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(50, 50);
            }
        });
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(10, 10);
            }
        });
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(0, 10);
            }
        });
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(25, 35);
            }
        });
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                checkWeather(30, 20);
            }
        });


        setSize(300, 350);
        setVisible(true);
    }

    void checkWeather(int temp, int hum)
    {

        if (temp == 50 && hum == 50)
            txt.setText("Summer");

        else if (temp == 30 && hum == 30)
            txt.setText("Moderate Day");

        else if (temp == 25 && hum == 35)
            txt.setText("Fall");

        else if (temp <= 10 && hum <= 10)
            txt.setText("Rainy");

        else if (temp == 0)
            txt.setText("Snow");

        else
            txt.setText("Normal Day");
    }

    public static void main(String[] args)
    {
        new WeatherApp();
    }
}