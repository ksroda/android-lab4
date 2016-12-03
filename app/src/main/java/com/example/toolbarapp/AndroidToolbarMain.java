package com.example.toolbarapp;

/**
 * Created by Kamila on 01.12.2016.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.toolbarapp.androidtoolbarexample.R;

public class AndroidToolbarMain extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        initToolBar();

    }
    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle( R.string.toolbarTitle2);

        setSupportActionBar(toolbar);

        /*toolbar.setNavigationIcon(R.drawable.ic_toolbar_arrow);
        toolbar.setNavigationOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(AndroidToolbarMain.this, "clicking the toolbar!", Toast.LENGTH_SHORT).show();
                    }
                }

        );*/


    }

    public void onProfileAction(MenuItem mi) {
        Toast.makeText(AndroidToolbarMain.this, "clicking the Profile icon!", Toast.LENGTH_SHORT).show();
    }

    public void onDotsAction(MenuItem mi) {
        Toast.makeText(AndroidToolbarMain.this, "clicking the More icon!", Toast.LENGTH_SHORT).show();
    }

    public void sendMessage(View view)
    {
        Intent intent = new Intent(AndroidToolbarMain.this, AndroidToolbarSecond.class);
        startActivity(intent);
    }

}
