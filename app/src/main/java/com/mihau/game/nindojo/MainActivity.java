package com.mihau.game.nindojo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioGroup;

import com.mihau.game.nindojo.R;
import com.mihau.game.nindojo.activities.Login;
import com.mihau.game.nindojo.activities.Settings;
import com.mihau.game.nindojo.fragments.FirstFragment;
import com.mihau.game.nindojo.fragments.GeneralSettings;
import com.mihau.game.nindojo.fragments.SecondFragment;
import com.mihau.game.nindojo.fragments.ThirdFragment;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

import static com.mihau.game.nindojo.R.id.fab;

public class MainActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener
//        ,RadioGroup.OnCheckedChangeListener
{

    /**
     * fields
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

//    private static final int NUMBER_OF_PAGES = 4;
    private RadioGroup radioGroup;
    ViewPager pager;

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.viewPager);
        pager.setAdapter(mSectionsPagerAdapter);
        pager.addOnPageChangeListener(this);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(pager);

//        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
//        radioGroup.setOnCheckedChangeListener(this);



//        FloatingActionButton fab = (FloatingActionButton) findViewById(fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Tu dodasz punkty", Snackbar.LENGTH_SHORT)
//                        .setAction("Action", null).show();
//            }
//        });
    }



    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent Intent = new Intent(this, Settings.class);
            startActivity(Intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*************************************************************
     * Listeners for ViewPager
     *************************************************************/
    /**
     * When the current page is scrolled
     * @param position
     * @param v
     * @param i
     */
    @Override
    public void onPageScrolled(int position, float v, int i) {

    }

    /**
     * When a new page becomes selected
     * @param position
     */
    @Override
    public void onPageSelected(int position) {
        switch(position) {
            case 0:
//                radioGroup.check(R.id.radioButton1);
//                fab.show();
                break;
            case 1:
//                radioGroup.check(R.id.radioButton2);
//                fab.hide();
                break;
//            case 2:
//                radioGroup.check(R.id.radioButton3);
//                break;
            default:
                radioGroup.check(R.id.radioButton1);
//                fab.show();
        }
    }

    /**
     * When the pager is automatically setting to the current page
     * @param position
     */
    @Override
    public void onPageScrollStateChanged(int position) {

    }

    /**
     * On checked listener to Radio Buttons.
     * @param group
     * @param checkedId
     */
//    @Override
//    public void onCheckedChanged(RadioGroup group, int checkedId) {
//        switch(checkedId) {
//            case R.id.radioButton1:
//                pager.setCurrentItem(0);
//                break;
//            case R.id.radioButton2:
//                pager.setCurrentItem(1);
//                break;
//            case R.id.radioButton3:
//                pager.setCurrentItem(2);
//                break;
//            default:
//                pager.setCurrentItem(0);
//                break;
//        }
//    }



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
            switch(position) {
                case 0:
                    return FirstFragment.newInstance("FirstFragment, Instance 1");
                case 1:
                    return SecondFragment.newInstance("SecondFragment, Instance 1");
//                case 2:
//                    return ThirdFragment.newInstance("ThirdFragment, Instance 1");
                default:
                    return FirstFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            // Show total pages.
//            return 3;
        return 2;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "OGÓLNE";
                case 1:
                    return "HISTORIA";
//                case 2:
//                    return "USTAWIENIA";
            }
            return null;
        }
    }
}