package ma.emsi.sadik.graphql.repository;

import ma.emsi.sadik.graphql.entity.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepository extends JpaRepository<Centre,Long> {
}