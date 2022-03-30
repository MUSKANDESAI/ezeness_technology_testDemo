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


public class ShowSubCategoryAdapter extends RecyclerView.Adapter<ShowSubCategoryAdapter.ViewHolder> {

    private final ArrayList<Integer> sub_muser_logo;
    private ArrayList<Integer> show_user_logo = new ArrayList<>();
    private ArrayList<String> sub_mname = new ArrayList<>();
    private Context mContext;
    private ImageView user_logo12;

    public ShowSubCategoryAdapter(Context mContext, ArrayList<String> show_mname, ArrayList<Integer> show_user_logo) {

        this.sub_mname =show_mname;
        this.sub_muser_logo = show_user_logo;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_category, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

      holder.rs.setText(sub_mname.get(position));

        holder.lin_img.setBackgroundResource(sub_muser_logo.get(position));




    }

    @Override
    public int getItemCount() {
        return sub_mname.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout lin_img;
        private TextView desc;
        private TextView rs;


        public ViewHolder(View itemView) {
            super(itemView);

            rs = itemView.findViewById(R.id.rs);
            lin_img = itemView.findViewById(R.id.lin_img);

        }
    }
}


