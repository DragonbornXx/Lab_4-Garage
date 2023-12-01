package org.example.beans;

        import org.springframework.stereotype.Component;

        import javax.persistence.*;

@Component
@Entity
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "garage", fetch = FetchType.LAZY)
    private Tool tool;

    public Garage() {
    }

    public void someGarageMethod() {
    }

}