package org.example.beans;

        import javax.persistence.*;

@Entity
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "tool")
    private Mechanic mechanic;

    public void useGarageMethod() {
        if (mechanic != null) {
            mechanic.getGarage().someGarageMethod();
        }
    }

}