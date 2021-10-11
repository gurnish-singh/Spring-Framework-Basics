package com.gurnish.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "visit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Visit extends  BaseEntity{
    private LocalDate date;
    private String description;
    @ManyToOne
    @JoinColumn( name = "pet_id")
    private Pet pet;

}
