package net.jaywolf.geoquiz;

/**
 * Created by jwolf on 4/20/2017.
 */

/* The Question class is a MODEL object. Model objects hold an application's data and "business
 * logic". They typically model the things the app is concerned with, such as a user, a product
 * in a store, a photo on a server, a television show, or a true/false question. Model objects
 * have no knowledge of the user interface; their sole purpose is holding and managing data.
 * They are generally custom classes you create. All model objects in the app = the model layer.
 * - Android Programming, The Big Nerd Ranch (Phillips, Stewart, Hardy, and Marsicano) */

public class Question {
// An instance of the Question class encapsulates a single True/False question.
// Question objects are stored in an array managed by QuizActivity.

    // define member variables
    private int mTextResID;
    private boolean mAnswerTrue;

    // default constructor
    public Question(int textRedId, boolean answerTrue) {
        mTextResID = textRedId;
        mAnswerTrue = answerTrue;
    }

    // getters and setters
    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
