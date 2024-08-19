package com.remedy.manuelly.pharmacy.remedy;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Remedy")
@Table (name = "remedy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedy {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private via via;
    private String batch;
    private String quantity;
    private String validity;

    @Enumerated(EnumType.STRING)
    private laboratory laboratory;

    public Remedy(DataRegistrationsRemedies data) {
        this.name = data.name();
        this.via = data.via();
        this.batch = data.batch();
        this.quantity = data.quantity();
        this.validity = data.validity();
        this.laboratory = data.laboratory();
    }
}
