import java.util.Scanner; 

public class CompraCafeteria { 

    public static void main(String[] args) { 

        Scanner entrada = new Scanner(System.in); 

        System.out.println("COMPRA EN LA CAFETERIA UNIVERSITARIA"); 

        System.out.print("Ingrese el nombre del producto: "); 

        String producto = entrada.nextLine(); 

        System.out.print("Ingrese el precio del producto: $"); 

        double precio = entrada.nextDouble(); 

        System.out.print("Ingrese la cantidad de unidades: "); 

        int cantidad = entrada.nextInt(); 

        System.out.print("Ingrese el dinero entregado: $"); 

        double dinero = entrada.nextDouble(); 

        double subtotal = precio * cantidad; 

        double descuento = subtotal * 0.10; 

        double total = subtotal - descuento; 

        if (dinero >= total) { 

            double cambio = dinero - total; 

            System.out.println("\n=== RESUMEN DE LA COMPRA ==="); 

            System.out.println("Producto: " + producto); 

            System.out.println("Cantidad: " + cantidad); 

            System.out.printf("Precio unitario: $%.2f%n", precio); 

            System.out.printf("Subtotal: $%.2f%n", subtotal); 

            System.out.printf("Descuento (10%%): $%.2f%n", descuento); 

            System.out.printf("Total a pagar: $%.2f%n", total); 

            System.out.printf("Dinero entregado: $%.2f%n", dinero); 

            System.out.printf("Cambio: $%.2f%n", cambio); 

        } else { 

            double faltante = total - dinero; 

            System.out.println("\n=== PAGO INSUFICIENTE ==="); 

            System.out.printf("Total a pagar: $%.2f%n", total); 

            System.out.printf("Dinero entregado: $%.2f%n", dinero); 

            System.out.printf("Dinero faltante: $%.2f%n", faltante); 

        } 

        entrada.close(); 

    } 

} 