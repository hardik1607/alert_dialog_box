package com.example.alert_dialog_box;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    AlertDialog simplee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builder=new AlertDialog.Builder(this);
        builder.setTitle("");
        simplee = builder.create();

    }

    public void corners(View view) {
        View view1= LayoutInflater.from(this).inflate(R.layout.corner_dialog,null);
        builder.setView(view1);

        Button corner=view1.findViewById(R.id.corner);
        corner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Corner Dialog", Toast.LENGTH_SHORT).show();
            }
        });

        simplee.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        simplee.setView(view1);
        simplee.show();

    }

    public void check_box(View view) {
        View view1= LayoutInflater.from(this).inflate(R.layout.check_box_dialog,null);
        builder.setView(view1);

        CheckBox ch1,ch2,ch3,ch4;

        ch1=view1.findViewById(R.id.ch1);
        ch2=view1.findViewById(R.id.ch2);
        ch3=view1.findViewById(R.id.ch3);
        ch4=view1.findViewById(R.id.ch4);

        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "gallery", Toast.LENGTH_SHORT).show();
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "camera", Toast.LENGTH_SHORT).show();
            }
        });

        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "photos", Toast.LENGTH_SHORT).show();
            }
        });

        ch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "other", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();

    }

    public void radio_button(View view) {
        View view1=LayoutInflater.from(this).inflate(R.layout.redio_button_dialog,null);
        builder.setView(view1);

        RadioButton r1,r2,r3,r4;

        r1=view1.findViewById(R.id.r1);
        r2=view1.findViewById(R.id.r2);
        r3=view1.findViewById(R.id.r3);
        r4=view1.findViewById(R.id.r4);

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "gallery", Toast.LENGTH_SHORT).show();
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "camera", Toast.LENGTH_SHORT).show();
            }
        });

        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "photos", Toast.LENGTH_SHORT).show();
            }
        });

        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "other", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void simple(View view) {
        builder.setTitle("title");
        builder.setMessage("body");

        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "yes", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "no", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "cancel", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }
}