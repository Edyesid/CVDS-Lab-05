package edu.eci.cvds.GameGuess;

import java.util.ArrayList;
import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

@ManagedBean(name = "guessBean")
@SessionScoped
public class BackingBean {
	private int numeroAdivinar;
	private int intentos;
	private int premioAcumulado;
	private String estado;
	private ArrayList<Integer> numerosUsados = new ArrayList<Integer>();
	
	
	public BackingBean() {
		numeroAdivinar=(int) (Math.random() *10 ) + 1;
		intentos = 0;
		premioAcumulado = 100000;
		estado="Are you Ready?";
	}
	
	public void guess(int intento) {
		
		if(intento == numeroAdivinar && intentos==0) {
			estado = "Acerto";
		} else if (intento != numeroAdivinar) {
			estado = "all right";
			intentos++;
		}else if (intento == numeroAdivinar && intentos>=1) {
			estado = "all right";
			premioAcumulado = premioAcumulado - (10000*intentos);
		}
		if (premioAcumulado < 0) {
			premioAcumulado = 0;
		}
	}
	
	
	public void reiniciar() {
		numeroAdivinar=(int) (Math.random() *10 ) + 1;
		premioAcumulado = 100000;
		intentos = 0;
		estado="Are you Ready?";
	}
	

	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}
	public void setNumeroAdivinar(int numeroAdivinar) {
		this.numeroAdivinar = numeroAdivinar;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public int getPremioAcumulado() {
		return premioAcumulado;
	}
	public void setPremioAcumulado(int premioAcumulado) {
		this.premioAcumulado = premioAcumulado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
