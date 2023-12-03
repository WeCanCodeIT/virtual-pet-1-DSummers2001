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
            System.out.println("What would you like to do!");
            System.out.println("[0] Go for a walk with " + dogName + " don't forget the leash.");
            System.out.println("[1] Feed " + dogName + " his favorite doggy snacks!");
            System.out.println("[2] Get " + dogName + " some clean water.");
            System.out.println("[3] Play with " + dogName + " using their favorite toy!");
            System.out.println("[4] Let " + dogName + " out to use the bathroom.");
            System.out.println("[5] Let " + dogName + " get some rest.");
            System.out.println("[6] Groom " + dogName + "'s precious coat!");
            System.out.println("[7] Quit :( ");

            select = userInput.nextInt();

            if (select == 7){
                continue;
            } 
            else if (select == 0){
                if (dog.getAttention() < 5){
                    System.out.println("You might need to show more love to " + dogName + "!");
                    continue;
                }
                System.out.println(dogName + " Really enjoyed that walk!");
                dog.changeAttention(+1);
                dog.changeEnergy(-1);
                dog.changeHygiene(-1);
            }
            else if ( select == 1){
                
            }


            dog.tick();
        } while (select != 7);

        userInput.close();
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