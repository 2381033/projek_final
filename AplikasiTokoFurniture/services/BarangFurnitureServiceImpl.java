package AplikasiTokoFurniture.services;

import AplikasiTokoFurniture.entities.BarangFurniture;
import AplikasiTokoFurniture.repositories.BarangFurnitureRepository;
import AplikasiTokoFurniture.repositories.BarangFurnitureRepositoryImpl;

import java.util.List;

public class BarangFurnitureServiceImpl implements BarangFurnitureService {
    private BarangFurnitureRepository repository = new BarangFurnitureRepositoryImpl();

    @Override
    public void addBarang(BarangFurniture barangFurniture) {
        repository.save(barangFurniture);
    }

    @Override
    public BarangFurniture getBarangById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<BarangFurniture> getAllBarang() {
        return repository.findAll();
    }
}
