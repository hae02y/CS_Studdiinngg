package mvppattern;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorView view) {
        this.model = new CalculatorModel();
        this.view = view;
    }

    public void onAdd(float a, float b) {
        float result = model.add(a, b);
        view.displayResult(result);
    }
}
