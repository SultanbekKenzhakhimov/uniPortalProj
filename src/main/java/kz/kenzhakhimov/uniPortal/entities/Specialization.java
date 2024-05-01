package kz.kenzhakhimov.uniPortal.entities;

import jakarta.persistence.*;
import kz.kenzhakhimov.uniPortal.entities.Faculty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="specializations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 1000)
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private Faculty faculty;
}
