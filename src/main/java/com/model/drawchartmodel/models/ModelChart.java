package com.model.drawchartmodel.models;

import java.util.Set;

public interface ModelChart {
    Coordinat getCoordinat (float t);
    Set<Coordinat> getCoordinat (float tStart, float tFinish);
}
