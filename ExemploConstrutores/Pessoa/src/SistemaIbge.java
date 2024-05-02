public class SistemaIbge {
public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values())
    System.out.println(e.getNome() + " - " + e.getNomeMaiusculo());

    EstadoBrasileiro eb = EstadoBrasileiro.SERGIPE;
    System.out.println(eb.getNomeMaiusculo());

    }

}
