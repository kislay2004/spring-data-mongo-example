package com.example.profileapplication;

import com.example.profileapplication.controller.ProfileController;
import com.example.profileapplication.entity.Profile;
import com.example.profileapplication.repo.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
@AllArgsConstructor
public class CommandLineProfile implements CommandLineRunner {

    private final ProfileRepository profileRepository;

    @Override
    public void run(String... args) throws Exception {
        profileRepository.deleteAll();
        Profile insertedProfile = (Profile) profileRepository.insert(ProfileController.DEFAULT_PROFILE);

        System.out.println("--- inserted default profile---"+ insertedProfile.getId());

        Optional profile = profileRepository.findById(insertedProfile.getId());


        System.out.println("--- fetched default profile:\n"+ profile.get());

    }
}
