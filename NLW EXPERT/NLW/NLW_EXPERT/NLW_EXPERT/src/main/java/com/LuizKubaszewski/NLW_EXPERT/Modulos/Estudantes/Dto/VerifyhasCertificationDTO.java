package com.LuizKubaszewski.NLW_EXPERT.Modulos.Estudantes.Dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class VerifyhasCertificationDTO {
    private String email;
    private String technology;
    
}
