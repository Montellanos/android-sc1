package com.factorybyte.demosc1.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.adapters.DressRecyclerAdapter;
import com.factorybyte.demosc1.models.Dress;
import com.factorybyte.demosc1.viewholders.DressesViewHolder;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

/**
 * A simple {@link Fragment} subclass.
 */
public class OptionBFragment extends Fragment {


    private View mrootView;
    private RecyclerView dresses_recyclerView;
    private FirestoreRecyclerAdapter<Dress, DressesViewHolder> adapter;
    private FirebaseFirestore mDressesRef = FirebaseFirestore.getInstance();

    public OptionBFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mrootView = inflater.inflate(R.layout.fragment_option_b, container, false);

        dresses_recyclerView = mrootView.findViewById(R.id.dresses_recyclerView);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        dresses_recyclerView.setHasFixedSize(true);
        dresses_recyclerView.setItemAnimator(new DefaultItemAnimator());
        dresses_recyclerView.setLayoutManager(mLayoutManager);


        Query query = mDressesRef.collection("dresses")
                .orderBy("name", Query.Direction.ASCENDING);

        FirestoreRecyclerOptions<Dress> options =
                new FirestoreRecyclerOptions.Builder<Dress>()
                .setQuery(query, Dress.class)
                .build();

        adapter = new DressRecyclerAdapter(options);

        adapter.notifyDataSetChanged();

        dresses_recyclerView.setAdapter(adapter);

        return mrootView;
    }


    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }

}
