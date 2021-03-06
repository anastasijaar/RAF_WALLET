package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.R;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.IzmenaProfilaFragment;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.ProfilFragment;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.viewpager.PagerAdapter;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.viewmodels.ListeViewModel;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ListeViewModel listeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listeViewModel = new ViewModelProvider(this).get(ListeViewModel.class);
        BottomNavigationView bottomNavigationView = findViewById(R.id.MainActivitybottomNavigation);
        //disable tint effect of selected item icon
        bottomNavigationView.setItemIconTintList(null);
        init();
    }

    private void init() {
        initViewPager();
        initNavigation();

    }


    private void initViewPager() {
        viewPager = findViewById(R.id.MainActivityViewPager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }

    private void initNavigation() {
        ((BottomNavigationView) findViewById(R.id.MainActivitybottomNavigation)).setOnNavigationItemSelectedListener(item -> {
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

    public ListeViewModel getListeViewModel() {
        return listeViewModel;
    }
}