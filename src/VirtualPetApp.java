import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        int select;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the world of being a pet owner i hope you're ready. Owning a pet takes a lot of work! Enter your dogs' name: ");
        String dogName = userInput.nextLine();

        VirtualPet dog = new VirtualPet(dogName);

        // instructions
        needsMenu(dogName);


        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            select = userInput.nextInt();




            dog.tick();
        } while (select != 7);


    }

    private static void showDogCurrentNeeds(VirtualPet dog){
        System.out.println("Hunger: " + dog.getHunger());
        System.out.println("Thirst: " + dog.getThirst());
        System.out.println("Attention: " + dog.getAttention());
        System.out.println("Bladder: " + dog.getBladder());
        System.out.println("Energy: " + dog.getEnergy());
        System.out.println("Hygiene: " + dog.getHygiene());
    }


    public static void needsMenu(String dogName)
    {
        System.out.println(
                "-----------------------------------------------------------------------------------------------" +
                        "\n>> Welcome and also get ready! You are now the proud new owner of "  + dogName + "!" +
                        "                                  \n" +
                        "                            |' \\ \n" +
                        "         _                  ; : ; \n" +
                        "        / `-.              /: : | \n" +
                        "       |  ,-.`-.          ,': : | \n" +
                        "       \\  :  `. `.       ,'-. : | \n" +
                        "        \\ ;    ;  `-.__,'    `-.| \n" +
                        "         \\ ;   ;  :::  ,::'`:.  `. \n" +
                        "          \\ `-. :  `    :.    `.  \\ \n" +
                        "           \\   \\    ,   ;   ,:    (\\ \n" +
                        "            \\   :., :.    ,'o)): ` `-. \n" +
                        "           ,/,' ;' ,::\"'`.`---'   `.  `-._ \n" +
                        "         ,/  :  ; '\"      `;'          ,--`. \n" +
                        "        ;/   :; ;             ,:'     (   ,:) \n" +
                        "          ,.,:.    ; ,:.,  ,-._ `.     \\\"\"'/ \n" +
                        "          '::'     `:'`  ,'(  \\`._____.-'\"' \n" +
                        "             ;,   ;  `.  `. `._`-.  \\\\ \n" +
                        "             ;:.  ;:       `-._`-.\\  \\`. \n" +
                        "              '`:. :        |' `. `\\  ) \\ \n" +
                        "                ` ;:       |    `--\\__,' \n" +
                        "                   '`      ,' \n" +
                        "                        ,-' " +
                        "\n>> Remember, " + dogName + " has needs! Being a pet owner takes a lot of responsibility." +
                        "\n>> " + dogName + " needs water, food, sleep, grooming, playtime, and lot's of attention." +
                        "\n>> Good luck! and have fun!" +
                        "\n-----------------------------------------------------------------------------------------------"
        );
    }


}