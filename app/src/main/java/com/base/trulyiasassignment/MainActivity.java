package com.base.trulyiasassignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.Toolbar;
import android.widget.VideoView;

import com.base.trulyiasassignment.menuoptions.menuOptionSeven;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

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
        recyclerview.setAdapter(new itemAdapter(categorie));
        recyclerview.setLayoutManager(new LinearLayoutManager(this));



    }


}