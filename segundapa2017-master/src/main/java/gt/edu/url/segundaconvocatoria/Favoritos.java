/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

/**
 *
 * @author Felipe
 */

// clase favoritos cumple con contrato interfaz Favorite List y todos sus metodos
public class Favoritos<E> implements FavoriteList<E> {

    
    LinkedPositionalList ListaFavoritos = new LinkedPositionalList(); // instanciacion de la linked positional list (LISTA FAVORITOS)
    
    int Contadorfav1 = 0;  // contador que lleva la cuenta de favoritos
    
    @Override
    
    // metodo para agregar a favoritos
    public void access(E e) {

        for (int i = 0; i <ListaFavoritos.size() ; i++) {
            
            if (ListaFavoritos.first().getElement().equals(e)) {   //ESTA LINEA COMPARA SI EL ELEMENTO YA EESTA EN LA LISTA           

            }
  
            else{
        
                ListaFavoritos.addFirst(e); // sino no esta en la lasita lo ANIADE DE UNA
        
            }
        
    
                }
    }

    @Override
    public void remove(E e) {
                for (int i = 0; i <ListaFavoritos.size() ; i++) {   // recorre la lista
            
            if (ListaFavoritos.first().getElement().equals(e)) {   //ESTA LINEA COMPARA SI EL ELEMENTO YA EESTA EN LA LISTA           
              
                // contador que implementa depues de haber econtrado elemento e en la lista 
                
               ListaFavoritos.remove(p);
                
            }
                }
    }

    @Override
    public Iterable<E> getFavorites(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    @Override
    public Iterable getFavorites(int k) {
        
        return null;
        
    }

    
}
