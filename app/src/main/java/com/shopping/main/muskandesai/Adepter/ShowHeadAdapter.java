package com.shopping.main.muskandesai.Adepter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.shopping.main.muskandesai.R;

import java.util.ArrayList;


public class ShowHeadAdapter extends RecyclerView.Adapter<ShowHeadAdapter.ViewHolder> {

    private ArrayList<String> sub_head = new ArrayList<>();
    private Context mContext;

    public ShowHeadAdapter(Context mContext, ArrayList<String> head) {

        this.sub_head =head;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_head_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

      holder.image_name.setText(sub_head.get(position));



    }

    @Override
    public int getItemCount() {
        return sub_head.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout go_nxt;
        private TextView desc;
        private TextView image_name;


        public ViewHolder(View itemView) {
            super(itemView);

            image_name = itemView.findViewById(R.id.txt);

        }
    }
}


