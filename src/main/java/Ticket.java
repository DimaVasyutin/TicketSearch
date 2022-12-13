public class Ticket implements Comparable<Ticket> {
    private int id;
    private int cost;
    private String departure;
    private String arrival;
    private int travelTime;

    public Ticket(int id, int cost, String departure, String arrival, int travelTime) {
        this.id = id;
        this.cost = cost;
        this.departure = departure;
        this.arrival = arrival;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.cost < o.cost) {
            return -1;
        }
        if (this.cost > o.cost) {
            return 1;
        } else {
            return 0;
        }
    }
}

