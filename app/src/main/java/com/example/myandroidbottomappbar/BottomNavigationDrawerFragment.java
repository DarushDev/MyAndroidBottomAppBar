package com.example.myandroidbottomappbar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.NavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Darush on 7/9/2018.
 */
public class BottomNavigationDrawerFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bottomsheet, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavigationView navigationView = view.findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int itemId = menuItem.getItemId();

                if (itemId == R.id.navigation_plus) {
                    Toast.makeText(getActivity(), "Plus", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navigation_replay) {
                    Toast.makeText(getActivity(), "Replay", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.navigation_forward) {
                    Toast.makeText(getActivity(), "Forward", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });

    }

}
