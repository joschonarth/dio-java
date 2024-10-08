package org.example;

import org.example.dto.UserDTO;
import org.example.mapper.UserMapper;
import org.example.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

public class Main {

    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);

    public static void main(String[] args) {
        var model = new UserModel();
        model.setCode(1);
        model.setUserName("Maria");
        model.setBirthday(LocalDate.now().minusYears(30));
        System.out.println(mapper.toDTO(model));

        var dto = new UserDTO();
        dto.setId(1);
        dto.setName("Joao");
        dto.setBirthday(LocalDate.now().minusYears(20));
        System.out.println(mapper.toModel(dto));

    }
}