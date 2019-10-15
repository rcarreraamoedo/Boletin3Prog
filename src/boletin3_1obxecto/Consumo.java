

package boletin3_1obxecto;


public class Consumo {
    // parametros
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    // constructores
    public Consumo(){
    
    }
    public Consumo(float k, float l, float vM, float pG){
        km = k;
        litros = l;
        vMed = vM;
        pGas = pG;
    }
    //Amosar características
    public void amosar(){
    System.out.println("KM:"+km+" litros:"+litros+" vMed:"+vMed+" pGas:"+pGas);
    }
      // métodos de acceso con getters y setters
    public void setkm(float k){
        km = k;
    }
    public void setlitros(float l){
        litros = l;
    }
    public void setvMed(float vM){
        vMed = vM;
    }
    public void setpGas(float pG){
        pGas = pG;
    }
    public float getkm(){
        return km;
    }
    public float getlitros(){
        return litros;
    }
    public float getvMed(){
        return vMed;
    }
    public float getpGas(){
        return pGas;
    }
    
    public float consuMedio(){
        float consu = 100*litros/km;
        return consu;
    }
    public float consuEuros(){
        float consuE = 100*litros/pGas;
        return consuE;
    }
    
}

