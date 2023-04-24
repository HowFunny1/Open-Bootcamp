public class main {
    int numero = 0;

    if (numero<0){
        System.out.println("variable" + numero + " es negativo");
    }
    else if(numero>0){
        System.out.println("variable" + numero + " es positivo");
    }else{
        System.out.println("variable es igual a 0"
    }

    int numerowhile = 1;

    while(numerowhile < 3){
        numerowhile++;
        System.out.println("variable while es " + numerowhile);
    }

    int numeroDoWhile = 3;
    do{
        numeroDoWhile++;
        System.out.println("variable Dowhile " + numeroDoWhile);
    }while(numeroDoWhile < 3);

    for(int numefor = 0; numefor <=5; numefor++) {
        System.out.println("variable for es " + numefor);}

    String estacion = "otoño";
    switch(estacion) {
        case "primavera";
            System.out.println("orimavera");
            break;
        case "verano";
            System.out.println("verano");
            break;
        case "otoño";
            System.out.println("otoño");
            break;
        case "invierno";
            System.out.println("invierno");
            break;
        default:
            System.out.println("no hay estacion");
}