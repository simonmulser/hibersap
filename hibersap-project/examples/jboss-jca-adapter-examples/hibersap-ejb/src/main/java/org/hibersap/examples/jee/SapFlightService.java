package org.hibersap.examples.jee;

import java.util.Date;

import org.hibersap.examples.flightdetail.FlightDetailBapi;
import org.hibersap.examples.flightlist.FlightListBapi;

public interface SapFlightService
{
    String LOCAL_JNDI_NAME = "hibersap/jee/FlightService/local";

    String JNDI_NAME = "hibersap/jee/FlightService/remote";

    void init();

    FlightDetailBapi showFlightDetail( final Date date );

    FlightListBapi showFlightList();
}