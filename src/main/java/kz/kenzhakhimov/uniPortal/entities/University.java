package kz.kenzhakhimov.uniPortal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="universities")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
    @Column(length = 1000)
    private String description;
    private String pic_name;
}
