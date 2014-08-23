package com.example.wisielec;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonHandler implements OnClickListener {

    private final MainActivity activity;

    public ButtonHandler(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onClick(View v) {
        String id = v.getContentDescription().toString();
        Character letter = id.charAt(0);
        activity.getGame().guessLetter(letter);
        activity.updateScreen();
        Button button = (Button) v;
        button.setEnabled(false);
    }

}
