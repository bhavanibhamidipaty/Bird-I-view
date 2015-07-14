/** Description of BirdAdapter Class
 *
 * This class is resposible for creating individual list items of the search results
 * screen and displaying them in priority order as given by the called class (Storing input)
 */


package com.example.BirdIView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhavani on 12-07-2015.
 */
public class BirdAdapter extends ArrayAdapter implements View.OnClickListener{

    private List list = new ArrayList();
    MediaPlayer mp;

    public BirdAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public void add(Bird obj){
        list.add(obj);
        super.add(obj);
    }

    @Override
    public void onClick(View view) {
    }

    static class ImgHolder{
        ImageView IMG;
        TextView NAME;
        Button Call;
        Button finalize;
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row = convertView;
        ImgHolder holder;
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_prob_bird,parent,false);
            holder = new ImgHolder();
            holder.IMG = (ImageView)row.findViewById(R.id.list_img_Bird);
            holder.Call = (Button)row.findViewById(R.id.list_BtnCall);
            holder.NAME = (TextView)row.findViewById(R.id.list_txt_NameBird);
            holder.finalize = (Button) row.findViewById(R.id.BtnInfo);
            row.setTag(holder);
        }

        else
        {
            holder = (ImgHolder)row.getTag();
        }

        Bird BC = (Bird)getItem(position);
        holder.IMG.setImageResource(BC.getPic());
        holder.NAME.setText(BC.getName());//BC.getName()
        int call_id = BC.getCall();
        //Uri uri =
        //mp = MediaPlayer.create(this, call_id);//Uri.parse("android.resource://com.example.BirdIView/"+R.raw.blackdrongo)
        holder.Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mp.start();
                Toast.makeText(view.getContext(),call_id,Toast.LENGTH_SHORT).show();
            }
        });
        holder.finalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO set intent to go to user
                //TODO set date on report
                //TODO set extra intent
                //mp.start();
            }
        });

        return row;
    }
}
