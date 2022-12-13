import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RepositoryTest {

    Ticket ticket1 = new Ticket(1, 30_000,"ATH", "ASF", 240);
    Ticket ticket2 = new Ticket(2, 45_000,"EGO", "BJV", 300);
    Ticket ticket3 = new Ticket(3, 20_000,"GNA", "DZN", 120);
    Ticket ticket4 = new Ticket(4, 15_000,"LCA", "SQQ", 100);

    Ticket ticket5 = new Ticket(5, 15_000,"LCA", "SQQ", 120);

    @Test
    public void testAddAndFindAllProduct() {
        RepositoryTicket repo = new RepositoryTicket();

        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);


        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4};
        Ticket[] actual = repo.allTicket();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindId() {
        RepositoryTicket repo = new RepositoryTicket();

        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);


        Ticket[] expected = {ticket1};
        Ticket[] actual = repo.findById(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveById() {
        RepositoryTicket repo = new RepositoryTicket();

        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);


        Ticket[] expected = {ticket2, ticket3, ticket4};
        Ticket[] actual = repo.removeById(1);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdNoId() {
        RepositoryTicket repo = new RepositoryTicket();

        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);


        Ticket[] expected = new Ticket[0];
        Ticket[] actual = repo.removeById(5);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort() {
        RepositoryTicket repo = new RepositoryTicket();
        repo.addTicket(ticket1);
        repo.addTicket(ticket2);
        repo.addTicket(ticket3);
        repo.addTicket(ticket4);
        repo.addTicket(ticket5);

        Arrays.sort(repo.allTicket());


        Ticket[] expected = {ticket4, ticket5, ticket3, ticket1, ticket2};
        Ticket[] actual = repo.allTicket();


        Assertions.assertArrayEquals(expected, actual);
    }



}
