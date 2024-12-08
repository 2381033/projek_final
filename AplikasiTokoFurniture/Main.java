package AplikasiTokoFurniture;

import AplikasiTokoFurniture.entities.BarangFurniture;
import AplikasiTokoFurniture.services.BarangFurnitureService;
import AplikasiTokoFurniture.services.BarangFurnitureServiceImpl;
import AplikasiTokoFurniture.views.BarangFurnitureTerminalViewImpl;

public class Main {
    public static void main(String[] args) {
        BarangFurnitureService service = new BarangFurnitureServiceImpl();
        BarangFurnitureTerminalViewImpl view = new BarangFurnitureTerminalViewImpl();

        BarangFurniture barang = new BarangFurniture(1, "Kursi Kayu", 500000, "Kursi kayu berkualitas.");
        service.addBarang(barang);

        view.showBarangList(service.getAllBarang());
    }
}
