package objects;
public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        Controller controller = new Controller();
        MainView mainView = new MainView();

        controller.initDataManager();
        mainView.displayData();
    }
}
