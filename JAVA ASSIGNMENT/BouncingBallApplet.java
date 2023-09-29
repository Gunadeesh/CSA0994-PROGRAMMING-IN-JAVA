import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BouncingBallApplet extends Applet implements MouseListener, Runnable {
    private int x, y;           // Current position of the ball
    private int xSpeed = 2;     // Horizontal speed of the ball
    private int ySpeed = 2;     // Vertical speed of the ball
    private int ballSize = 20;  // Diameter of the ball

    private boolean isRunning = false; // Flag to control animation

    public void init() {
        setSize(400, 400);
        setBackground(Color.white);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        if (!isRunning) {
            x = e.getX();
            y = e.getY();
            isRunning = true;
            Thread t = new Thread(this);
            t.start();
        }
    }

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void run() {
        while (isRunning) {
            // Update the ball's position
            x += xSpeed;
            y += ySpeed;

            // Check for collisions with the edges of the applet
            if (x <= 0 || x + ballSize >= getWidth()) {
                xSpeed = -xSpeed; // Reverse horizontal direction
            }
            if (y <= 0 || y + ballSize >= getHeight()) {
                ySpeed = -ySpeed; // Reverse vertical direction
            }

            // Repaint the applet
            repaint();

            // Pause to control the animation speed
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, ballSize, ballSize);
    }
}
