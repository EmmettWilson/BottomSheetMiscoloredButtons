package com.github.emmettwilson.bottomsheetsmiscoloredbuttons;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tag = BottomSheetDialog.class.getSimpleName();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.newInstance();
            bottomSheetDialog.show(supportFragmentManager, tag);
        }
    }
}
