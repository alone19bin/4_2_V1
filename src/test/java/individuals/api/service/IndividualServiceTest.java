/*
package individuals.api.service;



import individuals.common.dto.IndividualDto;
import individuals.api.entity.IndividualEntity;
import individuals.api.repository.IndividualRepository;
import individuals.api.service.IndividualService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;
import java.util.UUID;


@ExtendWith(SpringExtension.class)
@SpringBootTest 
@ExtendWith(SpringExtension.class)
public class IndividualServiceTest {
    @MockBean
    private IndividualRepository individualRepository;

    @Autowired
    private IndividualService individualService;

    @Test
    void testCreateIndividual() {
        IndividualDto dto = new IndividualDto();
        dto.setPassportNumber("1234567890");
        dto.setPhoneNumber("+79991234567");
        dto.setEmail("test@example.com");

        IndividualEntity savedEntity = new IndividualEntity();
        savedEntity.setId(UUID.randomUUID());
        
        when(individualRepository.save(any(IndividualEntity.class)))
            .thenReturn(savedEntity);

        IndividualEntity result = individualService.createIndividual(dto);

        assertNotNull(result.getId());
        verify(individualRepository).save(any(IndividualEntity.class));
    }

    @Test
    void testUpdateIndividual() {
        IndividualDto dto = new IndividualDto();
        dto.setId(UUID.randomUUID());
        dto.setPassportNumber("0987654321");

        IndividualEntity existingEntity = new IndividualEntity();
        
        when(individualRepository.findById(dto.getId()))
            .thenReturn(Optional.of(existingEntity));
        when(individualRepository.save(any(IndividualEntity.class)))
            .thenReturn(existingEntity);

        IndividualEntity result = individualService.updateIndividual(dto);

        assertEquals(dto.getPassportNumber(), result.getPassportNumber());
        verify(individualRepository).save(any(IndividualEntity.class));
    }
}*/
