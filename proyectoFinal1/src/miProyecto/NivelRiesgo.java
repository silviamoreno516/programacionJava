/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miProyecto;

/**
 *
 * @author salones
 */
public class NivelRiesgo {

    //Atributos
    public int id_nivel;
    public String nombre;
    public float nivel;

    //Constructor
    // 1 -> constructor - vacio
    public NivelRiesgo() {
    }
    // 1 -> constructor - completo

    public NivelRiesgo(int id_nivel, String nombre, float nivel) {
        this.id_nivel = id_nivel;
        this.nombre = nombre;
        this.nivel = nivel;
    }

    // 1 -> constructor - parcial
    public NivelRiesgo(String nombre, float nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    //Metodos

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNivel() {
        return nivel;
    }

    public void setNivel(float nivel) {
        this.nivel = nivel;
    }
    
    
    //Metodo creado por mi
    public void imprimir(){
    
        System.out.println("El nivel de este objeto es: " + nombre + " - nivel:" + nivel);
    }
    
    //Metodo principal
    public static void main(String[] args) {
        
        //Voy a crear mi primer objeto
        
        NivelRiesgo n1 = new NivelRiesgo(1, "Extremo", 10);
        NivelRiesgo n2 = new NivelRiesgo(2, "Medio", 5);
        NivelRiesgo n3 = new NivelRiesgo(3, "Bajo", 1);
        
        
        //Uso del primer metodo creado por mi
        n1.imprimir();
    }
    
}
