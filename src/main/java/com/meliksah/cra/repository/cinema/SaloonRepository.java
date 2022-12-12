package com.meliksah.cra.repository.cinema;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.meliksah.cra.model.cinema.Saloon;

@RepositoryRestResource(path = "saloon")
public interface SaloonRepository extends JpaRepository<Saloon, UUID>, JpaSpecificationExecutor<Saloon> {

}
