package com.solvd.deliveryservice.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DBConnectionPool {
        private final int POOL_SIZE = 5;
        private BlockingQueue<DBConnection> connections;
        private static DBConnectionPool instance;
        private final static Logger LOGGER = LogManager.getLogger(DBConnectionPool.class);

        private DBConnectionPool() { }

        public static DBConnectionPool getInstance(){
            if (instance == null) {
                synchronized (DBConnectionPool.class) {
                    if (instance == null) {
                        instance = new DBConnectionPool();
                    }
                }
            }
            return instance;
        }


        private void initializePool() {
            for (int i = 0; i < POOL_SIZE; i++) {
                DBConnection connection = new DBConnection();
                connection.connect();
                connections.offer(connection);
            }
        }

        public synchronized DBConnection getConnection(){

            try{
                if(connections == null) {
                    connections = new ArrayBlockingQueue<>(POOL_SIZE);
                    initializePool();
                    LOGGER.info(connections.size() + " available connections in the pool");
                }

                return  connections.take();

            }catch (InterruptedException e ) {

                LOGGER.error(e.getMessage());
                return null;}

        }

        public void releaseConnection(DBConnection connection){

            try{
                connections.put(connection);


            }catch (InterruptedException e ) {

                LOGGER.error(e.getMessage());}

        }

        public int connectionsAvailable() {

            return connections.size();
        }



    }




