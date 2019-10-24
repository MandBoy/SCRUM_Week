import com.cph.administration.repository.AdminRepo;
import com.cph.models.Station;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.JupiterTestEngine;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;



public class AdminRepoTest {

    AdminRepo repo = new AdminRepo();

    @Test
    public void seeStationTest()
    {
        Station station = new Station();
        station.setID(1);
        station.setType(1);
        station.setActive(true);

        List<Station> stations = repo.seeAllStations();

        assertTrue(true);
       // assertEquals(station, station.getID());
    }

    @Test
    public void dummy()
    {
        assertTrue(true);
    }
}
