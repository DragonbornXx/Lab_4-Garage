package org.example;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.example.beans.Mechanic;

@Service
public class MechanicService {
    private final MechanicRepository mechanicRepository;

    @Autowired
    public MechanicService(MechanicRepository mechanicRepository) {
        this.mechanicRepository = mechanicRepository;
    }

    public void saveBook() {
        Mechanic newMechanic = new Mechanic("New Mechanic", "New Tool");
        mechanicRepository.save(newMechanic);
    }

    public Mechanic getMechanicById(Long mechanicId) {
        return mechanicRepository.findById(mechanicId).orElse(null);
    }

    public void updateMechanic(Long mechanicId) {
        Mechanic mechanicToUpdate = mechanicRepository.findById(mechanicId).orElse(null);
        if (mechanicToUpdate != null) {
            mechanicToUpdate.setName("Updated Mechanic Name");
            mechanicToUpdate.setTool("Updated Tool");
            mechanicRepository.save(mechanicToUpdate);
        }
    }

    public void deleteMechanic(Long mechanicId) {
        mechanicRepository.deleteById(mechanicId);
    }
}
