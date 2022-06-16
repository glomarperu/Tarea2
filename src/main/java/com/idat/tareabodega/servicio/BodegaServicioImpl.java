package com.idat.tareabodega.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tareabodega.dto.BodegaRequestDTO;
import com.idat.tareabodega.dto.BodegaResponseDTO;
import com.idat.tareabodega.modelo.Bodega;
import com.idat.tareabodega.repositorio.BodegaRepositorio;

@Service
public class BodegaServicioImpl implements BodegaServicio {

	@Autowired
	private BodegaRepositorio repositorio;
	@Override
	public void guardarBodega(BodegaRequestDTO bodega) {
		Bodega obj = new Bodega();
		obj.setIdBodega(bodega.getIdBodegaDTO());
		obj.setNombreBodega(bodega.getNombreBodegaDTO());
		
		repositorio.save(obj);

	}

	@Override
	public void editarBodega(BodegaRequestDTO bodega) {
		Bodega obj = new Bodega();
		obj.setIdBodega(bodega.getIdBodegaDTO());
		obj.setNombreBodega(bodega.getNombreBodegaDTO());
		
		repositorio.saveAndFlush(obj);

	}

	@Override
	public void eliminarBodega(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<BodegaResponseDTO> listarBodega() {
		
		List<BodegaResponseDTO> lista = new ArrayList<BodegaResponseDTO>();
		BodegaResponseDTO obj = null;
		
		for(Bodega bodega : repositorio.findAll()) {
			obj = new BodegaResponseDTO();
			obj.setIdBodegaDTO(bodega.getIdBodega());
			obj.setNombreBodegaDTO(bodega.getNombreBodega());
			
			lista.add(obj);
		}
		
		return lista;
	}

	@Override
	public BodegaResponseDTO obtenerBodegaId(Integer id) {

		Bodega bodega = repositorio.findById(id).orElse(null);
		
		BodegaResponseDTO obj = new BodegaResponseDTO();
		obj.setIdBodegaDTO(bodega.getIdBodega());
		obj.setNombreBodegaDTO(bodega.getNombreBodega());
		return obj;
	}

}
