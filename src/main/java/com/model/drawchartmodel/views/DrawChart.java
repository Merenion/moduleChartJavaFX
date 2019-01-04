package com.model.drawchartmodel.views;


import com.model.drawchartmodel.models.Coordinat;


import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrawChart {

    public void drawChart (List<Coordinat> coord) {
        Stage stage1 = new Stage();
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("a1");
        yAxis.setLabel("a0");
        //creating the chart
        final ScatterChart<Number,Number> сhart =
                new ScatterChart<>(xAxis,yAxis);

        сhart.setTitle("Зона устойчивости");

        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Кривая параметров АС");

        for (Coordinat coordinat: coord)
            series.getData().add(new XYChart.Data(coordinat.getX(),coordinat.getY()));

        сhart.getData().add(series);
        Scene scene  = new Scene(сhart,800,600);

        stage1.setScene(scene);
        stage1.show();
    }
}
