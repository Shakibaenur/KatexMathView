package shakiba.enur.skatexmath.swing;

import shakiba.enur.skatexmath.awt.Graphics;
import shakiba.enur.skatexmath.awt.Component;


public interface Icon {
    void paintIcon(Component c, Graphics g, int x, int y);

    int getIconWidth();

    int getIconHeight();
}

