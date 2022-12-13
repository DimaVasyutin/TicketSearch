import java.util.Arrays;

public class ManagerTicket {

    private RepositoryTicket repo;

    public ManagerTicket(RepositoryTicket repo){
        this.repo = repo;
    }

    public void addTicket(Ticket ticket){
        repo.addTicket(ticket);
    }

    public Ticket[] findById(int id){
        Ticket[] tmp = repo.findById(id);
        return tmp;
    }

    public Ticket[] removeById(int id){
        Ticket[] tmp = repo.removeById(id);
        return tmp;
    }

    public Ticket[] allTicket(){
        Ticket[] tmp = repo.allTicket();
        return tmp;
    }

    public Ticket[] findAll(String departure, String arrival){
        Ticket[] result = new Ticket[0];
        RepositoryTicket tmp = new RepositoryTicket();

        for (Ticket ticket: allTicket()){
            if (ticket.getDeparture() == departure && ticket.getArrival() == arrival){
                tmp.addTicket(ticket);
                result = tmp.allTicket();
            }
        }
        Arrays.sort(result);
        return result;
    }
}
