package museo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @see Visita
 * @author Sara
 *
 */
public class VisitasDia {
	
	private int[] diaVisita;
	
	private ArrayList<Visita> visitasFecha;

	
	public VisitasDia(int[] diaVisita) {
		
	}

	
	public void guardarAFichero(String fichero) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
		oos.writeObject(visitasFecha);
		oos.close();
	}

	
	public int cargarVisitas(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
		return -1;
	}

	public static void verFichero(String fichero) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	}

	public boolean aniadeVisita(Visita v) throws IOException {
		return false;
	}

	public static boolean horaCorrecta(int[] hora) throws IOException {
		return false;
		
	}

	public int numVisitantesHora(int[] hora) {
		return -1;
	}

	public boolean actualizaVisita(String nombre) throws IOException {
		return false;
	}

	
	public void crearInforme() throws IOException {
		
	}

	public HashMap<Integer, Integer> mapaLibres() throws IOException {
		return null;
	}

	public int[] tiempoVisitaMasCercano(int hora, int minutos) throws IOException {
		return null;
	}

	public int borrarVisitasPasadas() throws IOException {
		return -1;
	}

	public boolean chequearFichero(String nomFichero) throws IOException {
		return false;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	}
}