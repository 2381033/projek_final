package AplikasiTokoFurniture.views;

import AplikasiTokoFurniture.entities.BarangFurniture;

import java.util.List;

public interface BarangFurnitureView {
    void showBarang(BarangFurniture barangFurniture);
    void showBarangList(List<BarangFurniture> barangList);
}
