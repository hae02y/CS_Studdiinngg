package mvppattern;

public class MVPpattern implements CalculatorView {

    @Override
    public void displayResult(float result) {
        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        MVPpattern mvppattern = new MVPpattern();
        CalculatorPresenter presenter = new CalculatorPresenter(mvppattern);
        presenter.onAdd(709, 907);
    }
}
