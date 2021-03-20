package com.github.qquang24t5._8tea.presentation;

import com.github.qquang24t5._8tea.ViewManager;

import java.io.IOException;

public abstract class ViewController {

    protected ViewManager viewManager;

    public ViewController() throws IOException {
        viewManager = ViewManager.getInstance();
    }

}
