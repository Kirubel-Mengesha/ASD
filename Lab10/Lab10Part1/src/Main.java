public class Main {
    public static void main(String[] args) {
        Text text = new PlainText("Hello, World!");

        Text boldText = new BoldDecorator(text);
        System.out.println(boldText.render()); // <b>Hello, World!</b>

        Text italicBoldText = new ItalicDecorator(boldText);
        System.out.println(italicBoldText.render()); // <i><b>Hello, World!</b></i>

        Text fullDecoratedText = new StrikethroughDecorator(new UnderlineDecorator(italicBoldText));
        System.out.println(fullDecoratedText.render()); // <s><u><i><b>Hello, World!</b></i></u></s>
    }
}