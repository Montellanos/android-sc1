package com.factorybyte.demosc1.adapters;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.models.Dress;
import com.factorybyte.demosc1.viewholders.DressesViewHolder;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class DressRecyclerAdapter extends FirestoreRecyclerAdapter<Dress, DressesViewHolder> {
    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public DressRecyclerAdapter(@NonNull FirestoreRecyclerOptions<Dress> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull DressesViewHolder holder, int position, @NonNull Dress model) {
        holder.setDressImage(model.getImage());
        holder.setDressName(model.getName());
        holder.setDressDescription(model.getDescription());
        holder.setDressCall(model.getTelephone());
        holder.setDressPay(model.getImage(), model.getName(), model.getPrice(), model.getDescription());
    }

    @NonNull
    @Override
    public DressesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.desing_card, parent, false);

        return new DressesViewHolder(view);
    }
}
