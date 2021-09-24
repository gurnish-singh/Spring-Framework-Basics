package petclinic.model;

import javax.persistence.Id;
import java.io.Serializable;
///we will need ID at some places in or model
///so just mde it separated
public class BaseEntity implements Serializable {
    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
