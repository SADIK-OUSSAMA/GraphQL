package ma.emsi.sadik.graphql.controller;


import ma.emsi.sadik.graphql.dto.EtudiantDTO;
import ma.emsi.sadik.graphql.entity.Centre;
import ma.emsi.sadik.graphql.entity.Etudiant;
import ma.emsi.sadik.graphql.service.CentreService;
import ma.emsi.sadik.graphql.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EtudiantCentreController {
    @Autowired
    EtudiantService etudiantService;
    @Autowired
    CentreService centreService;
    @QueryMapping
    public List<Centre> getAllCentres(){
        return centreService.centres();
    }
    @QueryMapping
    public List<Etudiant>getAllEtudiants(){
        return etudiantService.getStudents();
    }
    @QueryMapping
    public Centre getCentre(@Argument int id){
        return centreService.getCentre(id);
    }
    @QueryMapping
    public Etudiant getEtudiant(@Argument Long id){
        return etudiantService.getEtudiant(id);
    }
    @QueryMapping
    public Etudiant getEtudiantById(@Argument Long id) {
        return etudiantService.getEtudiant(id);
    }
    @MutationMapping
    public Etudiant addEtudiant(@Argument EtudiantDTO etudiantDTO) {
        return etudiantService.addEtudiant(etudiantDTO);
    }
    @MutationMapping
    public String suppEtudiant(@Argument Long id){
        return etudiantService.deleteEtudiant(id);
    }
    @MutationMapping
    public Etudiant updateEtudiant(@Argument Long id,@Argument EtudiantDTO etudiantDTO){
        return etudiantService.updateEtudiant(id,etudiantDTO);
    }
}