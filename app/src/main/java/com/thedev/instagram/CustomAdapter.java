package com.thedev.instagram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private Context context;
    private List<RetroPosts> list;

    public CustomAdapter(List<RetroPosts> list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_row,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        RetroPosts retroPosts = list.get(i);
        customViewHolder.setid(String.valueOf(retroPosts.getId()));
        customViewHolder.setBody(retroPosts.getBody());
        customViewHolder.setTitle(retroPosts.getTitle());
        customViewHolder.setUserid(String.valueOf(retroPosts.getUserid()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        private TextView mTitle, mBody, mUserid, mId;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mBody = itemView.findViewById(R.id.body);
            mUserid = itemView.findViewById(R.id.userid);
            mId = itemView.findViewById(R.id.id);
        }

        public void setUserid(String userid){
            mUserid.setText(userid);
        }

        public void setid(String id){
            mId.setText(id);
        }

        public void setTitle(String title){
            mTitle.setText(title);
        }

        public void setBody(String body){
            mBody.setText(body);
        }

    }
}
