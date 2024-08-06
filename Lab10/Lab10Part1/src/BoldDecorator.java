public class BoldDecorator extends TextDecorator {
    public BoldDecorator(Text textComponent) {
        super(textComponent);
    }

    @Override
    public String render() {
        return "<b>" + textComponent.render() + "</b>";
    }
}
