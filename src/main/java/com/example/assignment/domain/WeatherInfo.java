package com.example.assignment.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;


@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherInfo {

    @Id
    @GeneratedValue
    private Long id;

    private String timezone;
    private String name;
    private String cod;

   @Embedded
    private Main main;

}
