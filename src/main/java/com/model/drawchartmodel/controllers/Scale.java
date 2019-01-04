package com.model.drawchartmodel.controllers;

import org.springframework.stereotype.Component;

@Component
public class Scale implements IScaleChartOfX{

    private float tStart;
    private float tFinish;

    public float getXStart() {
        return tStart;
    }

    public void setXStart(float tStart) {
        this.tStart = tStart;
    }

    public float getXFinish() {
        return tFinish;
    }

    public void setXFinish(float tFinish) {
        this.tFinish = tFinish;
    }
}
