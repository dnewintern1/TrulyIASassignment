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
import com.base.trulyiasassignment.menuoptions.menuOptionSeven;
import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor(getString(R.string.actionbarColor)));
        actionBar.setBackgroundDrawable(colorDrawable);

        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList1.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList1.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList1.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");


        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList2.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList2.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList2.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");


List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList3.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList3.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList3.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");

        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList4.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList4.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList4.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");


        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList5.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/i7w29DUI6y4\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList5.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z1jFXrOLHRA\" frameborder=\"0\" allowfullscreen></iframe>");
        nestedList5.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/gHbLqYMpW94\" frameborder=\"0\" allowfullscreen></iframe>");


        mList.add(new DataModel(nestedList1 , "Chapter 1: Food: Where Does It Come From? "));
        mList.add(new DataModel( nestedList2,"Chapter 2: Components Of Food"));
       mList.add(new DataModel( nestedList3, "Chapter 3:  Fibre to Fabric "));
        mList.add(new DataModel(nestedList4 ," Chapter 4: Sorting Material into Groups"));
        mList.add(new DataModel(nestedList5, "Chapter 5: Separation of "));




        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
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
            startActivity(new Intent(MainActivity2.this, menuOptionSeven.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    private final ChapterClickedListener onChapterClicked = new ChapterClickedListener() {
//        @Override
//        public void onChapterClicked(String id) {
//
//            // Toast.makeText(MainActivity.this, id, Toast.LENGTH_SHORT).show();
//            startActivity(new Intent(MainActivity2.this,ChapterDetailsActivity.class)
//                    .putExtra("id",id));
//
//
//        }
//    };
}