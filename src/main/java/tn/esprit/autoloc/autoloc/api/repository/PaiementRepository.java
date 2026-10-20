package tn.esprit.autoloc.autoloc.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.api.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}