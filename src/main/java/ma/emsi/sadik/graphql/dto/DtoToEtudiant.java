package ma.emsi.sadik.graphql.dto;
import ma.emsi.sadik.graphql.entity.Centre;
import ma.emsi.sadik.graphql.entity.Etudiant;
import ma.emsi.sadik.graphql.repository.CentreRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DtoToEtudiant {
    @Autowired
    CentreRepository centreRepository;
    public void toEtudiant(Etudiant et, EtudiantDTO dto) {
        Centre centre= centreRepository.findById(dto.centreId()).orElse(null);
        if (dto != null) {
            BeanUtils.copyProperties(et,dto);
            et.setCentre(centre);
        }
    }
}