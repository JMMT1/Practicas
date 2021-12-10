/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_arbol_b;

/**
 *
 * @author Admin
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null; //Arbol vacio
    }
    
    //A partir de aqui todo es recursivo
    //AGREGAR NODO:
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //VERIFICAMOS SI HAY NODOS EN EL ARBOL
        if(root == null){//ARBOl VACIO
            root = nuevo;
        }else{//HAY NODOS
            //metodo recursivo para agregar nodos
            addRecu(root, nuevo);
        }
    }
    
    //metodo recursivo (nodo actual, nodo nuevo)
    private void addRecu(Nodo actual, Nodo nuevo){
        //VERIFICAR EL LADO AL QUE VA EL NODO
        if(nuevo.getDato() < actual.getDato()){//IZQUIERDA: VALOR NUEVO MENOR QUE NODO ACTUAL
            if(actual.getIzquierda() == null){//TENEMO ESPACIO, AQUI INSERTEMOS EL NODO NUEVO
                actual.setIzquierda(nuevo);
            }else{//Llamar al nuevo metodo recursivo, pero moviendome a la izquierda
                addRecu(actual.getIzquierda(), nuevo);
            }
        }else if(nuevo.getDato() > actual.getDato()){//IZQUIERDA: VALOR NUEVO MENOR QUE NODO ACTUAL
            if(actual.getDerecha() == null){//TENEMO ESPACIO, AQUI INSERTEMOS EL NODO NUEVO
                actual.setDerecha(nuevo);
            }else{//Llamar al nuevo metodo recursivo, pero moviendome a la izquierda
                addRecu(actual.getDerecha(), nuevo);
            }    
            
        }else{//VALOR IGUAL AL ACTUAL 
            System.out.println("El valor ya existe en el arbol");
            
        }
    }
    
    //IMPRIMIR NODOS DEL ARBOL
    public void printPreOrder(){
        preOrder(root);//llama al metodo recursivo pre order
    }
    
    private void preOrder(Nodo actual){
        if(actual !=null){
            System.out.print("[" + actual.getDato() + "]");//visit node
            preOrder(actual.getIzquierda());//travers left subtree
            preOrder(actual.getDerecha());//travers right subtree
        }
    }
    /*HACEMOS METODOS:
    POST ORDER
    IN ORDER*/
    //IN ORDER
    public void printInOrder(){
        inOrder(root);//llama al metodo recursivo pre order
    }
    
    private void inOrder(Nodo actual){
        if(actual !=null){
            inOrder(actual.getIzquierda());//travers left subtree
            System.out.print("[" + actual.getDato() + "]");//visit node
            inOrder(actual.getDerecha());//travers right subtree
        }
    }    

}
