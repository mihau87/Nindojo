package com.mihau.game.nindojo.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.mihau.game.nindojo.MainActivity;
import com.mihau.game.nindojo.R;

/**
 * Created by mihau on 11.05.2017.
 */

public class Login extends Activity{

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.LoginButton);
        EditText loginEditText = (EditText) findViewById(R.id.LoginEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.PasswordEditText);
        CheckBox rememberMeCheckBox = (CheckBox) findViewById(R.id.RememberMeCheckBox);
    }

    public void launchActivity(View view) {
        Intent Intent = new Intent(this, MainActivity.class);
        startActivity(Intent);
        finish();
    }


}


