package com.example.restaurantmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class landmarksAdapter extends RecyclerView.Adapter<landmarksAdapter.landmarksViewHolder> {

    private final ArrayList<landmarksModel> landmarksList;

    private final LayoutInflater layoutInflater;

    public landmarksAdapter(Context context, ArrayList<landmarksModel> landmarksList){
        layoutInflater=LayoutInflater.from(context);
        this.landmarksList=landmarksList;
    }

    @NonNull
    @Override
    public landmarksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.landmarks_row,parent,false);
        return new landmarksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull landmarksViewHolder holder, int position) {
        landmarksModel landmarksModel=landmarksList.get(position);
        holder.titleTextView.setText(landmarksModel.getLandmarkTitle());
        holder.detailTextView.setText(landmarksModel.getLandmarkInfo());
        holder.landImageView.setImageResource(landmarksModel.getLandmarkImage());
    }

    @Override
    public int getItemCount() {
        return landmarksList.size();
    }


    static class landmarksViewHolder extends RecyclerView.ViewHolder{

        private final TextView titleTextView;
        private final TextView detailTextView;
        private final ImageView landImageView;

        public landmarksViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView=itemView.findViewById(R.id.landmarksTitle);
            detailTextView=itemView.findViewById(R.id.landmarksDetail);
            landImageView=itemView.findViewById(R.id.landmarksImage);
        }

        public TextView getTitleTextView(){
            return titleTextView;
        }

        public TextView getDetailTextView(){
            return detailTextView;
        }

        public ImageView getLandImageView(){
            return landImageView;
        }

    }

}
