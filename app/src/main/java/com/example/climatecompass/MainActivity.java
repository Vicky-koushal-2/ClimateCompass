package com.example.climatecompass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout honeRl;
    private ProgressBar loadingPB;
    private TextView cityNameTV,tempratureTV,conditionTV;
    private RecyclerView weatherRV;
    private TextInputEditText cityEdt;
    private ImageView backTV,iconTv,searchTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        honeRl = findViewById(R.id.idRLHome);
        loadingPB = findViewById(R.id.idPBLoading);
        cityNameTV = findViewById(R.id.idTvCityName);
        tempratureTV = findViewById(R.id.idTVTemperature);
        conditionTV= findViewById(R.id.idTVCondtion);
        weatherRV = findViewById(R.id.idRvWeather);
        cityEdt = findViewById(R.id.edtCity);
        backTV = findViewById(R.id.TvBack);
        iconTv = findViewById(R.id.idTVIcon);
        searchTV = findViewById(R.id.idTVSearch);

    }
}