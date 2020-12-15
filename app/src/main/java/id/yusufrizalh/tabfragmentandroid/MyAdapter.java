package id.yusufrizalh.tabfragmentandroid;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    //1: global variable
    Context context;
    int totalTabs;

    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabOneFragment tabOneFragment = new TabOneFragment();
                return tabOneFragment;
            case 1:
                TabTwoFragment tabTwoFragment = new TabTwoFragment();
                return tabTwoFragment;
            case 2:
                TabThreeFragment tabThreeFragment = new TabThreeFragment();
                return tabThreeFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
