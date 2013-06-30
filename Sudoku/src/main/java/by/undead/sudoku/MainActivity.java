package by.undead.sudoku;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnContinue).setOnClickListener(this);
        findViewById(R.id.btnNew).setOnClickListener(this);
        findViewById(R.id.btnAbout).setOnClickListener(this);
        findViewById(R.id.btnExit).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnContinue: {

                break;
            }
            case R.id.btnNew: {
                openNewGameDialog();
                break;
            }
            case R.id.btnAbout: {
                startActivity(new Intent(this, AboutActivity.class));
                break;
            }
            case R.id.btnExit: {

                break;
            }
        }

    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings: {
                startActivity(new Intent(this, SettingsActivity.class));
                return true;
            }
        }
        return false;
    }

    private void openNewGameDialog() {

    }
}
