package ovh.nassimbahri.students.model;

import lombok.*;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@AllArgsConstructor @NoArgsConstructor
@Builder
public class Student implements Serializable {

    @NonNull
    private long matricule;
    @NonNull
    private String nom;
    private String niveau;


}
