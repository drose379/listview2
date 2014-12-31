package dylanrose60.listview2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    protected List<Computer> comps = new ArrayList<Computer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addToList();
        addToView();

    }

    public void addToList() {
        comps.add(new Computer("Macbook Pro","OSX Yosemite"));
        comps.add(new Computer("ChromeBook","Google"));
    }

    public void addToView() {
        ArrayAdapter<Computer> adapter = new SubArrayAdapter();
        ListView list = (ListView) findViewById(R.id.list1);
        list.setAdapter(adapter);
    }

    public class SubArrayAdapter extends ArrayAdapter<Computer> {
        public SubArrayAdapter() {
            super(MainActivity.this,R.layout.single_layout,comps);
        }

        @Override
        public View getView(int position,View recycledView,ViewGroup parent) {
            View layoutView = recycledView;

            if (layoutView == null) {
                layoutView = getLayoutInflater().inflate(R.layout.single_layout, parent, false);
            }

            //Get the current Entry
            Computer currentComputer = comps.get(position);


            //Get the views
            TextView model = (TextView) layoutView.findViewById(R.id.model);
            TextView OS = (TextView) layoutView.findViewById(R.id.Os);

            //Set the text
            model.setText(currentComputer.getModel());
            OS.setText(currentComputer.getOS());


            return layoutView;
        }
    }


}
