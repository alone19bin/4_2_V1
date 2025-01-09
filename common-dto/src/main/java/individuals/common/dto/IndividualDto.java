package individuals.common.dto;

import lombok.Data;
import jakarta.validation.constraints.Pattern;

@Data
public class IndividualDto {
    private String id;

    @Pattern(regexp = "\\d{10}", message = "Passport number must be 10 digits")
    private String passportNumber;

    @Pattern(regexp = "\\+7\\d{10}", message = "Phone number must be in +7XXXXXXXXXX format")
    private String phoneNumber;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Invalid email format")
    private String email;

    private String status;
}