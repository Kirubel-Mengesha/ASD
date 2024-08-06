public class StrikethroughDecorator extends TextDecorator {
    public StrikethroughDecorator(Text textComponent) {
        super(textComponent);
    }

    @Override
    public String render() {
        return "<s>" + textComponent.render() + "</s>";
    }
}
