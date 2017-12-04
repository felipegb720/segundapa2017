package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author tuxtor
 */

// INTERFAZ GENERICA <E> PARA LA IMPLEMENTACION DE METOS PARA LOS 2 STACKS 

public interface DoubleStack<E> {
    
        boolean isEmpty();
    // metodos para el stack rojo
        
	// devuelve tamanio
        int redSize();
        // ingresa datos
	void redPush(E e);
	// devuelve top del stack
        E redTop();
        // remueve dato <E> del stack
	E redPop();
        	
// devuelve tamanio

        int blueSize();
        // ingresa datos
	void bluePush(E e);
        // devuelve top del stack
	E blueTop();
        // remueve dato <E> del stack
	E bluePop();
}
