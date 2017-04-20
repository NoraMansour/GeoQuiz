package net.jaywolf.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/* The QuizActivity class is a CONTROLLER object. Controller objects contain the "application
 * logic." They are designed to respond to various events triggered by view objects and to manage
 * the flow of data from model objects and the view layer. Controller objects are typically a
 * subclass of Activity, Fragment, or Service classes.
 * - Android Programming: The Big Nerd Ranch Guide (Phillips, Stewart, Hardy, and Marsicano) */

public class QuizActivity extends AppCompatActivity {
// QuizActivity manages all layout elements and interactions for the specific activity.
// AppCompatActivity provides compatibility support for older versions of Android.

    // define member (instance) variables (these are the widgets we will be interacting with);
    private Button mTrueButton;
    private Button mFalseButton;
    // 'm' prefix on member variables = std Android naming convention;
    // used for Android Studio's auto-generation feature


    @Override
    // @Override asks the compiler to ensure that the class actually has the method that we are
    // attempting to override; throws an error if the method does not exist.
    protected void onCreate(Bundle savedInstanceState) {
        /* onCreate(Bundle) method called when instance of activity subclass created;
         * Prepares specifics of the user interface:
         * - inflates widgets and puts them on the screen (via setContentView(R.layout.resourceID)
         *     inflation = each widget in layout instantiated as defined by its attributes
         * - gets references to inflated widgets
         * - sets listeners on widgets to handle user interaction
         * - connects to external model data */
        super.onCreate(savedInstanceState);
        // must call superclass of onCreate() (and each other lifecycle stage) before doing anything
        // else b/c we are overriding the superclass' implementation with our own
        setContentView(R.layout.activity_quiz);
        /* setContentView() = Activity method;
         * An activity needs a user interface (layout) to manage;
         * Specify layout to inflate by passing layout's resource ID
         *   (aka get resource ID of the activity for the user interface to manage);
         * Inflates a layout and puts it on the screen */

        // Get the resource ID to the inflated True button widget
        mTrueButton = (Button) findViewById(R.id.true_button);
        // Decide what to do when the [True] button is pressed
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        /* Listeners respond to events in an activity and implement a listener interface for the
         * event; implemented as an anonymous inner class so the implementation of the listener's
         * method is easily seen;
         * This listener reacts when the [True] button is pressed;
         * Notice parentheses aren't closed in the setOnClickListener method call b/c we are
         * creating a new, nameless class of OnClickListener and passing its entire implementation
         * to the listener; OnClickListener class only has one method, onClick(View); can be empty
         * b/c compiler only requires method is implemented but doesn't care how */

        /* Toasts = pop-up messages that appear on the screen for a defined time and don't require
         * any interaction; method of the Toast class;
         * Format: makeText(Context context, int resID, int duration);
         * - Context = instance of Activity; Activity = subclass of Context;
         * - used to find text string's resource ID;
         * - Context in this case is QuizActivity, and "this" refers to View.OnClickListener
         *   in the anonymous inner class we are defining */

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuizActivity.this, R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
