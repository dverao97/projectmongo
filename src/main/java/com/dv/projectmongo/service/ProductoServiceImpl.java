package com.dv.projectmongo.service;


import com.dv.projectmongo.model.Producto;
import com.dv.projectmongo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,String> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public CrudRepository<Producto, String> getDao() {
        return productoRepository;
    }
}
