package ma.emsi.sadik.graphql;

import ma.emsi.sadik.graphql.entity.Centre;
import ma.emsi.sadik.graphql.entity.Etudiant;
import ma.emsi.sadik.graphql.enumeration.Genre;
import ma.emsi.sadik.graphql.repository.CentreRepository;
import ma.emsi.sadik.graphql.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner {

        @Autowired
        EtudiantRepository etudiantRepository;
        @Autowired
        CentreRepository centreRepository;
        public static void main(String[] args) {
            SpringApplication.run(GraphQlApplication.class, args);
        }

        @Override
        public void run(String... args) throws Exception {
            Centre centre1=Centre.builder()
                    .nom("Roudani").adresse("Maarif").build();
            centreRepository.save(centre1);
            Centre centre2=Centre.builder()
                    .nom("CFC").adresse("Anfa").build();
            centreRepository.save(centre2);
            Etudiant et1=Etudiant.builder()
                    .nom("SADIK").prenom("Oussama").genre(Genre.HOMME)
                    .centre(centre1).build();
            etudiantRepository.save(et1);

        }
    }


