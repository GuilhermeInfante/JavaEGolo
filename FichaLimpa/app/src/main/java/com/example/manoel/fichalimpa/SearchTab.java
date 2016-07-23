package com.example.manoel.fichalimpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Manoel on 7/23/2016.
 */
public class SearchTab extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        String content = intent.getStringExtra("SEARCHED_KEYWORD");

        final TextView searchResult = (TextView) findViewById(R.id.contentSearchText);
        searchResult.setText("Pesquisando " + content);
    }

}
