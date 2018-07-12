package com.example.myandroidbottomappbar;

import android.os.Bundle;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomAppBar bottomAppBar;
    MaterialButton btnMaterial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottom_appbar);
        setSupportActionBar(bottomAppBar);

        findViewById(R.id.materialButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleBottomAppBarFabAlignment();
            }
        });

    }

    private void toggleBottomAppBarFabAlignment() {

        if (bottomAppBar.getFabAlignmentMode() == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER) {
            bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_END);
        } else {
            bottomAppBar.setFabAlignmentMode(BottomAppBar.FAB_ALIGNMENT_MODE_CENTER);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_home) {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menu_dashboard) {
            Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menu_notifications) {
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
        } else if (itemId == android.R.id.home) {
            BottomNavigationDrawerFragment bottomSheet = new BottomNavigationDrawerFragment();
            bottomSheet.show(getSupportFragmentManager(), "tag");
        }
        return true;
    }
}
