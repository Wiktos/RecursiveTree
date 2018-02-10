package com.recursivetree;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class RecursiveTree extends JComponent {
    private final float x1;
	private final float y1;
    private final float lineLength;
    private final int depth;

	public RecursiveTree(float x1, float y1, float lineLength, int depth) {
		this.x1 = x1;
		this.y1 = y1;
		this.lineLength = lineLength;
		this.depth = depth;
	}

	public RecursiveTree(DrawControlPanel panel){
		x1 = (int) panel.getXSpinner().getValue();
		y1 = (int) panel.getYSpinner().getValue();
		lineLength = (int) panel.getLineLengthSpinner().getValue();
		depth = (int) panel.getDepthSpinner().getValue();
	}

	@Override
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    Graphics2D g2 = (Graphics2D) g;
	    Line2D.Float root = branch(x1, y1, 90.0);
	    g2.draw(root);

        drawTree(g2, root.x2, root.y2, 90.0, lineLength, depth);
	}

	private void drawTree(Graphics2D g2, float x1, float y1, double angle, float lineLength, int depth){
	    if (depth == 0)
	        return;

        Line2D.Float rightBranch = branch(x1, y1,  angle - 20);
        g2.draw(rightBranch);
        Line2D.Float leftBranch = branch(x1, y1, angle + 20);
        g2.draw(leftBranch);

        drawTree(g2, rightBranch.x2, rightBranch.y2, angle - 20, lineLength - 10, depth - 1);
        drawTree(g2, leftBranch.x2, leftBranch.y2, angle + 20, lineLength - 10, depth - 1);
    }

	private Line2D.Float branch(float x1, float y1, double angle){
	    float x2 = (int) (x1 + Math.cos(Math.toRadians(angle)) * lineLength);
	    float y2 = (int) (y1 - Math.sin(Math.toRadians(angle)) * lineLength);

	    return new Line2D.Float(x1, y1, x2, y2);
    }
}
