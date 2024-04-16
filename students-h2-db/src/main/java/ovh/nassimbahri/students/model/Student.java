package ovh.nassimbahri.students.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "etudiants")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matricule;
    @Column(length = 50, nullable = false)
    private String nom;
    @Column(length = 50, nullable = false, name = "section")
    private String niveau;


}
