package com.recursivetree;

import javax.swing.*;

public interface ControlPanel {
    public abstract JSpinner getXSpinner();
    public abstract JSpinner getYSpinner();
    public abstract JSpinner getLineLengthSpinner();
    public abstract JSpinner getDepthSpinner();
}
