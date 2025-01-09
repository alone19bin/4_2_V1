//package individuals.api.mapper;
//
//import individuals.common.dto.IndividualDto;
//import individuals.api.entity.IndividualEntity;
//import individuals.api.mapper.IndividualMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.UUID;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//public class IndividualMapperTest {
//    @Autowired
//    private IndividualMapper individualMapper;
//
//    @Test
//    void testDtoToEntity() {
//        IndividualDto dto = new IndividualDto();
//        dto.setPassportNumber("1234567890");
//        dto.setPhoneNumber("+79991234567");
//        dto.setEmail("test@example.com");
//        dto.setStatus("ACTIVE");
//
//        IndividualEntity entity = individualMapper.toEntity(dto);
//
//        assertEquals(dto.getPassportNumber(), entity.getPassportNumber());
//        assertEquals(dto.getPhoneNumber(), entity.getPhoneNumber());
//        assertEquals(dto.getEmail(), entity.getEmail());
//        assertEquals(dto.getStatus(), entity.getStatus());
//    }
//
//    @Test
//    void testEntityToDto() {
//        IndividualEntity entity = new IndividualEntity();
//        entity.setPassportNumber("1234567890");
//        entity.setPhoneNumber("+79991234567");
//        entity.setEmail("test@example.com");
//        entity.setStatus("ACTIVE");
//
//        IndividualDto dto = individualMapper.toDto(entity);
//
//        assertEquals(entity.getPassportNumber(), dto.getPassportNumber());
//        assertEquals(entity.getPhoneNumber(), dto.getPhoneNumber());
//        assertEquals(entity.getEmail(), dto.getEmail());
//        assertEquals(entity.getStatus(), dto.getStatus());
//    }
//}