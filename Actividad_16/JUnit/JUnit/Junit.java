package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import actividad_16_junit.Jugador;
import actividad_16_junit.Soldado;

class Junit {

	@Test
	public void JugadorToString() {
		Jugador j = new Jugador();
		j.toString();
	}
	@Test
	public void PonerDorsalPositivo() {
		Jugador j1 = new Jugador();
		int dorsal = 1;
		int resultadoEsperado = 1;
		j1.ponerDorsal(dorsal);
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void PonerDorsalPositivo12() {
		Jugador j2 = new Jugador();
		int dorsal2 = 12;
		int resultadoEsperado = 12;
		j2.setDorsal(dorsal2);
		int resultadoObtenido = j2.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void PonerDorsalLimite() {
		Jugador j3 = new Jugador();
		int dorsal = 30;
		int resultadoEsperado = 30;
		j3.ponerDorsal(dorsal);
		int resultadoObtenido = j3.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void PonerDorsalFueraDelRango() {
		Jugador j4 = new Jugador();
		int dorsal = 50;
		int resultadoEsperado = -1;
		j4.ponerDorsal(dorsal);
		int resultadoObtenido = j4.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void PonerDorsalNegativo() {
		Jugador j4 = new Jugador();
		int dorsal = -3;
		int resultadoEsperado = -1;
		j4.ponerDorsal(dorsal);
		int resultadoObtenido = j4.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void EstaExpulsadoTarjetasAmarillas() {
		Jugador j5 = new Jugador();
		j5.setNumeroTarjetasAmarillas(2);
		j5.setNumeroTarjetasRojas(0);
		assertTrue(j5.estaExpulsado());
	}
	
	@Test
	public void EstaExpulsadoTarjetasRojas() {
		Jugador j6 = new Jugador();
		j6.setNumeroTarjetasAmarillas(0);
		j6.getNumeroTarjetasAmarillas();
		j6.setNumeroTarjetasRojas(1);
		j6.getNumeroTarjetasRojas();
		assertTrue(j6.estaExpulsado());
	}
	
	@Test
	public void NoEstaExpulsado() {
		Jugador j7 = new Jugador();
		j7.setNumeroTarjetasAmarillas(0);
		j7.setNumeroTarjetasRojas(0);
		assertFalse(j7.estaExpulsado());
	}
	
	@Test
	public void EstaExpulsadoTarjetasRojasYamarillas() {
		Jugador j8 = new Jugador();
		j8.setNumeroTarjetasAmarillas(2);
		j8.setNumeroTarjetasRojas(2);
		assertTrue(j8.estaExpulsado());
	}
	
	@Test
	public void TestToString() {
		Soldado s = new Soldado();
		s.toString();
	}
	
	@Test
	public void NoPuedeDisparar() {
		Soldado s1 = new Soldado();
		s1.setNumeroBalas(0);
		assertFalse(s1.puedeDisparar());
	}
	
	@Test
	public void PuedeDisparar() {
		Soldado s2 = new Soldado();
		s2.setNumeroBalas(1);
		assertTrue(s2.puedeDisparar());
	}
	
	@Test
	public void Disparar() {
		Soldado sQueDispara = new Soldado();
		Soldado sDisparado = new Soldado();
		sQueDispara.setNumeroBalas(5);
		int resultadoEsperado = 4;
		sQueDispara.disparar(sDisparado);
		int resultado = sQueDispara.getNumeroBalas();
		assertTrue(sDisparado.isEstaMuerto());
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void SetEstaMuerto() {
		Soldado s = new Soldado();
		s.setEstaMuerto(true);
	}
	
	
}
