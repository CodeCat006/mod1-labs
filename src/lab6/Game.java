package lab6;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {

    public static void main(String[] args) {
        new Game();
    }

    // Create an array of 3 balls here later
    Ball[] balls = {
    	    new Ball(10, 20, 30, 30, 2, 3),
    		new Ball(100, 150, 40, 40, 4, 2),
    		new Ball(200, 50, 25, 25, 3, 5)
    };
    

    Game() {
        JFrame frame = new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                draw();
            }
        };

        t.schedule(tt, 0, 50);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw() {
        for (Ball b : balls) {
        	b.move();
        }
        this.repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, 300, 300);
        g.setColor(Color.BLUE);
        for (Ball b : balls) {
        g.fillOval(b.x,  b.y,  b.w,  b.h);
        }

            }
}