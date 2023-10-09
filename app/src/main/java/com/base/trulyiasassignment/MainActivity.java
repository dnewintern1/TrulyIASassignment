package com.base.trulyiasassignment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.base.trulyiasassignment.adapter.itemAdapter;
import com.base.trulyiasassignment.listener.ChapterClickedListener;
import com.base.trulyiasassignment.menuoptions.menuOptionSeven;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerview;

    String[] categorie ={"Chapter 1: Food: Where Does It Come From?" , "Chapter 2: Components Of Food",
            "Chapter 3:  Fibre to Fabric ", "Chapter 4: Sorting Material into Groups",
           "Chapter 6: Separation of Substance"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);



        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setAdapter(new itemAdapter(MainActivity.this,categorie,onChapterClicked));
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, menuOptionSeven.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private final ChapterClickedListener onChapterClicked = new ChapterClickedListener() {
        @Override
        public void onChapterClicked(String id) {

            // Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this,ChapterDetailsActivity.class)
                    .putExtra("id",id));


        }
    };


}