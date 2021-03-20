package com.github.qquang24t5._8tea;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewManager {

    public enum View {

        DEFAULT("Default");

        public final String fxmlFileName;
        private View(String fxmlFileName) {
            this.fxmlFileName = fxmlFileName;
        }

    }

    public static void setInitialView(View view) {
        initialView = view;
    }

    public static ViewManager getInstance() throws IOException {
        if (instance == null)
            instance = new ViewManager();
        return instance;
    }

    public void changeView(View view) throws IOException {
        EightTeaApplication.setRoot(views.get(view));
    }

    private ViewManager() throws IOException {
        views = new HashMap<>();
        for (View view : View.values()) {
            String fxmlPath = "presentation/views/" + view.fxmlFileName;
            views.put(view, fxmlPath);
        }

        changeView(initialView);

    }

    private static ViewManager instance;
    private final Map<View, String> views;
    private static View initialView = View.DEFAULT;

}
