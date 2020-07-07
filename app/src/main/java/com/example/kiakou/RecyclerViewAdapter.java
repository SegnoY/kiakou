package com.example.kiakou;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<RecyclerViewModele> mData ;


    public RecyclerViewAdapter(Context mContext, List<RecyclerViewModele> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.fragment_accueil_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.prix.setText(mData.get(position).getPrix());
        holder.description.setText(mData.get(position).getDescription());
        Picasso.with(mContext).load(mData.get(position).getUrl()).into(holder.article);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,ArticleActivity.class);

                // passing data to the book activity
                intent.putExtra("Prix",mData.get(position).getPrix());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Url",mData.get(position).getUrl());
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView prix;
        TextView description;
        ImageView article;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);
            prix = (TextView) itemView.findViewById(R.id.prix) ;
            description = (TextView) itemView.findViewById(R.id.desc) ;
            article = (ImageView) itemView.findViewById(R.id.a);
            cardView = (CardView) itemView.findViewById(R.id.cardView);


        }
    }

}
