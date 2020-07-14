package EscapeRoom;

public class Window {

        private boolean open;

        public void useWindow(){
            if (open){
                System.out.println("Window has been closed");
            }else
                System.out.println("Window has been open");
            open=!open;
        }

        @Override
        public String toString() {
            return "Window{" +
                    "open=" + open +
                    '}';
        }
}
