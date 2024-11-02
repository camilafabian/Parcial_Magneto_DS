package org.parcial1_DS.dto;

import lombok.Getter;
import lombok.Setter;
import org.parcial1_DS.validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
