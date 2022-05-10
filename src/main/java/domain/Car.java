package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@Entity
@NoArgsConstructor
public class Car {
    @Id
    @Size(max = 9) @Size(min = 4)
    private String plate;
    @Size(min=0)
    private double mileage;

    private String model;
    @ManyToOne
    private Station location;
}
