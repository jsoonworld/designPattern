package designPattern.store.v2.view.input;

import java.util.Scanner;

public class SelectionStoreInputView {
    private Scanner scanner;

    public SelectionStoreInputView() {
        this.scanner = new Scanner(System.in);
    }

    public String receiveUserInput() {
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }
}
