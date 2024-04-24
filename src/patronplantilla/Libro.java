/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronplantilla;


/**
 *
 * @author Acer
 */
public class Libro {
  private String titulo;
    private boolean prestado;
    private String usuario;

    public Libro(String titulo, String usuario) {
        this.usuario=usuario;
        this.titulo = titulo;
        this.prestado = false;
        prestarLibro(usuario);
        
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    

    public class Devolucion{
     private Libro libro;
     private String usuario;
   

        public Devolucion(Libro libro, String usuario) {
        this.libro=libro;
        this.usuario=usuario;
        devolverLibro(usuario);
            }
    
     public void devolverLibro(String usuario) {
       if (libro.isPrestado()) {    
            libro.setPrestado(false); 
            libro.usuario=null;
            System.out.println("El usuario " + usuario + " a debuelto el libro " + libro.getTitulo());
        }
       
       
     }
    }

    

    public void prestarLibro(String usuario) {
        if (prestado==false) {
            System.out.println("El libro " + titulo + " ha sido prestado a " + usuario);
            System.out.println("El libro " + titulo + " Se a retirado de la biblioteca ");
            prestado = true;
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }
    public void devolverlibro(){
    
    Devolucion devolver=new Devolucion(this, usuario);
    
    
    }
    


    } 


