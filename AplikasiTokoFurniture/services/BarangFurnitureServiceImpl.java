package AplikasiTokoFurniture.services;

import AplikasiTokoFurniture.entities.BarangFurniture;
import AplikasiTokoFurniture.repositories.BarangFurnitureRepositoryDbImpl;

import java.util.List;

public class BarangFurnitureServiceImpl implements BarangFurnitureService {
    private BarangFurnitureRepositoryDbImpl repository;

    public BarangFurnitureServiceImpl(BarangFurnitureRepositoryDbImpl repository) {
        this.repository = repository;
    }

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