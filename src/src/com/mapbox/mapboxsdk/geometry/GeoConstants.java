// Created by plusminus on 17:41:55 - 16.10.2008
package com.mapbox.mapboxsdk.geometry;

public interface GeoConstants {
    public static final int RADIUS_EARTH_METERS = 6378137; // http://en.wikipedia.org/wiki/Earth_radius#Equatorial_radius
    public static final double METERS_PER_STATUTE_MILE = 1609.344; // http://en.wikipedia.org/wiki/Mile
    public static final double METERS_PER_NAUTICAL_MILE = 1852; // http://en.wikipedia.org/wiki/Nautical_mile
    public static final double FEET_PER_METER = 3.2808399; // http://en.wikipedia.org/wiki/Feet_%28unit_of_length%29
    public static final int EQUATORCIRCUMFENCE = (int) (2 * Math.PI * RADIUS_EARTH_METERS);

    public static final double MIN_LATITUDE = -85.05112878;
    public static final double MAX_LATITUDE = 85.05112878;
    public static final double MIN_LONGITUDE = -180;
    public static final double MAX_LONGITUDE = 180;
}
