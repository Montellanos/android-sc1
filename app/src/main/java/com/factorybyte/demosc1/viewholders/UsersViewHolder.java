package com.factorybyte.demosc1.viewholders;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.activities.DetailActivity;

public class UsersViewHolder extends RecyclerView.ViewHolder {


    private ImageView userPhoto;
    private TextView userName, userSkills, userLocation;
    private Button userButton;



    public UsersViewHolder(@NonNull View itemView) {
        super(itemView);
        this.userPhoto = itemView.findViewById(R.id.miimage);
        this.userName = itemView.findViewById(R.id.user_name);
        this.userSkills= itemView.findViewById(R.id.user_skills);
        this.userLocation = itemView.findViewById(R.id.user_location);
        this.userButton = itemView.findViewById(R.id.vermas);
    }


    public void setUserPhoto(String url) {
        RequestOptions options = new RequestOptions();
        Glide
                .with(itemView)
                .load(url)
                .apply(options.centerCrop().fitCenter().circleCrop().diskCacheStrategy(DiskCacheStrategy.AUTOMATIC))
                .thumbnail(0.1f)
                .into(this.userPhoto);
    }

    public void setUserName(String userName) {
        this.userName.setText(userName);
    }

    public void setUserSkills(String userSkills) {
        this.userSkills.setText(userSkills);
    }

    public void setUserLocation(String userLocation) {
        this.userLocation.setText(userLocation);
    }

    public void setUserButton(final String name) {

        this.userButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(itemView.getContext(), DetailActivity.class);
                intent.putExtra("name", name);
                itemView.getContext().startActivity(intent);
            }
        });
    }
}
