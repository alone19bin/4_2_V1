/*
package individuals.api.saga;


import individuals.common.dto.UserDto;
import individuals.common.dto.AddressDto;
import individuals.common.dto.IndividualDto;
import individuals.api.entity.UserEntity;
import individuals.api.entity.AddressEntity;
import individuals.api.entity.IndividualEntity;
import individuals.api.saga.SagaOrchestrator;
import individuals.api.service.UserService;
import individuals.api.service.IndividualService;
import individuals.api.service.AddressService;
import individuals.api.service.KeycloakService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.UUID;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class SagaOrchestratorTest {
    @MockBean
    private UserService userService;
    @MockBean
    private IndividualService individualService;
    @MockBean
    private AddressService addressService;
    @MockBean
    private KeycloakService keycloakService;

    @Autowired
    private SagaOrchestrator sagaOrchestrator;

    @Test
    void testSuccessfulUserCreation() {
        UserDto userDto = createTestUserDto();

        UserEntity mockUser = new UserEntity();
        mockUser.setId(UUID.randomUUID());

        when(addressService.createAddress(any())).thenReturn(new AddressEntity());
        when(individualService.createIndividual(any())).thenReturn(new IndividualEntity());
        when(userService.createUser(any())).thenReturn(mockUser);
        when(keycloakService.registerUser(any())).thenReturn("keycloak-user-id");
        when(userService.updateUser(any())).thenReturn(mockUser);

        UserEntity result = sagaOrchestrator.createUserWithIndividual(userDto);

        assertNotNull(result);
        verify(addressService).createAddress(any());
        verify(individualService).createIndividual(any());
        verify(userService).createUser(any());
        verify(keycloakService).registerUser(any());
    }

    private UserDto createTestUserDto() {
        UserDto dto = new UserDto();
        dto.setEmail("test@example.com");
        dto.setFirstName("John");
        dto.setLastName("Doe");
        
        AddressDto addressDto = new AddressDto();
        addressDto.setAddress("Test Address");
        dto.setAddress(addressDto);

        IndividualDto individualDto = new IndividualDto();
        individualDto.setPassportNumber("1234567890");
        dto.setIndividual(individualDto);

        return dto;
    }
}*/
