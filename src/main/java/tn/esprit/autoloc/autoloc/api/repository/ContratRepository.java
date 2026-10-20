package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, Long> {
}