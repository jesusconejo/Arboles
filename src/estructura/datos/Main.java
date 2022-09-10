package estructura.datos;

public class Main {

    public static void main(String[] args) {
        // Se ingresan los arboles:::::
	    Arbol fruits = new Arbol("Frutas");
        fruits.insertar(4,"Orange");
        fruits.insertar(8,"Apple");
        fruits.insertar(1,"Grape");
        fruits.insertar(9,"Watermelon");
        fruits.insertar(7,"Pear");

        Arbol flowers = new Arbol("Flores");
        flowers.insertar(12,"Flower_Red");
        flowers.insertar(18,"Flower_Blue");
        flowers.insertar(10,"Flower_White");
        flowers.insertar(9,"Flower_Green");
        flowers.insertar(7,"Flower_Pink");
        flowers.insertar(5,"Flower_Violet");

        Arbol animales = new Arbol("Animales");
        animales.insertar(8,"Dog");
        animales.insertar(16,"Cat");
        animales.insertar(2,"Tiger");
        animales.insertar(18,"Leon");
        animales.insertar(14,"Wolf");

        //Se obtiene la altura de un arbol
        int alturaArbol = fruits.alturaArbol(fruits.raiz);
        System.out.println("\nAltura del Arbol "+fruits.name+" es: "+alturaArbol);
        //Se obtiene la cantidad de nodos de un arbol
        int cantidadNodos = flowers.contadorNodos(flowers.raiz);
        System.out.println("\nCantidad de Nodos del Arbol "+flowers.name+" es: "+cantidadNodos);
        //Se obtiene el peso de un arbol
        int pesoArbol = animales.peso(animales.raiz);
        System.out.println("\nPeso del Arbol "+animales.name+" es: "+pesoArbol);
        //Se comparan 2 arboles similares
        if(isSimilar(fruits, animales)){
            System.out.println("\nLos Arboles "+fruits.name+" y "+animales.name+" son similares");
        }else{
            System.out.println("\nLos Arboles "+fruits.name+" y "+animales.name+"NO son similares");
        }
        // se comparan 2 arboles que no son similares
        if(isSimilar(fruits, flowers)){
            System.out.println("\nLos Arboles "+fruits.name+" y "+flowers.name+" son similares");
        }else{
            System.out.println("\nLos Arboles "+fruits.name+" y "+flowers.name+"NO son similares");
        }
       /* System.out.println("Se recorre en orden desde el nodo raiz");
        tree.viewInOrder(tree.raiz); // Se recorre desde la Raiz

        System.out.println("\n Se recorre la rama izquierda");
        tree.viewInOrder(tree.raiz.izquierda);//Se recorre solo rama izquierda

        System.out.println("\n Se recorre la rama derecha");
        tree.viewInOrder(tree.raiz.derecha);*/

    }

    /*
    @Metodo o fucnion que determina sin 2 arboles son similares
     */
    public static boolean isSimilar(Arbol a, Arbol b){

        if(a.raiz==null && b.raiz==null){
            return true;
        }else if((a.raiz==null || b.raiz==null)){
            return  false;


        }else{
            if(a.contadorNodos(a.raiz)==b.contadorNodos(b.raiz) && a.alturaArbol(a.raiz)==b.alturaArbol(b.raiz) && a.peso(a.raiz)==b.peso(b.raiz) ){
                return true;
            }else{
                return false;
            }
        }


    }
}
