package com.example.firebasecontactapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebasecontactapp.databinding.ItemCardLayoutBinding;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private Context context;
    private ArrayList<User> userArrayList;

    public UserAdapter(Context context, ArrayList<User> userArrayList) {
        this.context = context;
        this.userArrayList = userArrayList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{

        private ItemCardLayoutBinding itemCardLayoutBinding;


        public UserViewHolder(ItemCardLayoutBinding itemCardLayoutBinding) {
            super(itemCardLayoutBinding.getRoot());
            this.itemCardLayoutBinding = itemCardLayoutBinding;

            // Handling click events
            itemCardLayoutBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                }
            });
        }
    }
}
