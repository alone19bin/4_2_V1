package individuals.api.mapper;

import individuals.common.dto.AddressDto;
import individuals.api.entity.AddressEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {CountryMapper.class})
public interface AddressMapper {
    @Mapping(target = "postalCode", source = "zipCode")
    @Mapping(target = "country", source = "country")
    AddressDto toDto(AddressEntity entity);

    @Mapping(target = "zipCode", source = "postalCode")
    @Mapping(target = "country", source = "country")
    AddressEntity toEntity(AddressDto dto);
}