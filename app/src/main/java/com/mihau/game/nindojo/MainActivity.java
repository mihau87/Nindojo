package com.mihau.game.nindojo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import com.mihau.game.nindojo.fragments.FirstFragment;
import com.mihau.game.nindojo.fragments.SecondFragment;
import com.mihau.game.nindojo.fragments.ThirdFragment;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
        implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener{

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

        radioGroup = (RadioGroup)findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(this);
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
                radioGroup.check(R.id.radioButton1);
                break;
            case 1:
                radioGroup.check(R.id.radioButton2);
//                radioGroup.check(R.id.radioButton1);
                break;
            case 2:
                radioGroup.check(R.id.radioButton3);
//                radioGroup.check(R.id.radioButton1);
                break;
            case 3:
                radioGroup.check(R.id.radioButton3);
//                radioGroup.check(R.id.radioButton1);
                break;
            default:
                radioGroup.check(R.id.radioButton1);
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
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId) {
            case R.id.radioButton1:
                pager.setCurrentItem(0);
                break;
            case R.id.radioButton2:
                pager.setCurrentItem(1);
                break;
            case R.id.radioButton3:
                pager.setCurrentItem(2);
                break;
            case R.id.radioButton4:
                pager.setCurrentItem(2);
                break;
            default:
                pager.setCurrentItem(0);
                break;
        }
    }

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
                case 2:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 1");
                case 3:
                    return FirstFragment.newInstance("FirstFragment, Instance 1");
                default:
                    return FirstFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            // Show total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "OGÓLNE";
                case 1:
                    return "HISTORIA";
                case 2:
                    return "USTAWIENIA";
                case 3:
                    return "SECTION 4";
            }
            return null;
        }
    }
}