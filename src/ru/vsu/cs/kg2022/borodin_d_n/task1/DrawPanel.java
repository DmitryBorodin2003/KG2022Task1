package ru.vsu.cs.kg2022.borodin_d_n.task1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class DrawPanel extends JPanel {

    //private table t;
    //private computer c;

    public DrawPanel(){
        //t = new Table()

        //this.addMouseListener();
    }

    private void colorize(Graphics2D g, GeneralPath path, int a, int b, int c){
        g.setColor(new Color(a, b, c));
        g.fill(path);
        path.reset();
        g.setColor(Color.black);
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        //t.draw(g);
        GeneralPath path = new GeneralPath();

        //walls
        path.moveTo(0, getHeight());
        path.lineTo(getWidth()*0.25, (getHeight()*0.75));
        path.lineTo(getWidth()*0.75, getHeight()*0.75);
        path.lineTo(getWidth(), getHeight());


        colorize(g,path, 154, 68, 28);


        path.moveTo(0, 0);
        path.lineTo(getWidth()*0.25, (getHeight()*0.166));
        path.lineTo(getWidth()*0.75, getHeight()*0.166);
        path.lineTo(getWidth(), 0);

        colorize(g,path, 220, 219, 219);

        path.moveTo(0, 0);
        path.lineTo(getWidth()*0.25, (getHeight()*0.166));
        path.lineTo(getWidth()*0.75, getHeight()*0.166);
        path.lineTo(getWidth(), 0);
        path.lineTo(getWidth(), getHeight());
        path.lineTo(getWidth()*0.75, getHeight()*0.75);
        path.lineTo(getWidth()*0.25, getHeight()*0.75);
        path.lineTo(0, getHeight());

        colorize(g,path, 163, 187, 246);

        g.drawLine(0, getHeight(), getWidth()/4, (int) (getHeight()*0.75));
        g.drawLine((int) (getWidth()*0.75), (int) (getHeight()*0.75), getWidth(), getHeight());
        g.drawLine(0, 0, getWidth()/4, (getHeight()/6));
        g.drawLine((int) (getWidth()*0.75), (getHeight()/6), getWidth(), 0);
        g.drawRect(getWidth()/4, (getHeight()/6), (int) (getWidth()*0.5), (int) (getHeight()*0.583));


        //door
        path.moveTo(getWidth()*0.0834, getHeight()*0.917);
        path.lineTo(getWidth()*0.166, getHeight()*0.835);
        path.lineTo(getWidth()*0.166, getHeight()*0.3);
        path.lineTo(getWidth()*0.0834, getHeight()*0.25);

        colorize(g,path, 66, 30, 1);

        g.drawLine(getWidth()/12, (int) (getHeight()*0.915), getWidth()/12, (int) (getHeight()*0.25));
        g.drawLine(getWidth()/6, (int) (getHeight()*0.832), getWidth()/6, (int) (getHeight()*0.3));
        g.drawLine(getWidth()/12, (int) (getHeight()*0.25), getWidth()/6, (int) (getHeight()*0.3));
        g.fillOval((int) (getWidth()/12 + 0.2*(getWidth()/6 - getWidth()/12)), (int) ((getHeight()*0.25) + 0.66*((getHeight()*0.832) - (getHeight()*0.25))), 8, 8);

        //window

        path.moveTo(getWidth()*0.92, getHeight()*0.25);
        path.lineTo(getWidth()*0.83, getHeight()*0.30);
        path.lineTo(getWidth()*0.83, getHeight()*0.46);
        path.lineTo(getWidth()*0.92, getHeight()*0.515);
        path.lineTo(getWidth()*0.92, getHeight()*0.498);
        path.lineTo(getWidth()*0.85,getHeight()*0.46);
        path.lineTo(getWidth()*0.85,getHeight()*0.3);
        path.lineTo(getWidth()*0.92, getHeight()*0.267);
        colorize(g, path, 255, 255, 255);

        path.moveTo(getWidth()*0.92, getHeight()*0.267);
        path.lineTo(getWidth()*0.92, getHeight()*0.498);
        path.lineTo(getWidth()*0.85,getHeight()*0.46);
        path.lineTo(getWidth()*0.85,getHeight()*0.3);
        colorize(g, path, 123, 241, 133);

        g.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.515), (int) (getWidth()*0.92), (int) (getHeight()*0.25));
        g.drawLine((int) (getWidth()*0.83), (int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.515));
        g.drawLine((int) (getWidth()*0.92), (int) (getHeight()*0.25), (int) (getWidth()*0.83), (int) (getHeight()*0.30));
        g.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.46), (int) (getWidth()*0.92), (int) (getHeight()*0.498));
        g.drawLine((int) (getWidth()*0.85) ,(int) (getHeight()*0.3), (int) (getWidth()*0.92), (int) (getHeight()*0.267));
        g.drawRect((int) (getWidth()*0.83), (int) (getHeight()*0.30), (int) (getWidth()*0.02), (int) (getHeight()*0.16));

        //table
        path.moveTo(getWidth()*0.35, getHeight()*0.69);
        path.lineTo(getWidth()*0.39, getHeight()*0.58);
        path.lineTo(getWidth()*0.61, getHeight()*0.58);
        path.lineTo(getWidth()*0.65, getHeight()*0.69);
        path.lineTo(getWidth()*0.65, getHeight()*0.78);
        path.lineTo(getWidth()*0.58, getHeight()*0.78);
        path.lineTo(getWidth()*0.565, getHeight()*0.75);
        path.lineTo(getWidth()*0.565, getHeight()*0.69);
        path.lineTo(getWidth()*0.435, getHeight()*0.69);
        path.lineTo(getWidth()*0.435, getHeight()*0.75);
        path.lineTo(getWidth()*0.42, getHeight()*0.78);
        path.lineTo(getWidth()*0.35, getHeight()*0.78);

        colorize(g, path, 238, 164, 108);

        g.drawRect((int) (getWidth()*0.35), (int) (getHeight()*0.69), (int) (getWidth()*0.07), (int) (getHeight()*0.09));
        g.drawRect((int) (getWidth()*0.581), (int) (getHeight()*0.69), (int) (getWidth()*0.07), (int) (getHeight()*0.09));

        g.setColor(new Color(112, 1, 1));
        g.fillRect((int) (getWidth()*0.355), (int) (getHeight()*0.70), (int) (getWidth()*0.06), (int) (getHeight()*0.02));
        g.fillRect((int) (getWidth()*0.355), (int) (getHeight()*0.725), (int) (getWidth()*0.06), (int) (getHeight()*0.02));
        g.fillRect((int) (getWidth()*0.355), (int) (getHeight()*0.75), (int) (getWidth()*0.06), (int) (getHeight()*0.02));
        g.fillRect((int) (getWidth()*0.586), (int) (getHeight()*0.7), (int) (getWidth()*0.06), (int) (getHeight()*0.072));
        g.setColor(Color.black);

        g.fillOval((int) (getWidth()*0.382), (int) (getHeight()*0.705), (int) (getWidth()*0.006), (int) (getHeight()*0.008));
        g.fillOval((int) (getWidth()*0.382), (int) (getHeight()*0.73), (int) (getWidth()*0.006), (int) (getHeight()*0.008));
        g.fillOval((int) (getWidth()*0.382), (int) (getHeight()*0.755), (int) (getWidth()*0.006), (int) (getHeight()*0.008));
        g.fillOval((int) (getWidth()*0.593), (int) (getHeight()*0.734), (int) (getWidth()*0.007), (int) (getHeight()*0.010));

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
