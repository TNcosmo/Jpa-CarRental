package domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.AssertTrue;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@Entity
@NoArgsConstructor
public class Rental {
    @GeneratedValue
    @Id
    private Long id;

    private Double drivenKm;

    private LocalDateTime beginning;

    private LocalDateTime end;

    private Car car;

    private Station rentalStation;

    private Station returnStation;

    @AssertTrue
    private boolean isAllNull(){
        if (beginning.isAfter(end) && end.isBefore(beginning)) return false;
        if (drivenKm==null || returnStation==null || end==null){
            if(drivenKm==null && returnStation == null && end==null) return false;
        }
        return true;
    }
}


