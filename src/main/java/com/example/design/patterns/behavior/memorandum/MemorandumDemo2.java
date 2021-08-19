package com.example.design.patterns.behavior.memorandum;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Description:
 * @Date: 2021/8/16 15:54
 */
public class MemorandumDemo2 {

    public static void main(String[] args) {
        InputText inputText = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.getText());
            } else if (input.equals(":undo")) {
                InputText snapshot = snapshotsHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else {
                snapshotsHolder.pushSnapshot(inputText);
                inputText.append(input);
            }
        }
    }

    public static class InputText {
        private StringBuilder text = new StringBuilder();

        public String getText() {
            return text.toString();
        }

        public void append(String input) {
            text.append(input);
        }

        public void setText(String text) {
            this.text.replace(0, this.text.length(), text);
        }
    }

    public static class SnapshotHolder {
        private Stack<InputText> snapshots = new Stack<>();

        public InputText popSnapshot() {
            return snapshots.pop();
        }

        public void pushSnapshot(InputText inputText) {
            InputText deepClonedInputText = new InputText();
            deepClonedInputText.setText(inputText.getText());
            snapshots.push(deepClonedInputText);
        }
    }
}
