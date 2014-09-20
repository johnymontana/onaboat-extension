package org.neo4j.example.unmanagedextension;

public class BoatNode {
    public Double lat;
    public Double lon;
    public Double x;
    public Double y;
    public Double z;
    public Double timestamp;

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLat() {
        return this.lat;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLon() {
        return this.lon;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getX() {
        return this.x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getY() {
        return this.y;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getZ() {
        return this.z;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }
}