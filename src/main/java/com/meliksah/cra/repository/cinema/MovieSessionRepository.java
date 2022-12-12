package com.meliksah.cra.repository.cinema;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.meliksah.cra.model.cinema.MovieSession;

@RepositoryRestResource(path = "movieSession")
public interface MovieSessionRepository
		extends JpaRepository<MovieSession, UUID>, JpaSpecificationExecutor<MovieSession> {

}
