package com.mihau.game.nindojo.fragments;

/**
 * Created by x on 27.01.2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mihau.game.nindojo.R;

/**
 * Fragment class.
 */
public class ThirdFragment extends Fragment {

    /**
     * fields
     */
    private static ThirdFragment instance = null;

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
        View v = inflater.inflate(R.layout.third_frag, container, false);

        TextView textView = (TextView) v.findViewById(R.id.tvFragThird);
        textView.setText(getArguments().getString("msg"));

        return v;
    }

    /**
     * Returns new instance.
     *
     * @param text
     * @return
     */
    public static ThirdFragment newInstance(String text){

        if(instance == null){
            // new instance
            instance = new ThirdFragment();

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
