package individuals.api.mapper;

import individuals.common.dto.IndividualDto;
import individuals.api.entity.IndividualEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

        // Маппер для преобразования между сущностью Individual и DTO с MapStruct
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface IndividualMapper {
         //Individual в IndividualDto
    IndividualDto toDto(IndividualEntity entity);

    // ndividualDto обратно в сущность Individual
    IndividualEntity toEntity(IndividualDto dto);
}
