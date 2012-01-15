package com.sathvik.viewpagerexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.TabPageIndicator;

public class ViewPagerTestActivity extends Activity {
	private ViewPager awesomePager;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
        awesomePager = (ViewPager) findViewById(R.id.viewpager);
        awesomePager.setAdapter(new ViewPagerAdapter(this));
        
      //Bind the title indicator to the adapter
        //TitlePageIndicator titleIndicator = (TitlePageIndicator)findViewById(R.id.titles);
        TabPageIndicator tabIndicator = (TabPageIndicator) findViewById(R.id.titles);
        tabIndicator.setViewPager(awesomePager);
    }
}