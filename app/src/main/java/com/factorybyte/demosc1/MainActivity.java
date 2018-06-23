package com.factorybyte.demosc1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView miimagen = findViewById(R.id.miimage);


        RequestOptions options = new RequestOptions();

        Glide
                .with(this)
                .load("https://images.pexels.com/photos/131699/pexels-photo-131699.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                .apply(options.centerCrop().fitCenter().circleCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(miimagen);





    }
}
