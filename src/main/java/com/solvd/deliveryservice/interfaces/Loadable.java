package com.solvd.deliveryservice.interfaces;

import com.solvd.deliveryservice.app.PackageDoP;

public interface Loadable {

    public void unloadPackages(PackageDoP[] packages);
    public void loadPackages(PackageDoP[] packages);




}
