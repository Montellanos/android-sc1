package com.factorybyte.demosc1.adapters;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.models.User;
import com.factorybyte.demosc1.viewholders.UsersViewHolder;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class UserRecyclerAdapter extends FirestoreRecyclerAdapter<User, UsersViewHolder> {


    public UserRecyclerAdapter(@NonNull FirestoreRecyclerOptions<User> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull UsersViewHolder holder, int position, @NonNull User model) {
        holder.setUserName(model.getName());
        holder.setUserSkills(model.getSkills());
        holder.setUserPhoto(model.getImage());
        holder.setUserButton(model.getName());
        holder.setUserLocation(model.getLocation());
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.desing_list, parent, false);
        return new UsersViewHolder(view);
    }

    @Override
    public void onDataChanged() {

    }

    @Override
    public void onError(@NonNull FirebaseFirestoreException e) {

        Log.d("error", "onError: " + e.getMessage());
    }
}
