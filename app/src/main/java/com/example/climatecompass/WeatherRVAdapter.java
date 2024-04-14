package com.example.climatecompass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.ViewHolder> {

    private Context context;
    private ArrayList<WeatherRVModel> weatherRVModelArrayList;
    @NonNull
    @Override
    public WeatherRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.weatheritem,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.ViewHolder holder, int position) {

        WeatherRVModel model = weatherRVModelArrayList.get(position);
        holder.tempratrTv.setText(model.getTemperature()+"c");
        Picasso.get().load("http:".concat(model.getIcon())).into(holder.condtionTv);
        holder.windTv.setText(model.getWindSpeed()+"km/h");
        SimpleDateFormat input = new SimpleDateFormat("yyyy-MM--dd hh:mm");
        SimpleDateFormat output = new SimpleDateFormat("hh:mm aa");

        try
        {
            Date t = input.parse(model.getTime());
            holder.timeTv.setText(output.format(t));
        } catch (ParseException e)
        {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return weatherRVModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView windTv, tempratrTv,timeTv;
        private ImageView condtionTv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // is line mai error aa skti hai dekh lena
            windTv = itemView.findViewById(R.id.idTVWind);
            tempratrTv = itemView.findViewById(R.id.idTVTemperature);
            timeTv = itemView.findViewById(R.id.idTVTime);
            condtionTv = itemView.findViewById(R.id.idTVCondtion);


        }
    }
}
