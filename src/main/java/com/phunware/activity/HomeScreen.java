package com.phunware.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import com.phunware.Injector;
import com.phunware.R;
import com.phunware.api.PhunwareS3Service;

import javax.inject.Inject;

public class HomeScreen extends ActionBarActivity {

    @Inject PhunwareS3Service phunwareS3Service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.inject(this);

        setContentView(R.layout.activity_home_screen);
        setSupportActionBar((Toolbar) findViewById(R.id.action_bar));
    }
}
