package module8package;

import java.util.*;

class Flight {

    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public long getFlightTime() {
        return (long)(arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis())/60000;
    }
}

class Itinerary {

    private List<Flight> flights;
    public Itinerary(List<Flight> flights) {
    this.flights = flights;
    }

    public long getTotalTravelTime() {

        return (flights.get(flights.size()
                -1).getArrivalTime().getTimeInMillis() - 
                flights.get(0).getDepartureTime().getTimeInMillis()
                )/60000;

    }

    public long getTotalFlightTime() {

        long flightTime = 0;
        for (Flight f : flights) {
        flightTime += f.getFlightTime();
        }

        return flightTime;

    }

}

public class problem3 {

    public static void main(String[] args) {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
        new GregorianCalendar(2014, 4, 5, 5, 5, 0),
        new GregorianCalendar(2014, 4, 5, 6, 15, 0)));


        flights.add(new Flight("US235",
        new GregorianCalendar(2014, 4, 5, 6, 55, 0),
        new GregorianCalendar(2014, 4, 5, 7, 45, 0)));

        flights.add(new Flight("US237",
        new GregorianCalendar(2014, 4, 5, 9, 35, 0),
        new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

        Itinerary itinerary = new Itinerary(flights);

        System.out.println(itinerary.getTotalTravelTime());
        System.out.println(itinerary.getTotalFlightTime());

    }

}