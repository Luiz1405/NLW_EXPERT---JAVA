package com.LuizKubaszewski.NLW_EXPERT.Modulos.questions.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlternativesResultDTO {

    private UUID id;
    private String description;
}
