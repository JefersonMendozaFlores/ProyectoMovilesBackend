package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entidad.Entrada;
import com.example.repository.EntradaRepository;

@Service
public class EntradaServiceImp implements EntradaService{
	
	@Autowired
	private EntradaRepository repository;

	@Override
	public List<Entrada> listarEntradas() {
		return repository.findAll();
	}

	@Override
	public Entrada insertaActualizaEntrada(Entrada obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaEntrada(int idEntrada) {
		repository.deleteById(idEntrada);
	}

}
