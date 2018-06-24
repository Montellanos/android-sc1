package com.factorybyte.demosc1.fragments;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.factorybyte.demosc1.R;
import com.factorybyte.demosc1.adapters.UserRecyclerAdapter;
import com.factorybyte.demosc1.models.User;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

/**
 * A simple {@link Fragment} subclass.
 */
public class OptionAFragment extends Fragment {


    private View mRootView;
    private RecyclerView mUserRecyclerView;
    private FirebaseFirestore mUserRef = FirebaseFirestore.getInstance();
    FirestoreRecyclerAdapter mUserAdapter;



    public OptionAFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_option_a, container, false);

        initializeView();
        return mRootView;
    }

    private void initializeView() {
        mUserRecyclerView = mRootView.findViewById(R.id.users_recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mUserRecyclerView.setHasFixedSize(true);
        mUserRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mUserRecyclerView.setLayoutManager(mLayoutManager);
        setupView();

    }

    private void setupView() {


        Query query = mUserRef
                .collection("users")
                .orderBy("name", Query.Direction.ASCENDING);

        FirestoreRecyclerOptions<User> options = new FirestoreRecyclerOptions.Builder<User>()
                .setQuery(query, User.class)
                .build();

        mUserAdapter = new UserRecyclerAdapter(options);

        mUserAdapter.notifyDataSetChanged();
        mUserRecyclerView.setAdapter(mUserAdapter);


    }


    @Override
    public void onStart() {
        super.onStart();
        mUserAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        mUserAdapter.stopListening();
    }






}
