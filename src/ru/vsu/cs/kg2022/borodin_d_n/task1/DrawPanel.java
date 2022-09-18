package ru.vsu.cs.kg2022.borodin_d_n.task1;
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    //private table t;
    //private computer c;

    public DrawPanel(){
        //t = new Table()

        //this.addMouseListener();
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        //t.draw(g);

        //walls
        g.drawLine(0, getHeight(), getWidth()/4, (int) (getHeight()*0.75));
        g.drawLine((int) (getWidth()*0.75), (int) (getHeight()*0.75), getWidth(), getHeight());
        g.drawLine(0, 0, getWidth()/4, (getHeight()/6));
        g.drawLine((int) (getWidth()*0.75), (getHeight()/6), getWidth(), 0);
        g.drawRect(getWidth()/4, (getHeight()/6), (int) (getWidth()*0.5), (int) (getHeight()*0.583));

        //door
        g.drawLine(getWidth()/12, (int) (getHeight()*0.915), getWidth()/12, (int) (getHeight()*0.25));
        g.drawLine(getWidth()/6, (int) (getHeight()*0.832), getWidth()/6, (int) (getHeight()*0.3));
        g.drawLine(getWidth()/12, (int) (getHeight()*0.25), getWidth()/6, (int) (getHeight()*0.3));
        g.fillOval((int) (getWidth()/12 + 0.2*(getWidth()/6 - getWidth()/12)), (int) ((getHeight()*0.25) + 0.66*((getHeight()*0.832) - (getHeight()*0.25))), 8, 8);

        //window
        g.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.515), (int) (getWidth()*0.92), (int) (getHeight()*0.25));
        g.drawLine((int) (getWidth()*0.83), (int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.515));
        g.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.25), (int) (getWidth()*0.83), (int) (getHeight()*0.30));
        g.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.498));
        g.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.3), (int) (getWidth()*0.92), (int) (getHeight()*0.267));
        g.drawRect((int) (getWidth()*0.83), (int) (getHeight()*0.30), (int) (getWidth()*0.02), (int) (getHeight()*0.16));

        //table
        g.drawRect((int) (getWidth()*0.35), (int) (getHeight()*0.69), (int) (getWidth()*0.07), (int) (getHeight()*0.09));
        g.drawRect((int) (getWidth()*0.581), (int) (getHeight()*0.69), (int) (getWidth()*0.07), (int) (getHeight()*0.09));

        g.drawLine((int) (getWidth()*0.35), (int) (getHeight()*0.69), (int) (getWidth()*0.39), (int) (getHeight()*0.58));
        g.drawLine((int) (getWidth()*0.39), (int) (getHeight()*0.58), (int) (getWidth()*0.61), (int) (getHeight()*0.58));
        g.drawLine((int) (getWidth()*0.61), (int) (getHeight()*0.58), (int) (getWidth()*0.65), (int) (getHeight()*0.69));
        g.drawLine((int) (getWidth()*0.65), (int) (getHeight()*0.69), (int) (getWidth()*0.35), (int) (getHeight()*0.69));
        g.drawLine((int) (getWidth()*0.42), (int) (getHeight()*0.78), (int) (getWidth()*0.435), (int) (getHeight()*0.75));
        g.drawLine((int) (getWidth()*0.435), (int) (getHeight()*0.75), (int) (getWidth()*0.435), (int) (getHeight()*0.69));
        g.drawLine((int) (getWidth()*0.581), (int) (getHeight()*0.78), (int) (getWidth()*0.566), (int) (getHeight()*0.75));
        g.drawLine((int) (getWidth()*0.566), (int) (getHeight()*0.75), (int) (getWidth()*0.566), (int) (getHeight()*0.69));



    }
}
