// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BMExercicio04 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(50.0f, 50, "Branca", "Philips");
        System.out.printf("Lampada %s, %s, de %dw, por RS %.2f", lampada.getMarca(), lampada.getCor(), lampada.getPotencia(), lampada.getPreco());

    }
}