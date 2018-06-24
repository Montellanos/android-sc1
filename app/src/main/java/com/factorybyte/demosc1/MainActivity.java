package com.factorybyte.demosc1;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.factorybyte.demosc1.adapters.ViewPagerAdapter;
import com.factorybyte.demosc1.fragments.OptionAFragment;
import com.factorybyte.demosc1.fragments.OptionBFragment;
import com.factorybyte.demosc1.fragments.OptionCFragment;
import com.factorybyte.demosc1.helpers.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final BottomNavigationView navigationView = findViewById(R.id.navegation);

        BottomNavigationViewHelper helper = new BottomNavigationViewHelper();

        helper.removeShiftMode(navigationView);

        final ViewPager viewPager = findViewById(R.id.view_pager);


        Fragment optionA = new OptionAFragment();
        Fragment optionB = new OptionBFragment();
        Fragment optionC = new OptionCFragment();


        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());


        adapter.addFragment(optionA);
        adapter.addFragment(optionB);
        adapter.addFragment(optionC);

        viewPager.setAdapter(adapter);









        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


                switch (menuItem.getItemId()){

                    case R.id.optionA :
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.optionB:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.optionC:
                        viewPager.setCurrentItem(2);
                        return true;

                }
                return false;
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                navigationView.getMenu().getItem(i).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }
}
