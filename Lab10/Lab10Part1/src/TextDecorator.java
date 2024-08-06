public abstract class TextDecorator implements Text {
    protected Text textComponent;

    public TextDecorator(Text textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String render() {
        return textComponent.render();
    }
}
