package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}