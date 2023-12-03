import java.util.Scanner;

public class VirtualPetApp {
    public static void main(String[] args) {
        int select;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the world of being a pet owner i hope you're ready. Owning a pet takes a lot of work! Enter your dogs name");
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
                    System.out.println("You need to show more love to " + dogName + "!");
                    continue;
                }
                System.out.println(dogName + " Really enjoyed that walk!");
                dog.changeAttention(+1);
                dog.changeEnergy(-1);
                dog.changeHygiene(-1);
                showDogCurrentNeeds(dog);
            }
            else if ( select == 1){
                if (dog.getHunger() > 5){
                    System.out.println(dogName + " isn't hungry right now.");
                    continue;
                }
                System.out.println(dogName + " Loved that treat and wags his tail happily!");
                dog.changeHunger(+1);
                dog.changeEnergy(+1);
                dog.changeAttention(+1);
                dog.changeThirst(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 2){
                if (dog.getThirst() > 5){
                    System.out.println(dogName + " does'nt want any water right now");
                    continue;
                }
                System.out.println(dogName + " really enjoyed that water and thanks you with a happy bark!");
                dog.changeThirst(+1);
                dog.changeBladder(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 3){
                if (dog.getAttention() > 5){
                    System.out.println(dogName + " does'nt want to play right now.");
                    continue;
                }
                dog.changeAttention(+1);
                dog.changeEnergy(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 4){
                if (dog.getBladder() > 5){
                    System.out.println(dogName + " does'nt need to go to the bathroom yet.");
                    continue;
                }
                System.out.println(dogName + " is really happy you let him out to use the bathroom!");
                dog.changeBladder(+1);
                dog.changeHygiene(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 5){
                if (dog.getEnergy() > 5){
                    System.out.println("Rest is not needed for " + dogName + " right now.");
                    continue;
                }
                System.out.println(dogName + " Enjoyed his nap a lot and is wagging his tail happily!");
                dog.changeEnergy(+2);
                dog.changeHunger(-1);
                dog.changeThirst(-1);
                dog.changeBladder(-1);
                showDogCurrentNeeds(dog);
            }
            else if (select == 6){
                if (dog.getHygiene() > 5){
                    System.out.println("Your " + dogName + " still has a clean and shiny coat!");
                    continue;
                }
                System.out.println(dogName + " Enjoyed his grooming a lot is jumping in excitement");
                dog.changeHygiene(+1);
                dog.changeEnergy(-1);
                showDogCurrentNeeds(dog);
            } else {
                System.out.println("You need to choose a proper input please try again.");
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