package org.parcial1_DS.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Dna extends Base implements Serializable {

    @Column(length = 1024)
    private String dna;

    private boolean isMutant;
}
