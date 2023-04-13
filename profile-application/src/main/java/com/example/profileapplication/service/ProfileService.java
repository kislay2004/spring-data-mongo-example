package com.example.profileapplication.service;

import com.example.profileapplication.entity.Profile;
import com.example.profileapplication.repo.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public Optional<Profile> getProfile(UUID id){
        return profileRepository.findById(id);
    }
}
