public class Carro extends Veiculo{

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Partida no carro.");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível.");
    };
    private void confereCambio(){
        System.out.println("Conferindo em P.");
    };
    
    }
