/*
package individuals.api.validation;

import individuals.common.dto.IndividualDto;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

@ExtendWith(SpringExtension.class)
public class IndividualDtoValidationTest {
    private static Validator validator;

    @BeforeAll
    static void setupValidatorInstance() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    void testValidIndividualDto() {
        IndividualDto dto = new IndividualDto();
        dto.setPassportNumber("1234567890");
        dto.setPhoneNumber("+79991234567");
        dto.setEmail("test@example.com");

        Set<ConstraintViolation<IndividualDto>> violations = validator.validate(dto);
        assertTrue(violations.isEmpty(), "DTO должен быть валидным");
    }

    @Test
    void testInvalidEmail() {
        IndividualDto dto = new IndividualDto();
        dto.setPassportNumber("1234567890");
        dto.setEmail("invalid-email");

        Set<ConstraintViolation<IndividualDto>> violations = validator.validate(dto);
        assertFalse(violations.isEmpty(), "Email должен быть невалидным");
        assertTrue(violations.stream()
            .anyMatch(v -> v.getMessage().contains("Некорректный формат email")));
    }

    @Test
    void testInvalidPhoneNumber() {
        IndividualDto dto = new IndividualDto();
        dto.setPassportNumber("1234567890");
        dto.setPhoneNumber("123");

        Set<ConstraintViolation<IndividualDto>> violations = validator.validate(dto);
        assertFalse(violations.isEmpty(), "Номер телефона должен быть невалидным");
        assertTrue(violations.stream()
            .anyMatch(v -> v.getMessage().contains("Некорректный номер телефона")));
    }
}*/
