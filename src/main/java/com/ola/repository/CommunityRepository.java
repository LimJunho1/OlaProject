package com.ola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ola.entity.Community;

public interface CommunityRepository extends JpaRepository<Community, Long> {
}