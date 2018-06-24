package com.factorybyte.demosc1.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.factorybyte.demosc1.R;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();


        String image = intent.getStringExtra("image");

        String product_title = intent.getStringExtra("product_title");

        String precio =  intent.getStringExtra("precio");

        String description = intent.getStringExtra("descripcion");


        getSupportActionBar().setTitle(product_title);


        TextView price = findViewById(R.id.precio_texto);


        price.setText(precio  + " Bs.-");


        TextView descripcion_texto = findViewById(R.id.description_texto);

        descripcion_texto.setText(description);


        ImageView imagen_producto = findViewById(R.id.image_producto);


        RequestOptions options = new RequestOptions();


        Glide
                .with(this)
                .load(image)
                .apply(options.fitCenter().centerCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(imagen_producto);



    }
}
