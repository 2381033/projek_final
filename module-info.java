module AplikasiTokoFurniture {
    requires spring.context;
    requires spring.beans;
    requires java.sql;
    requires org.slf4j;

    opens AplikasiTokoFurniture;
    opens AplikasiTokoFurniture.entities;
    opens AplikasiTokoFurniture.repositories;
    opens AplikasiTokoFurniture.services;
    opens AplikasiTokoFurniture.views;
}