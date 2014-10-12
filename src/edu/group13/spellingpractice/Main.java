package edu.group13.spelling;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Voice voice;
    private static VoiceManager vm;

    private Student student;
    private Lessons lessons;

    public static void main(String[] args)
    {
        // Application.launch() Start the JavaFX GUI system.
        launch(args);
    }

    /**
     * Initialize JavaFX Application
     *
     */
    public void init()
    {
        System.out.println("Begin init()...");

        // Load Preference
        System.out.println("Load Preferences");
        System.out.println("Preferences not loaded");

        // Load Lessons and WordLists and Student data, initialize.
        System.out.println("Loading Lessons");
        System.out.println("No Lessons loaded.");

        // initialize voice system
        System.out.println("Loading Voice system...");
        vm = VoiceManager.getInstance();
        voice = vm.getVoice("kevin16");
        voice.allocate();

        // Test speech
        voice.speak("Initializing...");
        System.out.println("Voice initialized and working...");
    }

    // Will eventually replace this with FXML Loader
    // and setup Scene switcher
    public void start(Stage stage)
    {
        System.out.println("Starting GUI");
        stage.setTitle("Spelling Practice");

        // The very root layout container, FlowPane is just 1 option
        FlowPane rootNode = new FlowPane();

        // Create the Scene
        Scene scene = new Scene(rootNode,800,600);

        stage.setScene(scene);

        stage.show();
        System.out.println("GUI Loaded and Showing");
    }

    public void stop()
    {
        System.out.println("Stopping Program");
        // Save out all changes and scores for student

        System.out.println("Saving scores");
        System.out.println("Scores not saved");

        System.out.println("Saving Lesson Changes");
        System.out.println("No Lessons Saved");
    }
}
