DROP DATABASE IF EXISTS transport_db;

CREATE DATABASE transport_db DEFAULT CHARACTER SET utf8;

CREATE TABLE routes (route_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20) NOT NULL);

CREATE TABLE stops(stop_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50) NOT NULL, address VARCHAR(50) NOT NULL);

CREATE TABLE transports(transport_id INT AUTO_INCREMENT PRIMARY KEY, type INT NOT NULL, model VARCHAR(50) NOT NULL, number VARCHAR(50) NOT NULL UNIQUE);

CREATE TABLE users (user_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50) NOT NULL, surname VARCHAR(50) NOT NULL, email VARCHAR(50) NOT NULL, passwordHash INT NOT NULL, role INT NOT NULL);

CREATE TABLE plans(plan_id INT AUTO_INCREMENT PRIMARY KEY, route_id INT NOT NULL,
                   transport_id INT NOT NULL, FOREIGN KEY(route_id) REFERENCES routes(route_id),FOREIGN KEY(transport_id) REFERENCES transports(transport_id));

CREATE TABLE drivers(driver_id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50) NOT NULL, surname VARCHAR(50) NOT NULL, age INT NOT NULL,
                     route_id INT NOT NULL, FOREIGN KEY(route_id) REFERENCES routes(route_id));

CREATE TABLE route_stops(route_stops_id INT AUTO_INCREMENT PRIMARY KEY, route_id INT NOT NULL, stop_id INT NOT NULL, number INT NOT NULL,
                         FOREIGN KEY(route_id) REFERENCES routes(route_id), FOREIGN KEY(stop_id) REFERENCES stops(stop_id));

CREATE TABLE plan_of_stops(plan_of_stops_id INT AUTO_INCREMENT PRIMARY KEY, stop_id INT NOT NULL, plan_id INT NOT NULL, arriveTime VARCHAR(50) NOT NULL, leaveTime VARCHAR(50) NOT NULL,
                           FOREIGN KEY(stop_id) REFERENCES stops(stop_id), FOREIGN KEY(plan_id) REFERENCES plans(plan_id));
