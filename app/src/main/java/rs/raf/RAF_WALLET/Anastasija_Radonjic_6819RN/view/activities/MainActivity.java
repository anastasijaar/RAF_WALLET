package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.viewpager.PagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        //disable tint effect of selected item icon
        bottomNavigationView.setItemIconTintList(null);
        init();
    }

    private void init() {
        initViewPager();
        initNavigation();
    }

    private void initViewPager() {
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }

    private void initNavigation() {
        ((BottomNavigationView) findViewById(R.id.bottomNavigation)).setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                // setCurrentItem metoda viewPager samo obavesti koji je Item trenutno aktivan i onda metoda getItem u adapteru setuje odredjeni fragment za tu poziciju
                case R.id.navigation_1:
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_1, false);
                    break;
                case R.id.navigation_2:
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_2, false);
                    break;
                case R.id.navigation_3:
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_3, false);
                    break;
                case R.id.navigation_4:
                    viewPager.setCurrentItem(PagerAdapter.FRAGMENT_4, false);
                    break;
            }
            return true;
        });
    }
}