package individuals.api.repository;

import individuals.api.entity.IndividualEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, UUID> {
       //поиск  по номеру паспорта
    Optional<IndividualEntity> findByPassportNumber(String passportNumber);

        // Поиск по идентификатору пользователя
    Optional<IndividualEntity> findByUserId(UUID userId);
}