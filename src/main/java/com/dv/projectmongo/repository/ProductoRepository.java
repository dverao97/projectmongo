package com.dv.projectmongo.repository;


import com.dv.projectmongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {
}
