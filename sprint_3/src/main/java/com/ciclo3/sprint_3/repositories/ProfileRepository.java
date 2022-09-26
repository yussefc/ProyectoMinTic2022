package com.ciclo3.sprint_3.repositories;

import com.ciclo3.sprint_3.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
}
