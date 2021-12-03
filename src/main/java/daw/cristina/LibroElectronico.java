/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.cristina;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author cristina
 */
public class LibroElectronico {

    //Atributos, campos, propiedades parametrizados
    private String identificador;
    private String titulo;
    private int numPaginas;
    private double espacioOcupado;
    private int pagActual;

    //Métodos
    //pasarPagina(), que pasa a la siguiente página.
    public void pasarPagina() {
        if (this.pagActual < this.numPaginas) {
            this.pagActual++;
        } else {
        }
    }

    //retrocederPagina(), que retrocede una página.
    public void retrocederPagina() {
        if (this.pagActual > 0) {
            this.pagActual--;
        } else {
        }
    }

    //saltar(int numero), que salta hacia adelante (si el parámetro numero es 
    //positivo) o hacia atrás (si el parámetro numero es negativo) tantas 
    //páginas como indique el parámetro.
    public void saltar(int numero) {
        //Si el número metido por parámetros es negativo se mete en el if
        if (numero < 0) {
            //hace la resta y mira si se puede mover para atrás o no
            int resultado = pagActual - Math.abs(numero);
            //Si es menor que cero(no sería correcto el num de paǵinas)
            if (resultado < 0) {
                //Se mueve al inicio
                this.setPagActual(1);
            } else {
                //Si no, se mueve correctamente
                this.setPagActual(resultado);
            }
        } else {
            if (pagActual + numero > numPaginas) {
                this.setPagActual(numPaginas);
            } else {
                this.setPagActual(pagActual + numero);
            }
        }
    }

    //Construtores
    //Sin parametrizar(por defecto)
    public LibroElectronico() {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.titulo = "Don Quijote de la Mancha";
        this.numPaginas = 1435;
        this.espacioOcupado = 5;
        this.pagActual = 1;
    }

    //Parametrizado
    public LibroElectronico(String titulo, int numPaginas, double espacioOcupado) {
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.titulo = titulo;
        //En caso de crear libros de más de 9999 páginas o más de 10 MB, 
        //se deben establecer estos valores a cero.
        if (numPaginas < 0 || numPaginas > 9999) {
            this.numPaginas = 0;
        } else {
            this.numPaginas = numPaginas;
        }

        if (espacioOcupado < 0 || espacioOcupado > 10) {
            this.espacioOcupado = 0;
        } else {
            this.espacioOcupado = espacioOcupado;
        }

        this.pagActual = 1;
    }

    //getters y setters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas < 0 || numPaginas > 9999) {
            this.numPaginas = 0;
        } else {
            this.numPaginas = numPaginas;
        }
    }

    public double getEspacioOcupado() {
        return espacioOcupado;
    }

    public void setEspacioOcupado(double espacioOcupado) {
        if (espacioOcupado < 0 || espacioOcupado > 10) {
            this.espacioOcupado = 0;
        } else {
            this.espacioOcupado = espacioOcupado;
        }
    }

    public int getPagActual() {
        return pagActual;
    }

    public void setPagActual(int pagActual) {
        if (pagActual < 0) {
            this.pagActual = 1;
        }
        this.pagActual = pagActual;
    }

    //toString
    @Override
    public String toString() {
        return "LibroElectronico{" + "identificador=" + identificador
                + ", titulo=" + titulo + ", numPaginas=" + numPaginas
                + ", espacioOcupado=" + espacioOcupado + ", pagActual=" + pagActual + '}';
    }

    //Cuando aparece public se puede ver este atributo o método desde todo el 
    //proyecto, incluyendo otros paquetes.
    //Cuando aparece private únicamente se puede ver el atributo o método 
    //desde la clase en la que se ha creado.
}
