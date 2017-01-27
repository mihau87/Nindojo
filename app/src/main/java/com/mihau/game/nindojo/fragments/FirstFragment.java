package com.mihau.game.nindojo.fragments;

/**
 * Created by x on 27.01.2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.mihau.game.nindojo.R;

public class FirstFragment extends Fragment {

    /**
     * fields
     */
    private static FirstFragment instance = null;

    /**
     * Create fragment view when paginated.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);

        EditText pointsEditText = (EditText) v.findViewById(R.id.pointsEditText);

        RadioGroup familyRadioGroup = (RadioGroup) v.findViewById(R.id.familyRadioGroup);

        Spinner actionsSpinner = (Spinner) v.findViewById(R.id.actionSpinner);

        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tu dodasz punkty", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
        return v;
    }

    /**
     * Returns new instance.
     *
     * @param text
     * @return
     */
    public static FirstFragment newInstance(String text){

        if(instance == null){
            // new instance
            instance = new FirstFragment();

            // sets data to bundle
            Bundle bundle = new Bundle();
            bundle.putString("msg", text);

            // set data to fragment
            instance.setArguments(bundle);

            return instance;
        } else {

            return instance;
        }

    }
}
