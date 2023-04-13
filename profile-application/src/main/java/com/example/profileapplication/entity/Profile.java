package com.example.profileapplication.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("profile")
@AllArgsConstructor
@Builder
@Data
public class Profile {

    @Id
    public UUID id;
    Individual individual;

}
