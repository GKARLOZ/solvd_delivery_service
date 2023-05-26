package com.solvd.deliveryservice.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class DBConnectionPool {
        private int poolSize;
        private BlockingQueue<DBConnection> connections;
        private final static Logger LOGGER = LogManager.getLogger(DBConnectionPool.class);

        public DBConnectionPool(int poolSize) {
            this.poolSize = poolSize;
        }

        public DBConnectionPool() {
            poolSize = 2;
        }

        private void initializePool() {
            for (int i = 0; i < poolSize; i++) {
                DBConnection connection = new DBConnection();
                connection.connect();
                connections.offer(connection);
            }
        }

        public synchronized DBConnection getConnection(){

            try{
                //lazy initialize
                if(connections == null) {
                    connections = new ArrayBlockingQueue<>(poolSize);
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




