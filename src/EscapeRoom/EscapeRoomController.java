package EscapeRoom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EscapeRoomController {

    Room room = new Room(new Window(), new Key(), new Doors());
    private EscapeRoomService escapeRoomService = new EscapeRoomService(room);
    int option;


    public void run() {
        do {
            printWelcomeMessage();
            option = chooseOption();
            validateOption(option);
        }while (!room.getDoors().isOpen());
    }


    private void printWelcomeMessage(){
        System.out.println("Welcome in Escape room, in order to win you need to open the doors.");
        System.out.println("1 - to use window");
        System.out.println("2 - to open the doors");
        if (!room.getKey().isDoIHaveKey()){
            System.out.println("3 - to get a key");
        }

    }

    private int chooseOption(){
        try {
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            return choice;
        }catch (InputMismatchException e){

        }

        return 0;
    }

    public void validateOption(int option){
        switch (option){
            case 1:
                escapeRoomService.useWindow();
                break;
            case 2:
                escapeRoomService.openDoors();
                break;
            case 3:
                escapeRoomService.getAKey();
                break;
            default:
                System.out.println("Option chosen by you doesn't exist");
        }

    }
}
