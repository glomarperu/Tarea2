package com.idat.tareabodega.servicio;

import java.util.List;

import com.idat.tareabodega.dto.BodegaRequestDTO;
import com.idat.tareabodega.dto.BodegaResponseDTO;

public interface BodegaServicio {
	
	public void guardarBodega(BodegaRequestDTO bodega);
	public void editarBodega(BodegaRequestDTO bodega);
	public void eliminarBodega(Integer id);
	public List<BodegaResponseDTO> listarBodega();
	public BodegaResponseDTO obtenerBodegaId(Integer id);

}
