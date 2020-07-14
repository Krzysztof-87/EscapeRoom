package EscapeRoom;

public class Room {


        private Window window;
        private Key key;
        private Doors doors;


        public Room(Window window, Key key, Doors doors) {
            this.window = window;
            this.key = key;
            this.doors = doors;
        }

        public Window getWindow() {
            return window;
        }

        public Key getKey() {
            return key;
        }

        public Doors getDoors() {
            return doors;
        }

        @Override
        public String toString() {
            return "Room{" +
                    "window=" + window +
                    ", key=" + key +
                    ", doors=" + doors +
                    '}';

    }
}
