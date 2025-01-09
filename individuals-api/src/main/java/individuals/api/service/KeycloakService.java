package individuals.api.service;

import individuals.api.entity.UserEntity;
import individuals.common.dto.IndividualDto;
import lombok.RequiredArgsConstructor;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KeycloakService {
    public void registerUser(UserEntity user, IndividualDto individualDto) {
        UserRepresentation keycloakUser = new UserRepresentation();
        keycloakUser.setUsername(user.getEmail());
        keycloakUser.setEmail(user.getEmail());
        keycloakUser.setFirstName(user.getFirstName());
        keycloakUser.setLastName(user.getLastName());
        keycloakUser.setEnabled(true);

        // регистрации пользователя в Keycloak


                // установка secretKey после регистрации
        user.setSecretKey(generateSecretKey(user));
    }

    private String generateSecretKey(UserEntity user) {
                //генерация уникального секретного ключа
        return user.getId() != null ? user.getId().toString() : "default-key";
    }
}