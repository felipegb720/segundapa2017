/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Felipe
 */ // class Name: ADT
public class ADT<E> implements DoubleStack<E> {  // implementa la interfaz double stack con todos sus metodos

    public static final int CAPACITY=1000; // this is the capacity of the dynamic stack de todas maneras tiene 16 inicial
	
    private E[ ] BlueStack;   // nombre del array stack que cree BLUE  
    private E[ ] RedStack;   // nombre del array stack que cree ROJO

	public ADT() {
		this(CAPACITY); // aqui le asigno su capacidad inicial a los stack 
	}

        private int RedSize=-1;    // Estos 2 metodos me van a llevar la cuenta del size de mis 2 stacks y tambien sirven para el MEtodo Size()
        private int BlueSize=-1;

        
	public ADT(int capacity) {
		
            BlueStack= (E[]) new Object[capacity];
                
            RedStack= (E[]) new Object[capacity];
	}
    // devuelve boleano si esta vacio o no 
    @Override
    public boolean isEmpty() {
        return (RedSize == -1);
    }

    //devuelve el tamanio actual
    @Override
    public int redSize() {  
         return RedSize+1; 
    }

    
    // inserta datos
    @Override
    public void redPush(Object e) {
    RedStack[++RedSize] = (E) e;    
    }

    @Override
    public E redTop() {
                if (isEmpty()) return null;
		return RedStack[RedSize];
    }

    @Override
    public E redPop() {
        if (isEmpty()) return null;
		E response = RedStack[RedSize];
		RedStack[RedSize] = null;
		RedSize--;
		return response;
    }
// retorna tamanio stack azul
    @Override
    public int blueSize() {  
         return BlueSize+1; 
        
    }

    @Override
    public void bluePush(Object e) {   // metodo inserta
            BlueStack[++BlueSize] = (E) e;    

    }

    @Override
    public E blueTop() {     // devuelve el primero top
          if (isEmpty()) return null;
		return BlueStack[BlueSize];
    }

    @Override
    public E bluePop() {  // saca elemento del stack
        if (isEmpty()) return null;
		E response = BlueStack[BlueSize];
		BlueStack[BlueSize] = null;
		BlueSize--;
		return response;
    }
    
}
