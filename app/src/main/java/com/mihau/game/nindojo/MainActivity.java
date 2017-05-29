package com.mihau.game.nindojo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

import com.mihau.game.nindojo.activities.Login;
import com.mihau.game.nindojo.fragments.GeneralStats;
import com.mihau.game.nindojo.fragments.SecondFragment;

import android.support.design.widget.TabLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;




public class MainActivity
        extends AppCompatActivity implements ViewPager.OnPageChangeListener

{
    /**
     * fields
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;



    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeToolbar();
        initializeViewPager();
        initializeAppBar();
        initializeCrashlytics();



    }

    private void initializeViewPager() {

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(mSectionsPagerAdapter);
        pager.addOnPageChangeListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);
        tabLayout.setVisibility(View.VISIBLE);

    }

    private void initializeCrashlytics() {

        Fabric.with(this, new Crashlytics());

    }

    private void initializeAppBar(){

        AppBarLayout appBarLayout = (AppBarLayout)findViewById(R.id.appBar);
        appBarLayout.setExpanded(true, true);

    }

    private void initializeToolbar(){

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitleTextColor(0xFFFFFFFF);
        toolbar.setTitle("Statystyki");

        // przycisk wstecz

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                onBackPressed();

                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
            }

        });

    }


    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()){
            case R.id.settingsToolbarItem:
                Toast.makeText(this, "Zmieniam fragment",
                        Toast.LENGTH_LONG).show();

//                FragmentManager fm = getFragmentManager();
//                fm.beginTransaction().replace(R.id.viewPager, new SecondFragment()).commit();


//                Fragment someFragment = SecondFragment.newInstance();
//                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(android.R.id.content, someFragment ); // give your fragment container id in first parameter
//                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack
//                transaction.commit();
                return true;
        }


        return super.onOptionsItemSelected(item);
    }

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