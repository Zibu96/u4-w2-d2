import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ESERCIZIO 1
        Set<String> parola = new HashSet<>();
        List<String> parolaDoppia = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quante parole vorresti aggiungere?");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Digita la parola che vuoi aggiungere");
            String word = scanner.nextLine();
            if (parola.add(word)) {
                parola.add(word);

            } else parolaDoppia.add(word);
        }
        System.out.println("questo è l'array generato " + parola);
        System.out.println("l'array è formato da " + parola.size() + " parole");
        if (!parolaDoppia.isEmpty()) {
            System.out.println("Attenzione, queste parole le hai scritte più volte: " + parolaDoppia);
        }


//        ESERCIZIO 2
        List<Integer> numeri = new ArrayList<>();
        int num1 = 18;
        for (int i = 0; i < num1; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(100);
            numeri.add(randomNum);
            Collections.sort(numeri);
        }
        System.out.println(numeri);


        Main.numeriSecond(numeri);
        Main.pariDispari(numeri, true);
    }

    public static void numeriSecond(List<Integer> list) {
        List<Integer> numeriInversi = new ArrayList<>(list.reversed());
        System.out.println(numeriInversi);
    }

    public static void pariDispari(List<Integer> list, Boolean toF) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int numb = iterator.next();
            if (toF && numb % 2 == 1) {
                iterator.remove();
                System.out.println("lista numeri pari" + list);
            } else if (!toF && numb % 2 == 0) {
                iterator.remove();
                System.out.println("lista numeri dispari" + list);
            }
        }
    }

    ;

}

