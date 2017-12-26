package org.rajesh.objcreation.builder;

public class DigitalDeveloper extends Developer{
    private int presentations;
    private DigitalDeveloper(Builder builder) {
        super(builder);
        this.presentations = builder.presentations;
    }

    public static class Builder extends Developer.Builder<Builder>{
        private final int presentations;

        public Builder(int presentations) {
            this.presentations = presentations;
        }

        @Override
        public DigitalDeveloper build() {
            return new DigitalDeveloper(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}
