package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * the JsonTest attribute registers all JSON relevant components.
 * by using the active profiles annotation, spring will look for a file named
 * application-{name of profile}.properties, i.e. application-snake.properties.
 */
@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSnake() throws JsonProcessingException {
        BeerDto dto = getDto();
        String jsonString = objectMapper.writeValueAsString(dto);
        System.out.println(jsonString);
    }
}
