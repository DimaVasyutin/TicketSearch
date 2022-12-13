public class RepositoryTicket {
    Ticket[] tickets = new Ticket[0];

    public Ticket[] allTicket(){
        return tickets;
    }

    public void addTicket(Ticket ticket){
        Ticket[] tmp = new Ticket[tickets.length +1];
        for (int i=0; i< tickets.length; i++){
            tmp[i]=tickets[i];
        }
        tmp[tmp.length-1] = ticket;
        tickets = tmp;
    }

    public Ticket[] findById(int id) {
        Ticket[] tmp = new Ticket[1];

        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tmp[0] = ticket;
                return tmp;
            }
        }
        return null;
    }

    public Ticket[] removeById(int id) {
        if (findById(id) == null) {
            return new Ticket[0];
        }
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;
        return tickets;
    }
}
