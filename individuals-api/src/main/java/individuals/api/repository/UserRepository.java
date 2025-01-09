package individuals.api.repository;

import individuals.api.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

// работы с пользователями с базовыми JPAметодами
@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
         //поиск пользователя по email
    Optional<UserEntity> findByEmail(String email);

            //Проверка существования пользователя по email
    boolean existsByEmail(String email);
}