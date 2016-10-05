package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.ViewStubCompat;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mujtaba on 9/7/2016.
 */
public class WordAdapter extends ArrayAdapter<Word>
{
    int mColorID=0;
    public WordAdapter(Context context, ArrayList<Word> words, int resID)
    {
        super(context,0, words);
        mColorID = resID;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_view_1);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text_view_2);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorID);
        textContainer.setBackgroundColor(color);


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if(currentWord.getImageResourceID()!= 0)
        {
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
       // listItemView.setBackgroundColor(currentWord.getcolorID());
        else
        {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
