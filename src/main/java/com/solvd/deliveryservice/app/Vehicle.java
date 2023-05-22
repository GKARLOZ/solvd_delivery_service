package com.solvd.deliveryservice.app;

public abstract class Vehicle {

        private String vin;
        private String model;

        public Vehicle(){};

        public Vehicle(String make, String model) {
                this.vin = make;
                this.model = model;
        }

        public String getVin() {
                return vin;
        }

        public void setVin(String vin) {
                this.vin = vin;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }
}
