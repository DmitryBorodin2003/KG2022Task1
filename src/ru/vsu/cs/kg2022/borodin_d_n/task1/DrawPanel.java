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
        gr.drawLine(0, getHeight(), getWidth()/4, (int) (getHeight()*0.75));
        gr.drawLine((int) (getWidth()*0.75), (int) (getHeight()*0.75), getWidth(), getHeight());
        gr.drawLine(0, 0, getWidth()/4, (getHeight()/6));
        gr.drawLine((int) (getWidth()*0.75), (getHeight()/6), getWidth(), 0);
        gr.drawRect(getWidth()/4, (getHeight()/6), (int) (getWidth()*0.5), (int) (getHeight()*0.583));

        //door
        gr.drawLine(getWidth()/12, (int) (getHeight()*0.915), getWidth()/12, (int) (getHeight()*0.25));
        gr.drawLine(getWidth()/6, (int) (getHeight()*0.832), getWidth()/6, (int) (getHeight()*0.3));
        gr.drawLine(getWidth()/12, (int) (getHeight()*0.25), getWidth()/6, (int) (getHeight()*0.3));
        gr.fillOval((int) (getWidth()/12 + 0.2*(getWidth()/6 - getWidth()/12)), (int) ((getHeight()*0.25) + 0.66*((getHeight()*0.832) - (getHeight()*0.25))), 8, 8);

        //window
        gr.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.515), (int) (getWidth()*0.92), (int) (getHeight()*0.25));
        gr.drawLine((int) (getWidth()*0.83), (int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.515));
        gr.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.25), (int) (getWidth()*0.83), (int) (getHeight()*0.30));
        gr.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.498));
        gr.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.3), (int) (getWidth()*0.92), (int) (getHeight()*0.267));
        gr.drawRect((int) (getWidth()*0.83), (int) (getHeight()*0.30), (int) (getWidth()*0.02), (int) (getHeight()*0.16));
    }
}
