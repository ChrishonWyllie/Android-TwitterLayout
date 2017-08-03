package com.chrishonwyllie.twitterlayout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Chrishon on 8/3/17.
 */


// This class is what is used to populate the RecyclerView
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // Data that will be used
    private List<String> listData;

    // Used to inflate the custom recyclerview_list_item
    private LayoutInflater inflater;

    // Optional
    private Context mContext;


    // Instantiate objects
    public RecyclerViewAdapter(List<String> listData, Context c) {
        this.mContext = c;
        this.inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Create a view for each recycler view item. Used to display objects
        // In Twitter, this "recycler_view_item" would probably display a variety of widgets such as
        // ImageView (Profile Image), TextView (Text for Twitter post), username, time since post, etc.....
        View view = inflater.inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        // Essentially used to customize each RecyclerView item
        // set profile image, twitter post text, etc...
        String textFromList = listData.get(position);

        holder.textView.setText(textFromList);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    // This is a custom RecyclerView.ViewHolder object. It could have been named something like "TwitterPostViewHolder"
    // It is used to gather references to all widgets in your custom recyclerview_list_item
    // Must conform to ViewHolder object
    class ViewHolder extends RecyclerView.ViewHolder {


        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.textview);

        }
    }
}