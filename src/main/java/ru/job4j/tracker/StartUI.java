package ru.job4j.tracker;

import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select:");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Input validInput = new ValidateInput(output, input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
            new CreateAction(output),
            new FindAllAction(output),
            new ReplaceItemAction(output),
            new DeleteItemAction(output),
            new FindItembyIdAction(output),
            new FindByNameAction(output),
            new ExitAction(output));
        new StartUI(output).init(validInput, tracker, actions);
    }
}