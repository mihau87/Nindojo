//package com.mihau.game.nindojo;
//
//import android.app.Activity;
//import android.support.design.widget.TabLayout;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v4.app.FragmentActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.TabsPagerAdapter;
//import android.widget.TextView;
//
//    public class MainActivity extends AppCompatActivity implements
//            ActionBar.TabListener {
//
//        private ViewPager viewPager;
//        private TabsPagerAdapter mAdapter;
//        private ActionBar actionBar;
//        // Tab titles
//        private String[] tabs = { "Text", "Photo", "Record" ,"Tag"};
//
//
//        @TargetApi(Build.VERSION_CODES.HONEYCOMB)
//        @SuppressLint("NewApi")
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            // Initilization
//            viewPager = (ViewPager) findViewById(R.id.pager);
//            actionBar = getActionBar();
//            mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
//
//            final int[] ICONS = new int[] {
//                    R.drawable.ic_launcher,
//                    R.drawable.ic_launcher,
//                    R.drawable.ic_launcher,
//                    R.drawable.ic_launcher,
//            };
//
//            viewPager.setAdapter(mAdapter);
//            actionBar.setHomeButtonEnabled(false);
//            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//            // Adding Tabs
//            for (String tab_name : tabs) {
//                actionBar.addTab(actionBar.newTab().setText(tab_name)
//                        .setTabListener(this));
//
//
//            }
//
//            /**
//             * on swiping the viewpager make respective tab selected
//             * */
//            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//
//                @Override
//                public void onPageSelected(int position) {
//                    // on changing the page
//                    // make respected tab selected
//                    actionBar.setSelectedNavigationItem(position);
//                }
//
//                @Override
//                public void onPageScrolled(int arg0, float arg1, int arg2) {
//                }
//
//                @Override
//                public void onPageScrollStateChanged(int arg0) {
//                }
//            });
//        }
//
//        @Override
//        public void onTabReselected(Tab tab, FragmentTransaction ft) {
//        }
//
//        @Override
//        public void onTabSelected(Tab tab, FragmentTransaction ft) {
//            // on tab selected
//            // show respected fragment view
//            viewPager.setCurrentItem(tab.getPosition());
//        }
//
//        @Override
//        public void onTabUnselected(Tab tab, FragmentTransaction ft) {
//        }
//
//    }