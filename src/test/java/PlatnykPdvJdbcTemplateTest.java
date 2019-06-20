import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.droptable.congifuration.NameSearchConfiguration;
import com.droptable.dao.templates.PlatnykPdvJdbcTemplate;
import com.droptable.model.PlatnykPdv;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = NameSearchConfiguration.class)
public class PlatnykPdvJdbcTemplateTest {

	@Autowired
	private PlatnykPdvJdbcTemplate jdbcTemplate;

//	@Test
	public void testGetAll() {
		List<PlatnykPdv> platnykPdvs = jdbcTemplate.getAll().get();
		platnykPdvs.forEach(System.out::println);
	}

	@Test
	public void testGetAllByPib() {
		System.out.println("test get all by pib");
		List<PlatnykPdv> platnykPdvs = jdbcTemplate.getAllByPib("hurricane").get();
		platnykPdvs.forEach(System.out::println);
		System.out.println("test ended");
	}
}