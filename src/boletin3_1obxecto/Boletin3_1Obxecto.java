
package boletin3_1obxecto;


public class Boletin3_1Obxecto {

    public static void main(String[] args) {
        //Constructor, creando un obxecto Consumo
        Consumo obxConsumo1 = new Consumo();
        //Amosamos constructor sen parámetros
        obxConsumo1.amosar();
        obxConsumo1.setkm(50f);
        obxConsumo1.setpGas(1.57f);
        //Damos valores a litros e prezo da gasolina
        obxConsumo1.amosar();
        //Mostrar o consumo medio
        Consumo obxConsumo2 = new Consumo(30,50,90.4f,7.3f);
        float valor=obxConsumo2.consuMedio();
        System.out.println("Consumo Medio = "+valor);
        //Variar o valor de litros consumidos
        obxConsumo2.setlitros(10);
        obxConsumo2.amosar();
       //Se visualiza a velocidade media
        //También se puede hacer --> //float var=obxConsumo2.getvMed();
        System.out.println("Velocidade media = "+ obxConsumo2.getvMed());
        //Mostar o consumo medio en euros
        //También se puede hacer --> float valor2=obxConsumo2.consuEuros();
        System.out.println("Consumo Medio Euros = "+obxConsumo2.consuEuros()+"€");
    }
    
}
