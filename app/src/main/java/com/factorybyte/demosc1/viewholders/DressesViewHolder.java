package com.factorybyte.demosc1.viewholders;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.activities.PaymentActivity;

public class DressesViewHolder extends RecyclerView.ViewHolder {


    private ImageView dressImage;
    private TextView dressName, dressDescription;
    private ImageButton dressCall, dressPay;



    public DressesViewHolder(View itemView) {
        super(itemView);

        this.dressImage = itemView.findViewById(R.id.photo);
        this.dressName = itemView.findViewById(R.id.title);
        this.dressDescription = itemView.findViewById(R.id.description);
        this.dressCall = itemView.findViewById(R.id.llamar);
        this.dressPay = itemView.findViewById(R.id.pagar);

    }


    public void setDressImage(String image) {
        RequestOptions options = new RequestOptions();
        Glide
                .with(itemView)
                .load(image)
                .apply(options.fitCenter().centerCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(this.dressImage);
    }

    public void setDressName(String dressName) {
        this.dressName.setText(dressName);
    }

    public void setDressDescription(String dressDescription) {
        this.dressDescription.setText(dressDescription);
    }

    public void setDressCall(final int telephone) {
        this.dressCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ActivityCompat.checkSelfPermission(itemView.getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
                    Intent intent = new Intent(Intent.ACTION_CALL,  Uri.parse("tel:" + String.valueOf(telephone)));
                    itemView.getContext().startActivity(intent);
                }else{
                    ActivityCompat.requestPermissions((Activity) itemView.getContext(), new String[]{Manifest.permission.CALL_PHONE}, 1);
                }
            }
        });
    }

    public void setDressPay(final String image, final String name, final int price, final String description) {
        this.dressPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent =  new Intent(itemView.getContext(), PaymentActivity.class);
                intent.putExtra("image", image);
                intent.putExtra("product_title", name);
                intent.putExtra("precio", String.valueOf(price));
                intent.putExtra("descripcion", description);
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
