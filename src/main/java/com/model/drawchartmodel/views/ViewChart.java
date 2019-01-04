package com.model.drawchartmodel.views;

import com.model.drawchartmodel.models.Coordinat;

import java.util.Set;

public interface ViewChart {
    void addCoordinat (Coordinat coordinat);
    void addCoordinat (Set<Coordinat> coordinat);
    void showChart ();
    void refreshChart();
    void clearDataChart ();
}
