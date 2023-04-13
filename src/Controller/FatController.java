package Controller;

import Biblioteca.PilhaInt.Pilha;

public class FatController {

    public FatController(){
        super();
    }

    public int CalcFatorial(int valor){
        Pilha pilhaint= new Pilha();
        int fat= 1;
        while (valor > 0){
            pilhaint.push(valor);
            valor--;
        }
        while (!pilhaint.isEmpty()){
            try {
                valor= pilhaint.pop();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            fat*= valor; //fat= fat * valor
        }
        return fat;
    }
}
