package com.meliksah.cra.repository.cinema;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.meliksah.cra.model.cinema.MovieSessionChair;

@RepositoryRestResource(path = "movieSessionChair")
public interface MovieSessionChairRepository
		extends JpaRepository<MovieSessionChair, UUID>, JpaSpecificationExecutor<MovieSessionChair> {

}
