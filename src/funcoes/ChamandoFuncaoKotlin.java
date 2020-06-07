package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

//Class java , obs que não há problema de ter uma class java dentro de um projeto kotlin
//Tenho que seguir as regras do java
public class ChamandoFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("João", "Maria", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
