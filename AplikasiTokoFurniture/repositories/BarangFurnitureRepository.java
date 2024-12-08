package AplikasiTokoFurniture.repositories;

import AplikasiTokoFurniture.entities.BarangFurniture;

import java.util.List;

public interface BarangFurnitureRepository {
    void save(BarangFurniture barangFurniture);
    BarangFurniture findById(int id);
    List<BarangFurniture> findAll();
}
