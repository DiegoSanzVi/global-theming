package petshop.backend.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IdentifiedStorageObject{

    @Id
    @GeneratedValue
    private Long id;
}
