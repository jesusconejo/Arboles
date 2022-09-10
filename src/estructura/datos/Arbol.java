package estructura.datos;

    public class Arbol {

    Nodo raiz;
    String name;
    public Arbol(String name){
        this.name=name;
        raiz=null;
    }

       public class Nodo{
        public Nodo padre;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public Object contenido;

        public Nodo(int index){
            llave=index;
            derecha=null;
            izquierda=null;
            padre=null;
            contenido=null;

        }
           public boolean isHoja(){
               return (derecha==null && izquierda==null);
           }



    }
        public void insertar(int index, Object fruit){
            Nodo n = new Nodo(index);
            n.contenido=fruit;
            if(raiz==null){
                raiz=n;
            }else{
                Nodo nodoAux = raiz;
                while(nodoAux!=null){
                    n.padre=nodoAux;
                    if(n.llave >= nodoAux.llave){
                        nodoAux=nodoAux.derecha;
                    }else{
                        nodoAux=nodoAux.izquierda;
                    }
                }
                if(n.llave< n.padre.llave){
                    n.padre.izquierda= n;
                }else{
                    n.padre.derecha=n;
                }
            }
        }

        public void viewInOrder(Nodo n){
            if(n != null){
                viewInOrder(n.izquierda);
                System.out.println("Index "+n.llave+" fruit "+n.contenido);
                viewInOrder(n.derecha);
            }

        }
        public int contadorNodos(Nodo nodoAux){
            if(nodoAux!=null){
                int nodosIzquerdos = contadorNodos(nodoAux.izquierda);
                int nodosDerechos = contadorNodos(nodoAux.derecha);
                int contador = nodosIzquerdos+nodosDerechos+1;
                return contador;
            }
        return 0;
        }

        public int alturaArbol(Nodo nodoAux){
            if(nodoAux!=null){
                return 1 + Math.max(alturaArbol(nodoAux.izquierda),alturaArbol(nodoAux.derecha));
            }
            return 0;
        }
        public int peso (Nodo auxNodo){
        int peso = 0;
            if(auxNodo.isHoja()){
                return 1;
            }else{
                if(auxNodo.izquierda!=null){
                    peso += peso(auxNodo.izquierda);
                }
                if(auxNodo.derecha!=null){
                    peso += peso(auxNodo.derecha);
                }
                return peso;
            }

        }

}
