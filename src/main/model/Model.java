package main.model;

import javax.swing.*;

public class Model {

    /**
     * Length of a time slice
     */
    // private int _timeSlice = 50; // update every 50 milliseconds

    /**
     * Adapter to the view
     */
    private IModel2ViewAdapter _viewControlAdpt = IModel2ViewAdapter.NULL_OBJECT; // Insures that the adapter is always valid

    /**
     * Timer for update ticks
     */
    // private Timer _timer = new Timer(_timeSlice, (e) -> null);

    /**
     * The constructor for BallModel
     * @param viewControlAdpt the adapter from model to view for control tasks
     */
    public Model(IModel2ViewAdapter viewControlAdpt) {
        this._viewControlAdpt = viewControlAdpt;
    }

    /**
     * Start the ball model
     */
    public void start() {
        // _timer.start();


    }

}




