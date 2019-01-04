package com.model.drawchartmodel.controllers;

import com.model.drawchartmodel.models.ModelChart;
import com.model.drawchartmodel.views.ViewChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerChart {

    @Autowired
    private ModelChart modelChart;

    @Autowired
    private ViewChart viewChart;

    @Autowired
    private IScaleChartOfX scale;


    public void showChart() {
        viewChart.addCoordinat(modelChart.getCoordinat(scale.getXStart(), scale.getXFinish()));
        viewChart.showChart();
        viewChart.clearDataChart();
    }

    public ModelChart getModelChart() {
        return modelChart;
    }

    public void setModelChart(ModelChart modelChart) {
        this.modelChart = modelChart;
    }

    public ViewChart getViewChart() {
        return viewChart;
    }

    public void setViewChart(ViewChart viewChart) {
        this.viewChart = viewChart;
    }

    public IScaleChartOfX getScale() {
        return scale;
    }

    public void setScale(IScaleChartOfX scale) {
        this.scale = scale;
    }
}
