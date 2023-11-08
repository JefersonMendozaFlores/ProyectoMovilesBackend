package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entidad.Salida;
import com.example.repository.SalidaRepository;

@Service
public class SalidaServiceImp implements SalidaService{
	
	@Autowired
	private SalidaRepository repository;

	@Override
	public List<Salida> listarSalidas() {
		return repository.findAll();
	}

	@Override
	public Salida insertaActualizaSalida(Salida obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaSalida(int idSalida) {
		repository.deleteById(idSalida);
	}
	
	

}
