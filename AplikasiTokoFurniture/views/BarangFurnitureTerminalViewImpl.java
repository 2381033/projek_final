package AplikasiTokoFurniture.views;

import AplikasiTokoFurniture.entities.BarangFurniture;

import java.util.List;

public class BarangFurnitureTerminalViewImpl implements BarangFurnitureView {

    @Override
    public void showBarang(BarangFurniture barangFurniture) {
        System.out.println(barangFurniture);
    }

    @Override
    public void showBarangList(List<BarangFurniture> barangList) {
        for (BarangFurniture barang : barangList) {
            System.out.println(barang);
        }
    }
}
