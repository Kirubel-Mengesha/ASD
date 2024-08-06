public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text textComponent) {
        super(textComponent);
    }

    @Override
    public String render() {
        return "<i>" + textComponent.render() + "</i>";
    }
}
