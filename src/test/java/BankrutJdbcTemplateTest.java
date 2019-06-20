import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.droptable.congifuration.NameSearchConfiguration;
import com.droptable.dao.templates.BankrutJdbcTemplate;
import com.droptable.model.Bankrut;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = NameSearchConfiguration.class)
public class BankrutJdbcTemplateTest {

	@Autowired
	private BankrutJdbcTemplate jdbcTemplate;

	@Test
	public void testGetAll() {
		List<Bankrut> bankruts = jdbcTemplate.getAllByPib("jo").get();
		bankruts.forEach(System.out::println);
		assertTrue(bankruts.size() > 0);
	}

}
