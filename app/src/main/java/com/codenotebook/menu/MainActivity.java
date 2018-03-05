package com.codenotebook.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView tv1 = findViewById(R.id.menu_item_1);
        String menuItem1 = tv1.getText().toString();
        Log.v("MainActivity.java", menuItem1);
        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

    }
}
