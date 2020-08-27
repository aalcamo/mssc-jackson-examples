package guru.springframework.msscjacksonexamples.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * We annotated several fields with @Null to show that these must not be set when passing
 * them to the endpoints. When we create a new beer, e.g., the client must not provide
 * these values. They will, however, be returned when retrieving a beer object.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null
    private UUID id;

    @NotBlank
    private String beerName;

    @NotNull
    private String beerStyle;

    @Positive
    private Long upc;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;

    @Positive
    @NotNull
    private BigDecimal price;
}