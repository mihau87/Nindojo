package com.mihau.game.nindojo.fragments;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by x on 27.01.2017.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.mihau.game.nindojo.R;

public class GeneralSettings extends Fragment {

    /**
     * fields
     */
    private static GeneralSettings instance = null;
    private ListView list ;
    private ArrayAdapter<String> adapter ;
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
        View v = inflater.inflate(R.layout.add_points, container, false);

//        list = (ListView) v.findViewById(R.id.GeneralStatsListView);
//
//        String cars[] = {"Mercedes", "Fiat", "Ferrari", "Aston Martin", "Lamborghini", "Skoda", "Volkswagen", "Audi", "Citroen"};
//
//        ArrayList<String> carL = new ArrayList<String>();
//        carL.addAll( Arrays.asList(cars) );
//
//        adapter = new ArrayAdapter<String>(this, R.layout.general_stats_item, carL);
//
//        list.setAdapter(adapter);
  return v;
    }
}