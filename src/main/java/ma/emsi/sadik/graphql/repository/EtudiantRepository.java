package ma.emsi.sadik.graphql.repository;

import ma.emsi.sadik.graphql.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long>
{
}