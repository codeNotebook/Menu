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
        TextView menuItem1TextView = findViewById(R.id.menu_item_1);
        String menuItem1 = menuItem1TextView.getText().toString();
        Log.v("MainActivity.java", menuItem1);
        // Find second menu item TextView and print the text to the logs
        TextView menuItem2TextView = findViewById(R.id.menu_item_2);
        String menuItem2 = menuItem1TextView.getText().toString();
        Log.v("MainActivity.java", menuItem2);
        // Find third menu item TextView and print the text to the logs
        TextView menuItem3TextView = findViewById(R.id.menu_item_3);
        String menuItem3 = menuItem1TextView.getText().toString();
        Log.v("MainActivity.java", menuItem3);
        // in b4 test commit again

    }
}
