package AplikasiTokoFurniture.services;

import AplikasiTokoFurniture.entities.BarangFurniture;

import java.util.List;

public interface BarangFurnitureService {
    void addBarang(BarangFurniture barangFurniture);
    BarangFurniture getBarangById(int id);
    List<BarangFurniture> getAllBarang();
}
