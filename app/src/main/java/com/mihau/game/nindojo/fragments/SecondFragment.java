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
public class SecondFragment extends Fragment {

    /**
     * fields
     */
//    private static SecondFragment instance = null;

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
        View v = inflater.inflate(R.layout.second_frag, container, false);

        TextView textView = (TextView) v.findViewById(R.id.tvFragSecond);
//        textView.setText(getArguments().getString("msg"));

        return v;
    }


    public static SecondFragment newInstance(){


        SecondFragment fragment = new SecondFragment();

//         sets data to bundle
         Bundle bundle = new Bundle();


//         set data to fragment
         fragment.setArguments(bundle);

        return fragment;
    }
}

