package main.controller;

import main.model.IModel2ViewAdapter;
import main.model.Model;
import main.view.IHomeView2ModelAdapter;
import main.view.HomeScreenView;

import java.awt.*;

public class Controller {

    // Fields for the adapters to close over:
    /**
     * model
     */
    private Model model;
    /**
     * view
     */
    private HomeScreenView homeScreenView;

    /**
     * Controller constructor builds the system
     */
    public Controller() {

        // Our view that implements behavior according to the adapter.
        homeScreenView = new HomeScreenView(new IHomeView2ModelAdapter() {

        });

        model = new Model(new IModel2ViewAdapter() {

        });
    }

    /**
     * Method to initialize both the view and model
     * so that the controller can execute successfully.
     */
    public void start() {
        model.start();
        homeScreenView.start();
    }

    /**
     * Launch the application.
     * @param args The arguments fed into our program.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    (new Controller()).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}




