package individuals.api.service;

import individuals.api.entity.IndividualEntity;
import individuals.api.entity.UserEntity;
import individuals.api.repository.IndividualRepository;
import individuals.api.repository.UserRepository;
import individuals.common.dto.IndividualDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

// для бизнес-логики работы с индивидуалс
@Service
@RequiredArgsConstructor
public class IndividualService {
    private final IndividualRepository individualRepository;
    private final UserRepository userRepository;

              //создание индивидуала с привязкой к пользователю
    @Transactional
    public IndividualEntity createIndividual(IndividualDto individualDto, UUID userId)  {
          //  находим пользователя
        UserEntity user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("Пользователь не найден"));

                        //  Проверка существования индивидуалс
        if (individualRepository.findByUserId(userId).isPresent()) {
            throw new RuntimeException("Индивидуал для данного пользователя уже существует");
        }

        IndividualEntity individual = new IndividualEntity();
        individual.setUser(user);
        individual.setPassportNumber(individualDto.getPassportNumber());
        individual.setPhoneNumber(individualDto.getPhoneNumber());
        individual.setEmail(individualDto.getEmail());
        individual.setVerifiedAt(LocalDateTime.now());
        individual.setStatus("CREATED");         // начальный статус

        return individualRepository.save(individual);
    }
}