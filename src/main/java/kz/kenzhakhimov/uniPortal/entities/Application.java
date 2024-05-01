package kz.kenzhakhimov.uniPortal.entities;

import jakarta.persistence.*;
import kz.kenzhakhimov.uniPortal.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="applications")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 5000)
    private String letter;
    private boolean handle;
    @ManyToOne(fetch = FetchType.EAGER)
    private Specialization specialization;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
