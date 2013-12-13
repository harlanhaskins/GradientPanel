/*
The MIT License (MIT)

Copyright (c) 2013 Harlan Haskins

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GradientPanel extends JPanel {
    
    Color color1 = new Color(255, 255, 255);
    Color color2 = new Color(255, 255, 255);
    
    public GradientPanel(int i, int j, int k, int l, int m, int n) {
        color1 = new Color(i, j, k);
        color2 = new Color(l, m, n);
    }
    
    public GradientPanel(int i, int j) {
        color1 = new Color(i, i, i);
        color2 = new Color(j, j, j);
    }
    
    public GradientPanel(Color c1, Color c2) {
        color1 = c1;
        color2 = c2;
    }
    
    public GradientPanel(int i, int j, int k, Color c2) {
        color1 = new Color(i, j, k);
        color2 = c2;
    }
    
    public GradientPanel(Color c1, int l, int m, int n) {
        color1 = c1;
        color2 = new Color(l, n, m);
    }
    
    public void setColors(int i, int j, int k, int l, int m, int n) {
        color1 = new Color(i, j, k);
        color2 = new Color(l, m, n);
    }
    
    public void setColors(int i, int j) {
        color1 = new Color(i, i, i);
        color2 = new Color(j, j, j);
    }
    
    public void setColors(Color c1, Color c2) {
        color1 = c1;
        color2 = c2;
    }
    
    public void setColors(int i, int j, int k, Color c2) {
        color1 = new Color(i, j, k);
        color2 = c2;
    }
    
    public void setColors(Color c1, int l, int m, int n) {
        color1 = c1;
        color2 = new Color(l, n, m);
    }

    public void setColor(int i, int j, int k, int l) {
        if (i == 1)
            color1 = new Color(j, k, l);
        else
            color2 = new Color(j, k, l);
    }
    
    public void setColor(int i, Color c) {
        if (i == 1)
            color1 = c;
        else
            color2 = c;
    }
    
    public void setColor(int i, int j) {
        if (i == 1)
            color1 = new Color(j, j, j);
        else
            color2 = new Color(j, j, j);
    }
    
    public Color getColor(int i) {
        if (i == 1)
            return color1;
        return color2;
    }
    
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque(false);
        super.paintComponent(g);
    }
}
