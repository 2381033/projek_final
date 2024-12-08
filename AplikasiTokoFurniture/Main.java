package AplikasiTokoFurniture;

import AplikasiTokoFurniture.config.Database;
import AplikasiTokoFurniture.entities.BarangFurniture;
import AplikasiTokoFurniture.repositories.BarangFurnitureRepositoryDbImpl;
import AplikasiTokoFurniture.services.BarangFurnitureService;
import AplikasiTokoFurniture.services.BarangFurnitureServiceImpl;
import AplikasiTokoFurniture.views.BarangFurnitureTerminalViewImpl;


public class Main {
    public static void main(String[] args) {
        Database database = new Database("furnituredb", "root", "", "localhost", "3306");
        database.setup();
        BarangFurnitureRepositoryDbImpl barangFurnitureRepositoryDb = new BarangFurnitureRepositoryDbImpl(database);
        BarangFurnitureService service = new BarangFurnitureServiceImpl(barangFurnitureRepositoryDb);
        BarangFurnitureTerminalViewImpl view = new BarangFurnitureTerminalViewImpl();

        BarangFurniture barang = new BarangFurniture(1, "Kursi Kayu", 500000, "Kursi kayu berkualitas.");
        service.addBarang(barang);

        view.showBarangList(service.getAllBarang());
    }
}