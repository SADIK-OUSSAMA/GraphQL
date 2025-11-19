package ma.emsi.sadik.graphql.dto;

import ma.emsi.sadik.graphql.enumeration.Genre;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }