public class break_continue {
    public static void main(String[] args) {
        for (var counter = 0; counter <= 5 ; counter ++){
            if (counter % 2 != 0){
                continue;//ir a la siguiente iteracion de nuestro ciclo
            }
            System.out.println("counter = " + counter);
        }

 //       for (var counter = 0; counter <= 5 ; counter ++){
//            if (counter % 2 == 0){
//                System.out.println("counter = " + counter);
//                break;
//            }
//        }
    }
}
