package com.example.mobilejavatraining;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        SeekBar java, mysql, php, android, html, database, api, tagalog, english;

        CheckBox checkBox = findViewById(R.id.checkbox);
        LinearLayout linearLayout = findViewById(R.id.linearLayout1);
        java = findViewById(R.id.java);
        mysql = findViewById(R.id.mysql);
        php = findViewById(R.id.php);
        android = findViewById(R.id.android);
        html = findViewById(R.id.html);
        database = findViewById(R.id.database);
        api = findViewById(R.id.api);
        tagalog = findViewById(R.id.tagalog);
        english = findViewById(R.id.english);

        java.setEnabled(false);
        mysql.setEnabled(false);
        php.setEnabled(false);
        android.setEnabled(false);
        html.setEnabled(false);
        database.setEnabled(false);
        api.setEnabled(false);
        tagalog.setEnabled(false);
        english.setEnabled(false);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    linearLayout.setVisibility(View.GONE);
                }else{
                    linearLayout.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}