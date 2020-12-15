package id.yusufrizalh.tabfragmentandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabThreeFragment extends Fragment {
    public TabThreeFragment() {
        // constructor
    }

    // untuk menghandle layout fragment_tab_three
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_three, container, false);
        return view;
    }
}
