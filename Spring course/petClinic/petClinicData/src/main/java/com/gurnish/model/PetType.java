package com.gurnish.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pet_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetType  extends BaseEntity{
    @Column(name = "name")
    private String name;


}
