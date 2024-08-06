public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(Text textComponent) {
        super(textComponent);
    }

    @Override
    public String render() {
        return "<u>" + textComponent.render() + "</u>";
    }
}
