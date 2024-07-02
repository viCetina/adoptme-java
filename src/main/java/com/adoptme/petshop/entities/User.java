package com.adoptme.petshop.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity @Table(name = "users")
@NoArgsConstructor @ToString @EqualsAndHashCode
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long;

    @Getter @Setter private String name;
    @Getter @Setter private String email;

    @ManyToOne(mappedBy = "owner", cascade = CascadeType.ALL, fetch = ))
}
