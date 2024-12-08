package AplikasiTokoFurniture.repositories;

import AplikasiTokoFurniture.config.Database;
import AplikasiTokoFurniture.entities.BarangFurniture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BarangFurnitureRepositoryDbImpl implements BarangFurnitureRepository {
    private Database database;

    public BarangFurnitureRepositoryDbImpl(Database database) {
        this.database = database;
    }

    @Override
    public ArrayList<BarangFurniture> findAll() {
        Connection connection = database.getConnection();
        String sqlStatement = "SELECT * FROM furniture";
        ArrayList<BarangFurniture> furnitureList = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BarangFurniture furniture = new BarangFurniture(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getInt("price"),resultSet.getString("description"));

                furnitureList.add(furniture);
            }
        } catch (SQLException e) {
            System.out.println("Error fetching furniture: " + e.getMessage());
        }

        return furnitureList;
    }

    @Override
    public void save(BarangFurniture furniture) {
        Connection connection = database.getConnection();
        String sqlStatement = "INSERT INTO furniture (name, description, price) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
            preparedStatement.setString(1, furniture.getName());
            preparedStatement.setString(2, furniture.getDescription());
            preparedStatement.setInt(3, furniture.getPrice());


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Furniture added successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error adding furniture: " + e.getMessage());
        }
    }

    @Override
    public BarangFurniture findById(int id) {
        return findAll().get(id);
    }


}