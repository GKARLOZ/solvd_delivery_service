package com.solvd.deliveryservice.app;

import java.util.List;

public class Route {

    private List<PackageDoP> packages;
    private String id;
    public Route() {}

    public Route(List<PackageDoP> packages, String id) {
        this.packages = packages;
        this.id = id;
    }

    public List<PackageDoP> getPackages() {return packages;}

    public void setPackages(List<PackageDoP> packages) { this.packages = packages;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
