package com.example.profileapplication.controller;

import com.example.profileapplication.entity.Individual;
import com.example.profileapplication.entity.IndividualProfile;
import com.example.profileapplication.entity.Name;
import com.example.profileapplication.entity.Profile;
import com.example.profileapplication.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@AllArgsConstructor
public class ProfileController {
    public static final Profile DEFAULT_PROFILE = Profile.builder()
            .id(UUID.randomUUID())
            .individual(Individual.builder()
                    .individualProfile(IndividualProfile.builder()
                            .name(Name.builder().nameFirst("default first name")
                                    .nameLast("default second name")
                                    .nameMiddle("default third name")
                                    .build())

                            .build())
                    .build())
            .build();
    private final ProfileService profileService;

    @GetMapping("/profile/{id}")
    public Profile getProfile(@PathVariable UUID id){
        return profileService.getProfile(id)
                .orElse(DEFAULT_PROFILE);
    }

}
