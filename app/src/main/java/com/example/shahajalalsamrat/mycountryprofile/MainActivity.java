package com.example.shahajalalsamrat.mycountryprofile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button bangladeshbutton,indiabutton,pakistanbutton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       bangladeshbutton=(Button)findViewById(R.id.bangladeshbuttonid);
       indiabutton=(Button) findViewById(R.id.indiabuttonid);
       pakistanbutton=(Button) findViewById(R.id.pakistanbuttonid);

       bangladeshbutton.setOnClickListener(this);
       indiabutton.setOnClickListener(this);
       pakistanbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.bangladeshbuttonid){
           intent=new Intent(MainActivity.this,CountryDetails.class);
           intent.putExtra("name","bangladesh");
           startActivity(intent);
        }

        if(v.getId()==R.id.indiabuttonid){
           intent=new Intent(MainActivity.this,CountryDetails.class);
           intent.putExtra("name","india");
           startActivity(intent);
        }

        if(v.getId()==R.id.pakistanbuttonid){
           intent=new Intent(MainActivity.this,CountryDetails.class);
           intent.putExtra("name","pakistan");
           startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(MainActivity.this);

        alertdialogbuilder.setCancelable(false);
        alertdialogbuilder.setIcon(R.drawable.calculatorpic);
        alertdialogbuilder.setTitle("Exit");
        alertdialogbuilder.setMessage("Do you want to Exit ?");
        alertdialogbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertdialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertdialogbuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertdialogbuilder.create();
        alertdialogbuilder.show();

    }
}
