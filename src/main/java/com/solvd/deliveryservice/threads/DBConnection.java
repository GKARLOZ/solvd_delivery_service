package com.solvd.deliveryservice.threads;

public class DBConnection{

    private String url;
    private String username;
    private String password;
    public DBConnection() {

        url = "jdbc:mysql://localhost:3306/mydatabase";
        username = "myuser";
        password = "mypassword";

    }
    public DBConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void connect( ){
        //LOGGER.info("Connecting to the database...");
        //LOGGER.info("Connected!");

    }

    public void disconnect() {
        //LOGGER.info("Disconnecting from the database...");
        //LOGGER.info("Disconnected!");
    }

}









