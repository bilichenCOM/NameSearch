import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.droptable.congifuration.NameSearchConfiguration;
import com.droptable.dao.templates.PodatkBorzhnykJdbcTemplate;
import com.droptable.model.PodatkBorzhnyk;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = NameSearchConfiguration.class)
@WebAppConfiguration
public class PodatkBorzhnykJdbcTemplateTest {

	@Autowired
	private PodatkBorzhnykJdbcTemplate jdbcTemplate;

	@Test
	public void testGetAll() {
		List<PodatkBorzhnyk> podatkBorzhnyks = jdbcTemplate.getAllByPib("jo").get();
		podatkBorzhnyks.forEach(System.out::println);
		assertTrue(true);
	}

}
