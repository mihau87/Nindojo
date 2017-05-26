package com.mihau.game.nindojo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;
import com.mihau.game.nindojo.fragments.GeneralStats;
import com.mihau.game.nindojo.fragments.SecondFragment;

import android.support.design.widget.TabLayout;
import android.view.View;


public class MainActivity
        extends AppCompatActivity implements ViewPager.OnPageChangeListener

{

    /**
     * fields
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    ViewPager pager;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize
        Fabric.with(this, new Crashlytics());
        initializeViewPager();
        String test = null;
        test.length();

        }

    private void initializeViewPager(){

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(mSectionsPagerAdapter);
        pager.addOnPageChangeListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    // Menu icons are inflated just as they were with actionbar
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.home) {
//            Intent Intent = new Intent(this, Login.class);
//            startActivity(Intent);
//            this.finish();
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    /*************************************************************
     * Listeners for ViewPager
     *************************************************************/
    /**
     * When the current page is scrolled
     *
     * @param position
     * @param v
     * @param i
     */

    /**
     * Custom PagerAdapter class
     */
    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // Show pages/tabs fragments
            switch (position) {
                case 0:
                    return GeneralStats.newInstance("FirstFragment, Instance 1");
                case 1:
                    return SecondFragment.newInstance();

                default:
                    return GeneralStats.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            // Show total pages/tabs.
            return 2;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            // Show pages/tabs titles
            switch (position) {
                case 0:
                    return "OGÓLNE";
                case 1:

                    return "HISTORIA";
            }
            return null;
        }
    }
}