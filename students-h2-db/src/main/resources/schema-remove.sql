CREATE TABLE etudiants(
  matricule int,
  nom varchar(50),
  niveau varchar(50),
  PRIMARY KEY (matricule)
);

INSERT INTO etudiants (matricule, nom, niveau) VALUES (111, 'user 1', 'GL 3');
INSERT INTO etudiants (matricule, nom, niveau) VALUES (222, 'user 2', 'GL 4');