package com.udea.ciudad.model;

import lombok.*;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Data
@Entity
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Ciudad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idcity")
    private Long idCity;

    @Column(name="cityname", nullable = false, length = 80)
    private @NonNull String cityName;

    @Column(name="countryname", nullable = false, length = 80)
    private @NonNull String countryName;

    @Column(name="weatherreport", nullable = false, length = 80)
    private @NonNull String weatherReport;

    @Column(name="temperature", nullable = false, length = 80)
    private @NonNull String temperature;

}
