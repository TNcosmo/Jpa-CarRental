package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;

@AllArgsConstructor
@Entity
public class Station {
    @GeneratedValue
    @Id
    private Long id;
    @Column(unique = true)
    private String title;
}
