package cl.miaccidente.modelo;

public class Credenciales {

	 private String nombre;
	 private String pass;

	 public Credenciales() {
	  super();
	 }

	 public Credenciales(String nombre, String pass) {
	  super();
	  this.nombre = nombre;
	  this.pass = pass;
	 }

	 public String getNombre() {
	  return nombre;
	 }

	 public void setNombre(String nombre) {
	  this.nombre = nombre;
	 }

	 public String getPass() {
	  return pass;
	 }

	 public void setPass(String pass) {
	  this.pass = pass;
	 }

	 @Override
	 public String toString() {
	  return "Credenciales [nombre=" + nombre + ", pass=" + pass + "]";
	 }

	}