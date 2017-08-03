package com.chrishonwyllie.twitterlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    // Swipe View stuff
    // This is a custom FragmentPagerAdaper created below
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    // The TabLayout is the four tabs that appear at the top of the Twitter App
    private TabLayout mTabLayout;

    // This array of integers references the ids of the drawables that will be used as icons for the tabs
    // Twitter displays home, search, notification and message icons
    // These drawables can be found in the 'drawable-hdpi' folder
    public int[] tabbarIcons = {R.drawable.twitter_home_icon,
            R.drawable.twitter_search_icon,
            R.drawable.twitter_notification_icon,
            R.drawable.twitter_messages_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create the adapter that will return a fragment for each of the four primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);


        // Loop through the array of tab bar icons, and set the icon for the TabLayout object
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {

            // Create an ImageView which will display the icon
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(tabbarIcons[i]);

            // Set the imageView of the tab at[i] to this imageView
            mTabLayout.getTabAt(i).setCustomView(imageView);

        }
    }


    // Custom FragmentPagerAdapter to display each Fragment
    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {
            switch(pos) {

                // These are custom Fragment classes. Check them out
                // I will only comment the FragmentOne class, as they are all identical
                case 0: return FragmentOne.newInstance(0);
                case 1: return FragmentTwo.newInstance(1);
                case 2: return FragmentThree.newInstance(2);
                default: return FragmentFour.newInstance(3);
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

    }
}
