package com.example.statistiques;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.BarChart;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    BarChart barChart;
    TextView tvR, tvPython, tvCPP, tvJava;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = findViewById(R.id.bar_chart);

        ArrayList<BarEntry> barEntries = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            double value = 0;
            if (i == 1) {
                value = 3.5;
            }
            ;
            if (i == 2) {
                value = 3.3;
            }
            ;
            if (i == 3) {
                value = 3.3;
            }
            ;
            if (i == 4) {
                value = 3.5;
            }
            ;
            if (i == 5) {
                value = 3.3;
            }
            ;
            if (i == 6) {
                value = 3.5;
            }
            ;
            if (i == 7) {
                value = 3.5;
            }
            ;
            if (i == 8) {
                value = 3.6;
            }
            ;
            if (i == 9) {
                value = 3.6;
            }
            ;

            BarEntry barEntry = new BarEntry(i, (float) value);


            barEntries.add(barEntry);



        }
        BarDataSet barDataSet = new BarDataSet(barEntries, "Taux");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setDrawValues(false);
        barChart.setData(new BarData(barDataSet));
        barChart.animateY(3000);


       tvR = findViewById(R.id.tvR);
        tvPython = findViewById(R.id.tvPython);
        tvCPP = findViewById(R.id.tvCPP);
        tvJava = findViewById(R.id.tvJava);
        pieChart = findViewById(R.id.piechart);
        setData2();



    }

        private void setData2()
        {

            tvR.setText(Double.toString(77.99));
            tvPython.setText(Double.toString(77.78));
            tvCPP.setText(Double.toString(77.57));
            tvJava.setText(Double.toString(77.4));

            pieChart.addPieSlice(
                    new PieModel(
                            "2017",
                            (float) Double.parseDouble(tvR.getText().toString()),
                            Color.parseColor("#FFA726")));
            pieChart.addPieSlice(
                    new PieModel(
                            "2016",
                            (float) Double.parseDouble(tvPython.getText().toString()),
                            Color.parseColor("#66BB6A")));
            pieChart.addPieSlice(
                    new PieModel(
                            "2015",
                            (float) Double.parseDouble(tvCPP.getText().toString()),
                            Color.parseColor("#EF5350")));
            pieChart.addPieSlice(
                    new PieModel(
                            "2014",
                            (float) Double.parseDouble(tvJava.getText().toString()),
                            Color.parseColor("#29B6F6")));

            pieChart.startAnimation();

            getSupportActionBar().hide();





    }
}