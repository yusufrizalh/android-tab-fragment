package id.yusufrizalh.tabfragmentandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    // 1: global variable
    TabLayout tab_layout;
    ViewPager view_pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2: mengenali semua komponen
        tab_layout = findViewById(R.id.tab_layout);
        view_pager = findViewById(R.id.view_pager);

        // 3: event handling
        // event handling utk Tab Layout
        tab_layout.addTab(tab_layout.newTab().setText("Tab One"));
        tab_layout.addTab(tab_layout.newTab().setText("Tab Two"));
        tab_layout.addTab(tab_layout.newTab().setText("Tab Three"));
        tab_layout.setTabGravity(TabLayout.GRAVITY_FILL);

        // membuat adapter utk memetakan setiap tab kedalam viewpager
        final MyAdapter adapter = new MyAdapter(this,
                getSupportFragmentManager(), tab_layout.getTabCount());
        view_pager.setAdapter(adapter);
        // event handling utk view pager ketiga digeser
        view_pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab_layout));
        // event handling utk tab layout ketika dipilih
        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}