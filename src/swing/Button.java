package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author RAVEN
 */
public class Button extends JButton {

    private Shape shape;
    private final RippleEffect rippleEffect;
    private boolean hovered = false;

    public Button() {
        rippleEffect = new RippleEffect(this);
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(8, 5, 8, 5));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFocusPainted(false); // Loại bỏ viền chấm đen khi nhấn

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hovered = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hovered = false;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 165, 0, 120));
        g2.fill(shape);
        rippleEffect.reder(g2, shape);

        // Chỉ thêm hiệu ứng khi chuột rê vào
        if (hovered) {
            g2.setColor(new Color(255, 165, 0)); // Màu khi hover
            g2.fill(shape);
            rippleEffect.reder(g2, shape);
        }
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        shape = new FancyBorderRadius(getWidth(), getHeight(), "15% 85% 63% 37% / 38% 29% 71% 62%").getShape();
    }

}
