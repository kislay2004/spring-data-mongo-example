package com.example.profileapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Name {

    private String nameFirst;
    private String nameMiddle;
    private String nameLast;


}
