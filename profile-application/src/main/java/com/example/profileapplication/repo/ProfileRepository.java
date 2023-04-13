package com.example.profileapplication.repo;

import com.example.profileapplication.entity.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ProfileRepository extends MongoRepository<Profile, UUID> {



}
