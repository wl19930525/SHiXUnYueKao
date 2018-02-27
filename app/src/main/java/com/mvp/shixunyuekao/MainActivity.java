package com.mvp.shixunyuekao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    private AMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mapView.onCreate(savedInstanceState);

        if(map==null){

            map = mapView.getMap();
        }

    }

    private void initView() {
        mapView = (MapView) findViewById(R.id.map);
    }
}
