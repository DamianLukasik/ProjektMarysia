package pl.pcz.icis.budzetdomowy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Nefalem on 2015-04-11.
 */

public class wydatki extends ActionBarActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wydatki);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.action_bar_container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.glowna) {
            startActivity (new Intent (this, main.class));
            return true;
        }
        if(itemId == R.id.dodusu1){
            startActivity (new Intent (this, dochody.class));
            return true;
        }
        if(itemId == R.id.dodusu2){
            startActivity (new Intent (this, wydatki.class));
            return true;
        }
        if(itemId == R.id.statystyki){
            startActivity (new Intent (this, pokaz.class));
            return true;
        }
        if(itemId == R.id.edytuj){
            startActivity (new Intent (this, edytuj.class));
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup action_bar_container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.wydatki, action_bar_container, false);
            return rootView;
        }
    }
}
