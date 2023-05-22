package com.solvd.deliveryservice.app;

public enum PackageWeight {

    NORMAL(0.01, 70.0 ),
    HEAVY(70.0, 150.0),
    VERY_HEAVY(150.0, 250.0 );

    private final double minLB;
    private final double maxLB;

    PackageWeight(double minLB, double maxLB){
        this.minLB = minLB;
        this.maxLB = maxLB;

    };

    public double getMinLB() {
        return minLB;
    }

    public double getMaxLB() {
        return maxLB;
    }
}
