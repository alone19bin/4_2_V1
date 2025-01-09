package individuals.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

//Конфиг  для настройки аудита
@Configuration
@EnableJpaAuditing //функциональность аудита сущностей
public class AuditConfiguration {

    // источник информации о ткущем пользователе для аудита
    @Bean
    public AuditorAware<String> auditorProvider() {
        return () -> {
            //олучение  контекста безопасности
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

            // Если аутентификация отсутствует или пользователь не авторизова,возвращаем
            if (authentication == null || !authentication.isAuthenticated()) {
                return Optional.of("SYSTEM");
            }

            //Возвращение  имеени текущего аутентифицированного пользователя
            return Optional.of(authentication.getName());
        };
    }
}