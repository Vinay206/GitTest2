package com.example.vinaykumar.gittest;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onCalculate(View v) {
        EditText e1000 = (EditText) findViewById(R.id.editText1000);
        EditText e500 = (EditText) findViewById(R.id.editText500);
        EditText e100 = (EditText) findViewById(R.id.editText100);
        EditText e50 = (EditText) findViewById(R.id.editText50);
        EditText e20 = (EditText) findViewById(R.id.editText20);
        EditText e10 = (EditText) findViewById(R.id.editText10);

        TextView t1000 = (TextView) findViewById(R.id.textView1000);
        TextView t500 = (TextView) findViewById(R.id.textView500);
        TextView t100 = (TextView) findViewById(R.id.textView100);
        TextView t50 = (TextView) findViewById(R.id.textView50);
        TextView t20 = (TextView) findViewById(R.id.textView20);
        TextView t10 = (TextView) findViewById(R.id.textView10);

        TextView tT = (TextView) findViewById(R.id.textViewT);




        int num1000 = Integer.parseInt(e1000.getText().toString()) * 1000;
        t1000.setText(Integer.toString(num1000));


        int num500 = Integer.parseInt(e500.getText().toString()) * 500;
        t500.setText(Integer.toString(num500));
        int num100 = Integer.parseInt(e100.getText().toString()) * 100;
        t100.setText(Integer.toString(num100));
        int num50 = Integer.parseInt(e50.getText().toString()) * 50;
        t50.setText(Integer.toString(num50));
        int num20 = Integer.parseInt(e20.getText().toString()) * 20;
        t20.setText(Integer.toString(num20));
        int num10 = Integer.parseInt(e10.getText().toString()) * 10;
        t10.setText(Integer.toString(num10));

        int numT = num10 + num20 + num50 + num100 + num500 + num1000;
        tT.setText(Integer.toString(numT));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.vinaykumar.gittest/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.vinaykumar.gittest/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
