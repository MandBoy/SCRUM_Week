CREATE TABLE flight (id int(10) NOT NULL AUTO_INCREMENT, serial_number varchar(255) NOT NULL, arrival_time timestamp NOT NULL, departure_time timestamp NOT NULL, arrival_offset int(10) NOT NULL, departure_offset int(10) NOT NULL, from_destination int(10) NOT NULL, to_destination int(10) NOT NULL, PRIMARY KEY (id));
CREATE TABLE station (id int(10) NOT NULL AUTO_INCREMENT, active bit(1) NOT NULL, station_type int(10) NOT NULL, PRIMARY KEY (id));
CREATE TABLE crew_type (id int(10) NOT NULL AUTO_INCREMENT, title varchar(255) NOT NULL, PRIMARY KEY (id));
CREATE TABLE flight__station (fk_flight_id int(10) NOT NULL, fk_station_id int(10) NOT NULL, reserved_from int(10) NOT NULL, reserved_to int(10));
ALTER TABLE flight__station ADD CONSTRAINT FKflight__st599220 FOREIGN KEY (fk_station_id) REFERENCES station (id);
ALTER TABLE flight__station ADD CONSTRAINT FKflight__st9599 FOREIGN KEY (fk_flight_id) REFERENCES flight (id);
