package cl.empresa.proyecto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="region")

public class Region {

	@Id
	private int codigoRegion;
	private String nombre;
	
	@OneToMany(mappedBy="region", fetch = FetchType.LAZY)
	private List<Comuna> comunas;

	public int getCodigoRegion() {
		return codigoRegion;
	}

	public void setCodigoRegion(int codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Comuna> getComunas() {
		return comunas;
	}

	public void setComunas(List<Comuna> comunas) {
		this.comunas = comunas;
	}

	public Region(int codigoRegion, String nombre, List<Comuna> comunas) {
		this.codigoRegion = codigoRegion;
		this.nombre = nombre;
		this.comunas = comunas;
	}
	
	
	
}
