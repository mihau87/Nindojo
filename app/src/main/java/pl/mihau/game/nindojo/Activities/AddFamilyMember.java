package pl.mihau.game.nindojo.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import pl.mihau.game.nindojo.R;

/**
 * Created by x on 21.01.2017.
 */

public class AddFamilyMember extends Activity {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListView familyList = (ListView) findViewById(R.id.familyListView);
        EditText enterNameEditText = (EditText) findViewById(R.id.familyMemberNameEditText);
        enterNameEditText.setText("Mihau");
//        FloatingActionButton addFloatingButton = (FloatingActionButton) findViewById(R.id.fab);

        return inflater.inflate(R.layout.family_member, container,false);
    }
}
