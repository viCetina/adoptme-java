package com.adoptme.petshop.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "pets")
@NoArgsConstructor @ToString @EqualsAndHashCode

public class Pet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Getter @Setter private String name;
    @Getter @Setter private Integer age;

    @ManyToOne @joinColumn(name = "owner_id")
    @Getter @Setter private User owner;
}
