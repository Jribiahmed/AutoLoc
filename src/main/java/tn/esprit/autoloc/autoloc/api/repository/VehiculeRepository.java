package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
}