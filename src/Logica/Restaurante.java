package Logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Restaurante {
	
	private List<Ingrediente> ingredientes = new ArrayList<>();
	private List<Producto> menu = new ArrayList<>();
	private List<Producto> combos = new ArrayList<>();
	
	public Restaurante() {
		cargarInformacionRestaurante(new File("data/ingredientes.txt"),
				new File("data/menu.txt"), new File("data/combos.txt"));
	}

	private void cargarIngredientes(File archivoIngredientes)throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivoIngredientes));
		String ln;
		
		while ((ln = br.readLine())!= null) {
			String[]in= ln.split(";");
			String nombre = in[0];
			int adicional = Integer.parseInt(in[1]);
			Ingrediente info = new Ingrediente(nombre,adicional);
			ingredientes.add(info);
		}
		br.close();
	} 
	private void cargarMenu(File archivoMenu)throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
		String ln;
		
		while ((ln = br.readLine())!= null) {
			String[] productoM = ln.split(";");
			String nombre = productoM[0];
			int precio = Integer.parseInt(productoM[1]);
			ProductoMenu info = new ProductoMenu(nombre,precio);
			menu.add(info);
		}
		br.close();
	}
	private void cargarCombos(File archivoCombos)throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
		String ln;
		
		while ((ln = br.readLine())!= null) {
			String[] comb = ln.split(";");
			String nombre = comb[0];
			int desc = Integer.parseInt(comb[1].replace("%",""));
			Combo combo = new Combo(nombre,desc);
			combos.add(combo);
			for (int pos=2 ; pos < comb.length; pos++) {
				for(Producto pro : menu) {
					if (comb[pos].equals(pro.getNombre())) {
						combo.agregarItemACombo(pro);
					}
				}
			}
		}
		br.close();
	}
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos ) {
		try {
			cargarIngredientes(archivoIngredientes);
			cargarMenu(archivoMenu);
			cargarCombos(archivoCombos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
