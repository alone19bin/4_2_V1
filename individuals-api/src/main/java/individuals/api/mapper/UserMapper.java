package individuals.api.mapper;

import individuals.common.dto.UserDto;
import individuals.api.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

//преобразоваем между сущностью User и DTO с помощью MapStruct

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {IndividualMapper.class, AddressMapper.class, CountryMapper.class})
public interface UserMapper {
             // User в UserDto
    UserDto toDto(UserEntity entity);

             //  UserDto обратно в сущность User
    UserEntity toEntity(UserDto dto);
}