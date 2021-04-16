package rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.viewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.PrihodiFragment;
import rs.raf.RAF_WALLET.Anastasija_Radonjic_6819RN.view.fragments.RashodiFragment;

public class FinansijeAdapter extends FragmentPagerAdapter {

    private final int ITEM_COUNT = 2;
    public static final int PRVI_FRAGMENT = 0;
    public static final int DRUGI_FRAGMENT = 1;

    public FinansijeAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position) {
            case PRVI_FRAGMENT: fragment = new PrihodiFragment(); break;
            default: fragment = new RashodiFragment(); break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case PRVI_FRAGMENT: return "PRIHODI";
            default: return "RASHODI";
        }
    }

}
