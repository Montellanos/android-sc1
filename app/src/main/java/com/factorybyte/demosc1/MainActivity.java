package com.factorybyte.demosc1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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



        /*


        ImageView miimagen = findViewById(R.id.miimage);

        ImageView photo = findViewById(R.id.photo);

        Button vermas = findViewById(R.id.vermas);

        final TextView description = findViewById(R.id.description);

        TextView vermas_texto = findViewById(R.id.vermas_texto);

        int param = 145;
        if (description.getText().length() > param){
            String aux = description.getText().toString();
            description.setText(aux.substring(0, param) + "...");

            vermas_texto.setVisibility(View.VISIBLE);


        }


        RequestOptions options = new RequestOptions();

        Glide
                .with(this)
                .load("https://images.pexels.com/photos/131699/pexels-photo-131699.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                .apply(options.centerCrop().fitCenter().circleCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(miimagen);



        Glide
                .with(this)
                .load("https://images.pexels.com/photos/985635/pexels-photo-985635.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940")
                .apply(options.fitCenter().centerCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(photo);



        vermas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("name", getResources().getString(R.string.name));
                startActivity(intent);

            }
        });


        ImageButton llamar = findViewById(R.id.llamar);



        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                    Intent intent = new Intent(Intent.ACTION_CALL,  Uri.parse("tel:" + "75116755"));
                    startActivity(intent);
                }else{
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                }


            }
        });





        ImageButton pagar = findViewById(R.id.pagar);


        pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(getApplicationContext(), PaymentActivity.class);
                intent.putExtra("image", "https://images.pexels.com/photos/985635/pexels-photo-985635.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
                intent.putExtra("product_title", getResources().getString(R.string.vestido));
                intent.putExtra("precio", "150");
                intent.putExtra("descripcion", description.getText().toString());
                startActivity(intent);
            }
        });


*/



    }
}
