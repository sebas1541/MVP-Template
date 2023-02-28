package presenter;
import model.Model;
import view.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter() {
        model = new Model();
        view = new View();
    }

    /* public void run() {
        int option = 0;
        while (option != 3) {
            option = showMenu();
            switch (option) {
                case 1:
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                case 3:
                    end();
                    break;
            }
        }
    } */

    public int showMenu() {
        int option = view.readInt("Main menu \n1 action1 \n2 action2 \n3 end \n\nInsert option");
        return option;
    }

    /*public void methodName(){
    }
     */

}