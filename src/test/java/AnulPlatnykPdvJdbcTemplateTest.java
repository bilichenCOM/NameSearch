import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.droptable.congifuration.NameSearchConfiguration;
import com.droptable.dao.templates.AnulPlatnykPdvJdbcTemplate;
import com.droptable.model.AnulPlatnykPdv;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = NameSearchConfiguration.class)
public class AnulPlatnykPdvJdbcTemplateTest {

	@Autowired
	private AnulPlatnykPdvJdbcTemplate jdbcTemplate;

	@Test
	public void testGetAll() {
		List<AnulPlatnykPdv> anulPlatnykPdvs = jdbcTemplate.getAllByPib("jo").get();
		anulPlatnykPdvs.forEach(System.out::println);
		assertTrue(anulPlatnykPdvs.size() > 0);
	}

}
