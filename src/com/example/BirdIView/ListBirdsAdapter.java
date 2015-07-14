package com.example.BirdIView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.example.BirdIView.Bird;
import com.example.BirdIView.R;

import java.util.List;

/**
 * Created by Bhavani on 09-07-2015.
 */
public class ListBirdsAdapter extends BaseAdapter {

    public static final String TAG = "ListBirdsAdapter";

    private List<Bird> mItems;
    private LayoutInflater mInflater;

    public ListBirdsAdapter(Context context,List<Bird> listBirds){
        this.setItems(listBirds);
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount(){
        return (getItems() != null && !getItems().isEmpty()) ? getItems().size() : 0 ;
    }

    @Override
    public Bird getItem(int position) {
        return (getItems() != null && !getItems().isEmpty()) ? getItems().get(position) : null;
    }

    @Override
    public long getItemId(int position) {
       // return (getItems() != null && !getItems().isEmpty()) ? getItems().get(position).getId() : position;
        return 12;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;
        if(v == null){
           // v = mInflater.inflate(R.layout.list_prob_bird,parent,false);
            holder = new ViewHolder();
            //holder.txtBirdName = (TextView) v.findViewById(R.id.txt_NameBird);
           // holder.picBird = (ImageView) v.findViewById(R.id.img_Bird);

            v.setTag(holder);
        }
        else{
            holder = (ViewHolder) v.getTag();
        }

        Bird currentItem = getItem(position);
        if(currentItem != null){
            holder.txtBirdName.setText(currentItem.getName());
            holder.picBird.getResources().getIdentifier("BirdIView:drawable/hab_ground", null, null);//TODO: make this dynamic
                                                                                                     //TODO: by "..drawable/"+currentItem.getName().toString()
            //TODO: ADD CALL AND RESOURCE
        }
        return v;
    }

    public List<Bird> getItems(){
        return mItems;
    }

    public void setItems(List<Bird> mItems){
        this.mItems = mItems;
    }

    class ViewHolder{
        TextView txtBirdName;
        ImageView picBird;
        Button infoBird;
        ImageButton callBird;
    }
}
