package pl.mihau.game.nindojo.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.mihau.game.nindojo.R;

/**
 * Created by x on 21.01.2017.
 */

public class History extends Activity {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.history, container,false);
    }
}
