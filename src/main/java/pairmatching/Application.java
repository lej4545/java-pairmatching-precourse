package pairmatching;

import pairmatching.controller.MainController;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        MainController mainController = new MainController();
        mainController.run();
    }
}
