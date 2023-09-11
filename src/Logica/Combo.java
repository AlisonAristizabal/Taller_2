package Logica;

public class Combo implements Producto{
	private int descuento;
	private String nombreCombo;
	private int precio = 0;
	
	public Combo(String nombre, int descuento) {
		this.nombreCombo = nombre;
		this.descuento = descuento;
	}
	public void agregarItemACombo(Producto itemCombo) {
		this.precio += itemCombo.getPrecio();
	}
	@Override
	public int getPrecio() {
		return precio - (precio*(descuento/100));
	}
	@Override
	public String getNombre() {
		return nombreCombo;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
