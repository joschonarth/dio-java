package org.example.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDTO {

    private int id;
    private String nome;
    private LocalDate birthday;
}
