package com.example.shahajalalsamrat.mycountryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {

    ImageView image;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_details);
        image=findViewById(R.id.imageviewid);
        text=findViewById(R.id.textviewid);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String name=bundle.getString("name");
            showdetails(name);
        }
    }

    void showdetails(String s){
        if(s.equals("bangladesh")){
            image.setImageResource(R.drawable.bangladeshpicc);
            text.setText(R.string.bangladeshdetails);
        } if(s.equals("india")){
            image.setImageResource(R.drawable.indiapicc);
            text.setText(R.string.indiadetails);
        } if(s.equals("pakistan")){
            image.setImageResource(R.drawable.pakistanpicc);
            text.setText(R.string.pakistandetails);
        }
    }
}
