package AplikasiTokoFurniture.repositories;

import AplikasiTokoFurniture.entities.BarangFurniture;

import java.util.List;

public class BarangFurnitureRepositoryImpl implements BarangFurnitureRepository {
    private BarangFurnitureRepositoryDbImpl dbImpl = new BarangFurnitureRepositoryDbImpl();

    @Override
    public void save(BarangFurniture barangFurniture) {
        dbImpl.save(barangFurniture);
    }

    @Override
    public BarangFurniture findById(int id) {
        return dbImpl.findById(id);
    }

    @Override
    public List<BarangFurniture> findAll() {
        return dbImpl.findAll();
    }
}
