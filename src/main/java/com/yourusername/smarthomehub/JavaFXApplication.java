package com.yourusername.smarthomehub;

import javafx.application.Application;   // Brings in `Application` class from JavaFX, we need this because JavaFXApplication extends `Application`. This class provides a framework for a JavaFXApplication. It includes lifecycle methods like `init()`, `start()`, and `stop()` that we override to control the application's behavior.
import javafx.application.Platform;      // Brings in `Platform` class from JavaFX, we need this because `Platform` class has an `exit()` method which ensures that all JavaFX resources are properly cleaned up when the application stops.
import javafx.fxml.FXMLLoader;           // Brings in `FXMLLoader` class from JavaFX, we need this load the FXML file that defines the UI layout. It parses the XML file and creates the corresponding JavaFX objects., It's similar to loading a component to the DOM in React.
import javafx.scene.Parent;              // Brings in `Parent` class from JavaFX, we need this to load the base class for all JavaFX nodes that have children. We use it to represent the root node of our UI loaded from the FXML file. Think of it as the App() component in react that contains all the other nested components to the DOM.
import javafx.scene.Scene;               // Brings in `Scene` class from JavaFX, this is a container for all scene graph. We need it to display our UI on the window. It's similar to the entire DOM tree in a web page.
import javafx.stage.Stage;               // Brings in `Stage` from JavaFX this class represents the main window of a JavaFX application. We use it to set up the primary stage, set its title, and display the scene. It's like tha main browser window in a web app.
import org.springframework.boot.builder.SpringApplicationBuilder; // Brings in the `SpringApplicationBuilder` class  from Spring Boot, it's used to create and run a Spring application context. It provides an API for configuring and launching the application. It's similar to initializing the Apollo Client in a React application.
import org.springframework.context.ConfigurableApplicationContext; // Brings in the `ConfigurableApplicationContext` interface from Spring, it represents the Spring application context, which holds all the beans and confiuration settings., We need it to mnanage the lifecycle of our Spirng application and to access Spring beans in our JavaFX application. It's akin to a global state or context in React.

public class JavaFXApplication extends Application {
    private ConfigurableApplicationContext springContext;

    @Override
    public void init() {
        springContext = new SpringApplicationBuilder(SmartHomeHubApplication.class).run();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLader fxmlLoader = new FXMLLoader(getClass().getResource("/main.fxml"));
        fxmlLoader.setControllerFactory(SpringContext::getBean);
        Parent root = fxmlLoader.load();
        primaryStagee.setScene(new Scene(root, 600, 500));
        primaryStage.setTitle("Smart Home Hub");
        primaryStage.show();
    }

    @Override
    public void stop() {
        springContext.close();
        Platform.exit();
    }
}
