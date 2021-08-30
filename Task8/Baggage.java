package Task8;

public class Baggage{
    private String carrierName;
    private String flightClassName;
    private Integer luggageWeightLimit;


    public Baggage(String newCarrierName, String newFlightClassName, Integer newLuggageWeightLimit) {
        this.carrierName = newCarrierName;
        this.flightClassName = newFlightClassName;
        this.luggageWeightLimit = newLuggageWeightLimit;
    }

    public String myGetterName(){
        return this.carrierName;
    }

    public String myGetterClassName(){
        return flightClassName;
    }

    public Integer myGetterWeight(){
        return luggageWeightLimit;
    }


    @Override
    public String toString() {
        return  "  " + carrierName + flightClassName + " " + luggageWeightLimit + "\n";
    }
}

