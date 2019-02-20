package com.pursuit.fragmentexercisescallbackcommunicationrevisited;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, RecyclerViewFrag.newInstance())
                .commit();
    }
    public void toDisplayFrag(){
        DisplayFrag displayFrag = DisplayFrag.newInstance();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, displayFrag)
                .addToBackStack(null)
                .commit();
}
}
