package individuals.api.controller;

import individuals.api.service.IndividualService;
import individuals.common.dto.IndividualDto;
import individuals.api.entity.IndividualEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import java.util.UUID;


@RestController
@RequestMapping("/api/individuals")
@RequiredArgsConstructor
public class IndividualController {
    private final IndividualService individualService;

    //создание нового индивидуала
    @PostMapping("/{userId}")
    public ResponseEntity<IndividualEntity> createIndividual(
        @PathVariable UUID userId, 
        @RequestBody IndividualDto individualDto
    ) {
        IndividualEntity createdIndividual = individualService.createIndividual(individualDto, userId);
        return new ResponseEntity<>(createdIndividual, HttpStatus.CREATED);
    }
}