package com.example.tablayoutdemo;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(R.layout.layout_tab_class),true);
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(R.layout.layout_tab_student),false);
        mTabLayout.addTab(mTabLayout.newTab().setCustomView(R.layout.layout_tab_account),false);
        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.i("main","***select**"+tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.i("main","***onTabUnselected**"+tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.i("main","***onTabReselected**"+tab.getPosition());

            }
        });
    }
}
