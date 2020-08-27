package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

/**
 * get the object mapper that has been configured by spring boot.
 * the default json library used is Jackson.
 */
@JsonTest
class BeerDtoTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException {

        BeerDto dto = getDto();
        String jsonString = objectMapper.writeValueAsString(dto);
        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {

        String jsonString = "{\"id\":\"7b95a8bf-47b0-4fdb-91f5-9da73bcdfbb9\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"createdDate\":\"2020-08-27T09:43:31.628988-04:00\",\"lastModifiedDate\":\"2020-08-27T09:43:31.630188-04:00\",\"price\":12.99}\n";
        BeerDto dto = objectMapper.readValue(jsonString, BeerDto.class);
        System.out.println(dto);
    }

}