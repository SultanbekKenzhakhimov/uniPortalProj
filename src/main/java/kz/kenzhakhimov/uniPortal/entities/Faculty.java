package kz.kenzhakhimov.uniPortal.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="faculties")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 1000)
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    private University university;
}
