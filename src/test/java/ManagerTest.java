import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    RepositoryTicket repo = new RepositoryTicket();
    ManagerTicket manager = new ManagerTicket(repo);

    Ticket ticket1 = new Ticket(1, 30_000,"ATH", "ASF", 240);
    Ticket ticket2 = new Ticket(2, 45_000,"EGO", "BJV", 300);
    Ticket ticket3 = new Ticket(3, 20_000,"ATH", "ASF", 120);
    Ticket ticket4 = new Ticket(4, 15_000,"LCA", "SQQ", 100);

    @Test
    public void testFindAll(){
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] expected = {ticket3, ticket1};
        Ticket[] actual = manager.findAll("ATH","ASF");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNotFindAll(){
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] expected = new Ticket[0];
        Ticket[] actual = manager.findAll("ATH","BJV");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveById(){
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = manager.removeById(4);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdNoId(){
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] expected = new Ticket[0];
        Ticket[] actual = manager.removeById(5);;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindById(){
        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);

        Ticket[] expected = { ticket2};
        Ticket[] actual = manager.findById(2);

        Assertions.assertArrayEquals(expected, actual);
    }

}
