package com.kanchamkrit.librarymanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

//        Fetching the textViews from Xml(frontend)
        TextView newBookReqTV = findViewById(R.id.TV_new_book_req);
        TextView viewStatusTV = findViewById(R.id.TV_view_status);
        TextView viewReportsTV = findViewById(R.id.TV_view_reports);
        TextView reportProblemTV = findViewById(R.id.TV_report_problem);


//        underline TextsViews
        newBookReqTV.setPaintFlags(newBookReqTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        viewStatusTV.setPaintFlags(viewStatusTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        viewReportsTV.setPaintFlags(viewReportsTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        reportProblemTV.setPaintFlags(reportProblemTV.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


//        setting On Click Listener on viewReports TextView to go to viewReports Screen
        viewReportsTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, ViewReportsScreen.class));
            }
        });


    }
}